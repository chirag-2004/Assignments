interface Compar<T> {
    int compare(T a, T b);
}

interface Funct<T, K> {
    K call(T obj);
}

class DynamicEx<T, K> {
    private Funct<T, K> function;

    DynamicEx(Funct<T, K> function) {
        this.function = function;
    }

    K extract(T obj) {
        return function.call(obj);
    }
}

class ExtractComparator<T, K> implements Compar<T> {

    private DynamicEx<T, K> extractor;

    ExtractComparator(DynamicEx<T, K> extractor) {
        this.extractor = extractor;
    }

    @SuppressWarnings("unchecked")
    public int compare(T a, T b) {

        K val1 = extractor.extract(a);
        K val2 = extractor.extract(b);

        if (val1 == null && val2 == null) return 0;
        if (val1 == null) return -1;
        if (val2 == null) return 1;

        if (val1 instanceof Integer && val2 instanceof Integer) {
            return (Integer) val1 - (Integer) val2;
        }

        if (val1 instanceof String && val2 instanceof String) {

            String s1 = (String) val1;
            String s2 = (String) val2;

            int len = Math.min(s1.length(), s2.length());

            for (int i = 0; i < len; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return s1.charAt(i) - s2.charAt(i);
                }
            }

            return s1.length() - s2.length();
        }

        throw new RuntimeException("Unsupported type");
    }
}

class Sorter {

    public static <T> void bubbleSort(T[] arr, Compar<T> cmp) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (cmp.compare(arr[j], arr[j + 1]) > 0) {

                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class Student12345 {
    int id;
    String name;
    int age;

    Student12345(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }
}

public class Combination {

    public static void main(String[] args) {

        Student12345[] students = {
                new Student12345(3, "Rahul", 22),
                new Student12345(1, "Amit", 20),
                new Student12345(2, "Zara", 21)
        };

        DynamicEx<Student12345, Integer> idExtractor =
                new DynamicEx<>(s -> s.id);

        DynamicEx<Student12345, String> nameExtractor =
                new DynamicEx<>(s -> s.name);

        DynamicEx<Student12345, Integer> ageExtractor =
                new DynamicEx<>(s -> s.age);

        Compar<Student12345> sortById =
                new ExtractComparator<>(idExtractor);

        Compar<Student12345> sortByName =
                new ExtractComparator<>(nameExtractor);

        Compar<Student12345> sortByAge =
                new ExtractComparator<>(ageExtractor);

        Sorter.bubbleSort(students, sortById);

        for (Student12345 s : students) {
            System.out.println(s);
        }
    }
}


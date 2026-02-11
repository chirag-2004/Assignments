interface Function<T, K> {
    K call(T obj);
}

class DynamicExtractor<T, K> {

    private Funct<T, K> function;

    DynamicExtractor(Funct<T, K> function){
        this.function = function;
    }

    K extract(T obj){
        return function.call(obj);
    }
}

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Student12345 s = new Student12345(1, "ABC", 23);
        // Extract Name
        DynamicEx<Student12345, String> nameEx =
                new DynamicEx<>(student -> student.name);
        // Extract ID
        DynamicEx<Student12345, Integer> idEx =
                new DynamicEx<>(student -> student.id);
        // Extract Age
        DynamicEx<Student12345, Integer> ageEx =
                new DynamicEx<>(student -> student.age);
        System.out.println("ID: " + idEx.extract(s));
        System.out.println("Name: " + nameEx.extract(s));
        System.out.println("Age: " + ageEx.extract(s));
    }
}

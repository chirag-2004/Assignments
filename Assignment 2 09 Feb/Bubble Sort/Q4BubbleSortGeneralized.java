// package newTrainer2;

class S {
    String name;
    int[] marks;

    S(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Q4BubbleSortGeneralized {

    public static void main(String[] args) {

        S[] students = {
            new S("Arjun", 91, 84, 77),
            new S("Kavya", 96, 88, 92, 85),
            new S("Rohan", 85, 79, 83),
            new S("Isha", 93, 81, 90),
            new S("Manav", 89, 94, 86, 88),
            new S("Diya", 97, 82, 84),
            new S("Yash", 88, 91, 80),
            new S("Nikita", 95, 87, 93),
            new S("Aditya", 86, 90, 82, 84),
            new S("Simran", 92, 89, 91),
            new S("Varun", 90, 85, 87),
            new S("Tanya", 94, 83, 88, 90)
        };

        bubbleSort(students);

        System.out.println("Students sorted by marks:");
        for (S s : students) {
            System.out.print(s.name + " -> ");
            for (int m : s.marks) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    static void bubbleSort(S[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (shouldSwap(students[j], students[j + 1])) {
                    S temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    static boolean shouldSwap(S s1, S s2) {
        int minLength = Math.min(s1.marks.length, s2.marks.length);

        for (int i = 0; i < minLength; i++) {
            if (s1.marks[i] < s2.marks[i]) return true;
            if (s1.marks[i] > s2.marks[i]) return false;
        }

        return s1.marks.length < s2.marks.length;
    }
}


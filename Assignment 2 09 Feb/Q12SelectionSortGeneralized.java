// package newTrainer2;

class Student8 {
    String name;
    int[] marks;

    Student8(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Q12SelectionSortGeneralized {

    public static void main(String[] args) {

        Student8[] students = {
            new Student8("Arjun", 91, 84, 77),
            new Student8("Kavya", 96, 88, 92, 85),
            new Student8("Rohan", 85, 79, 83),
            new Student8("Isha", 93, 81, 90),
            new Student8("Manav", 89, 94, 86, 88),
            new Student8("Diya", 97, 82, 84),
            new Student8("Yash", 88, 91, 80),
            new Student8("Nikita", 95, 87, 93),
            new Student8("Aditya", 86, 90, 82, 84),
            new Student8("Simran", 92, 89, 91),
            new Student8("Varun", 90, 85, 87),
            new Student8("Tanya", 94, 83, 88, 90)
        };

        selectionSort(students);

        System.out.println("Students sorted by marks:");
        for (Student8 s : students) {
            System.out.print(s.name + " -> ");
            for (int m : s.marks) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    static void selectionSort(Student8[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (shouldSwap(students[j], students[minIndex])) {
                    minIndex = j;
                }
            }

            Student8 temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
    }

    static boolean shouldSwap(Student8 s1, Student8 s2) {
        int minLength = Math.min(s1.marks.length, s2.marks.length);

        for (int i = 0; i < minLength; i++) {
            if (s1.marks[i] < s2.marks[i]) return true;
            if (s1.marks[i] > s2.marks[i]) return false;
        }

        return s1.marks.length < s2.marks.length;
    }
}

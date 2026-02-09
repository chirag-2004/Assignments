// package newTrainer2;

import java.util.Arrays;

class Student123 {
    String name;
    int[] marks;

    Student123(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Q11Sorting {

    public static void main(String[] args) {

        Student123[] students = {
            new Student123("Rahul",  new int[]{85, 78, 90}),
            new Student123("Sneha",  new int[]{85, 78, 88}),
            new Student123("Vikas",  new int[]{85, 65, 92}),
            new Student123("Pooja",  new int[]{90, 70, 85}),
            new Student123("Arjun",  new int[]{85, 78, 95}),
            new Student123("Meera",  new int[]{80, 72, 89})
        };

        System.out.println("Before sorting:");
        print(students);

        selectionSort(students);

        System.out.println("\nAfter sorting:");
        print(students);
    }

    static void selectionSort(Student123[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (compareMarks(arr[j].marks, arr[minIndex].marks) < 0) {
                    minIndex = j;
                }
            }

            Student123 temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static int compareMarks(int[] a, int[] b) {
        int min = Math.min(a.length, b.length);

        for (int i = 0; i < min; i++) {
            if (a[i] != b[i]) {
                return a[i] - b[i];
            }
        }
        return a.length - b.length;
    }

    static void print(Student123[] students) {
        for (Student123 s : students) {
            System.out.println(s.name + " " + Arrays.toString(s.marks));
        }
    }
}

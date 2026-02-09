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

public class Q11SelectionSorting {

    public static void main(String[] args) {

        Studet123[] students = {
            new Studet123("Rahul",  new int[]{85, 78, 90}),
            new Studet123("Sneha",  new int[]{85, 78, 88}),
            new Studet123("Vikas",  new int[]{85, 65, 92}),
            new Studet123("Pooja",  new int[]{90, 70, 85}),
            new Studet123("Arjun",  new int[]{85, 78, 95}),
            new Studet123("Meera",  new int[]{80, 72, 89})
        };

        System.out.println("Before sorting:");
        print(students);

        selectionSort(students);

        System.out.println("\nAfter sorting:");
        print(students);
    }

    static void selectionSort(Studet123[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (compareMarks(arr[j].marks, arr[minIndex].marks) < 0) {
                    minIndex = j;
                }
            }

            Studet123 temp = arr[i];
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

    static void print(Studet123[] students) {
        for (Studet123 s : students) {
            System.out.println(s.name + " " + Arrays.toString(s.marks));
        }
    }
}

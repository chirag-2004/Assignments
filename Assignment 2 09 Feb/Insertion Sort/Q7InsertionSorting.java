// package newTrainer2;

import java.util.Arrays;

class Stu {
    String name;
    int[] marks;

    Stu(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Q7InsertionSorting {

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

        insertionSort(students);

        System.out.println("\nAfter sorting:");
        print(students);
    }

    static void insertionSort(Studet123[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            Studet123 key = arr[i];
            int j = i - 1;

            while (j >= 0 && compareMarks(arr[j].marks, key.marks) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
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

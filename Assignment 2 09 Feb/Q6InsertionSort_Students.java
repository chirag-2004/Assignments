// package newTrainer2;

class Student12 {
    int rollNo;
    String name;

    Student12(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}

public class Q6Sort_Students {

    public static void insertionSort(Student12[] students) {
        int n = students.length;

        for (int i = 1; i < n; i++) {
            Student12 key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].rollNo > key.rollNo) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Student12[] students = {
            new Student12(103, "Aman"),
            new Student12(101, "Riya"),
            new Student12(105, "Karan"),
            new Student12(102, "Neha")
        };

        insertionSort(students);

        System.out.println("Students sorted by Roll Number:");
        for (Student12 s : students) {
            s.display();
        }
    }
}

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

public class Q2Sort_Students {

    public static void bubbleSort(Student12[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].rollNo > students[j + 1].rollNo) {

                    Student12 temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        Student12[] students = {
            new Student12(103, "Aman"),
            new Student12(101, "Riya"),
            new Student12(105, "Karan"),
            new Student12(102, "Neha")
        };

        bubbleSort(students);

        System.out.println("Students sorted by Roll Number:");
        for (Student12 s : students) {
            s.display();
        }
    }
}

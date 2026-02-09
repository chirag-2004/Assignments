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

public class Q10Sort_Students {

    public static void selectionSort(Student12[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (students[j].rollNo < students[minIndex].rollNo) {
                    minIndex = j;
                }
            }

            Student12 temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        Student12[] students = {
            new Student12(103, "Aman"),
            new Student12(101, "Riya"),
            new Student12(105, "Karan"),
            new Student12(102, "Neha")
        };

        selectionSort(students);

        System.out.println("Students sorted by Roll Number:");
        for (Student12 s : students) {
            s.display();
        }
    }
}

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

public class Q10SelectionSort_Students {

    public static void selectionSort(Stud[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (students[j].rollNo < students[minIndex].rollNo) {
                    minIndex = j;
                }
            }

            Stud temp = students[i];
            students[i] = students[minIndex];
            students[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        Stud[] students = {
            new Stud(103, "Aman"),
            new Stud(101, "Riya"),
            new Stud(105, "Karan"),
            new Stud(102, "Neha")
        };

        selectionSort(students);

        System.out.println("Students sorted by Roll Number:");
        for (Stud s : students) {
            s.display();
        }
    }
}

// package newTrainer2;

class Stud {
    int rollNo;
    String name;

    Stud(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}

public class Q2BubbleSort_Students {

    public static void bubbleSort(Stud[] students) {
        int n = students.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].rollNo > students[j + 1].rollNo) {

                    Stud temp = students[j];
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

        Stud[] students = {
            new Stud(103, "Aman"),
            new Stud(101, "Riya"),
            new Stud(105, "Karan"),
            new Stud(102, "Neha")
        };

        bubbleSort(students);

        System.out.println("Students sorted by Roll Number:");
        for (Stud s : students) {
            s.display();
        }
    }
}

// package newTrainer2;

class St {
    int rollNo;
    String name;

    St(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println(rollNo + " " + name);
    }
}

public class Q6InsertionSort_Students {

    public static void insertionSort(Stud[] students) {
        int n = students.length;

        for (int i = 1; i < n; i++) {
            Stud key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].rollNo > key.rollNo) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Stud[] students = {
            new Stud(103, "Aman"),
            new Stud(101, "Riya"),
            new Stud(105, "Karan"),
            new Stud(102, "Neha")
        };

        insertionSort(students);

        System.out.println("Students sorted by Roll Number:");
        for (Stud s : students) {
            s.display();
        }
    }
}

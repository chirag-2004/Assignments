import java.util.ArrayList;
import java.util.Collections;

public class StudentMarks {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(82);
        marks.add(68);
        marks.add(90);
        marks.add(55);

        marks.add(2, 80);

        int min = Collections.min(marks);
        marks.remove(Integer.valueOf(min));

        System.out.println("Final Marks List: " + marks);
    }
}

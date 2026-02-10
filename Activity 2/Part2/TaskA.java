import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAdvanced {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(25);
        list.add(30);
        list.add(45);
        list.add(60);
        list.add(75);
        list.add(80);
        list.add(95);
        list.add(15);
        list.add(20);

        list.removeIf(n -> n % 2 == 0);

        int max = Collections.max(list);
        int min = Collections.min(list);

        list.sort(Collections.reverseOrder());

        System.out.println("Final List: " + list);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

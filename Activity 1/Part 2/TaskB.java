import java.util.LinkedList;

public class TicketQueue {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        queue.add("Rahul");
        queue.add("Aman");
        queue.add("Neha");
        queue.add("Simran");
        queue.add("Karan");

        queue.remove();
        queue.remove();

        System.out.println("Remaining Queue: " + queue);
    }
}

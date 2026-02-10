import java.util.LinkedList;

public class HospitalQueue {
    public static void main(String[] args) {

        LinkedList<String> queue = new LinkedList<>();

        queue.add("Patient1");
        queue.add("Patient2");
        queue.add("Patient3");
        queue.add("Patient4");
        queue.add("Patient5");

        queue.addFirst("EmergencyPatient");

        queue.remove();
        queue.remove();

        System.out.println("Current Queue: " + queue);
    }
}

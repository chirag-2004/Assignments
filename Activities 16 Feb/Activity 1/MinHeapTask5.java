/*Task 5: Insert 10 Random Numbers into Min-Heap and Print in Sorted Order*/

// Task 5: Insert 10 Random Numbers into Min-Heap and Print in Sorted Order

import java.util.PriorityQueue;
import java.util.Random;

public class MinHeapTask5 {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Random random = new Random();

        System.out.println("Random Numbers Inserted:");

        // Insert 10 random numbers (0–99)
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            minHeap.add(num);
            System.out.print(num + " ");
        }

        System.out.println("\n\nNumbers in Sorted Order (Min-Heap):");

        // Remove elements in sorted order
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
    }
}

/*

Output:
PS C:\Users\Chirag\Desktop\Assignments\Activities 16 Feb\Activity 1> javac MinHeapTask5.java
PS C:\Users\Chirag\Desktop\Assignments\Activities 16 Feb\Activity 1> java MinHeapTask5      
Random Numbers Inserted:
50 40 83 3 7 33 90 76 47 63 

Numbers in Sorted Order (Min-Heap):
3 7 33 40 47 50 63 76 83 90

*/
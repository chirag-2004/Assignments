/*
Task 4: Implement a Min-Heap using Java PriorityQueue

In Java, a Min-Heap can be implemented using the built-in PriorityQueue class.
By default, PriorityQueue maintains elements in ascending order (smallest element at the top).

*/
// Task 4: Min-Heap using PriorityQueue

import java.util.PriorityQueue;

public class MinHeapTask4 {
    public static void main(String[] args) {

        // Create Min-Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert elements into Min-Heap
        minHeap.add(50);
        minHeap.add(30);
        minHeap.add(70);
        minHeap.add(20);
        minHeap.add(40);

        System.out.println("Min-Heap Elements:");
        System.out.println(minHeap);

        // Display smallest element
        System.out.println("Minimum element (Peek): " + minHeap.peek());
    }
}



/*

Output

PS C:\Users\Chirag\Desktop\Assignments\Activities 16 Feb\Activity 1> javac MinHeapTask4.java
PS C:\Users\Chirag\Desktop\Assignments\Activities 16 Feb\Activity 1> java MinHeapTask4      
Min-Heap Elements:
[20, 30, 70, 50, 40]
Minimum element (Peek): 20

*/
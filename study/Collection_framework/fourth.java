import java.util.*;
public class fourth{
  public static void main(String []args)
  {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.offer(5);  
    pq.offer(1);
    pq.offer(3);
    System.out.println("Priority Queue after adding elements: " + pq);
    System.out.println("Element at the head of the queue: " + pq.peek()); // Peek at the head element
    pq.poll(); // Remove the head of the queue
    System.out.println("Priority Queue after removing the head element: " + pq);
    pq.add(2); // Add another element
  }
}
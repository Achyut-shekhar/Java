import java.util.*;
//learning queue`
public class third{
  public static void main(String[] args)
  {
    // Using Queue interface with LinkedList implementation
    Queue<Integer> queue=new LinkedList<>();
    queue.offer(1); // Add element to the queue
    queue.offer(2); // Add another element  
    System.out.println("Queue after adding elements: " + queue);
    queue.poll(); // Remove the head of the queue
    System.out.println("Queue after removing an element: " + queue);
    queue.add(3); // Add another element
    System.out.println("Queue after adding another element: " + queue);
  }
}
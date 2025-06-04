import java.util.*;
//ArrayDequeue is a resizable array implementation of the Deque interface.
// It allows elements to be added or removed from both ends of the deque.
public class fifth{
  public static void main(String []args)
  {
    ArrayDeque<String> deque = new ArrayDeque<>();
    deque.add("apple"); // Add element to the end 
    deque.add("banana"); // Add another element to the end
    System.out.println("Deque after adding elements: " + deque);
    deque.addFirst("orange"); // Add element to the front
    System.out.println("Deque after adding an element to the front: " + deque);

    deque.removeLast(); // Remove the last element
    System.out.println("Deque after removing the last element: " + deque);
    System.out.println("Element at the front of the deque: " + deque.peekFirst()); // Peek at the front element
    System.out.println("Element at the end of the deque: " + deque.peekLast()); // Peek at the last element
    deque.removeFirst(); // Remove the first element
    System.out.println("Deque after removing the first element: " + deque);
    deque.addLast("kiwi"); // Add element to the end
    System.out.println("Deque after adding an element to the end: " + deque);
    deque.pollLast(); // Remove the last element
    System.out.println("Deque after polling the last element: " + deque);
    deque.clear(); // Clear the deque
  }
}
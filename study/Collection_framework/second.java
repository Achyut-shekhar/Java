import java.util.*;
public class second{
  public static void main(String []args)
  {
    Stack<String> stack = new Stack<String>();
    stack.push("apple");
    stack.push("banana");
    System.out.println("Stack after pushing elements: " + stack);
    stack.pop();
    System.out.println(stack.peek()); // Peek at the top element
    System.out.println("Stack after popping an element: " + stack);
  }
}
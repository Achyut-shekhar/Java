import java.util.*;
//learning arraylist
public class first{

  public static void main(String []args)
  {
    ArrayList<String > list=new ArrayList<String>();

    list.add("apple");
    list.add("banana");
    System.out.println("List after adding elements: " + list);
    list.remove("apple");
    System.out.println("List after removing an element: " + list);
    list.add(0, "orange"); // Adding at index 0
    System.out.println("List after adding an element at index 0: " + list);
  }

}
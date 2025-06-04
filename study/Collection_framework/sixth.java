import java.util.*;
public class sixth{
  public static void main(String []args)
  {
    // Using HashSet to store unique elements
    //LinkedHashSet maintains insertion order, while TreeSet sorts elements
    // HashSet does not maintain any order and changing HashSet to LinkedHashSet or TreeSet will change the behavior

    // Set<String> set = new HashSet<>();

    // Set<String> set = new LinkedHashSet<>();
    
    Set<String> set = new TreeSet<>();
    set.add("apple");
    set.add("banana");
    System.out.println("Set after adding elements: " + set);
    
    // Attempting to add a duplicate element
    boolean isAdded = set.add("apple");
    System.out.println("Was 'apple' added again? " + isAdded);
    
    // Removing an element
    set.remove("banana");
    System.out.println("Set after removing 'banana': " + set);
    
    // Checking if an element exists
    boolean containsApple = set.contains("apple");
    System.out.println("Does the set contain 'apple'? " + containsApple);

    set.size(); // Get the size of the set
    System.out.println("Size of the set: " + set.size());
  }
}
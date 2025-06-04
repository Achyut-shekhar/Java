import java.util.*;

public class TwoList{
  public static void main(String []args)
  {
    LinkedList<Integer>list1=new LinkedList<>();
    LinkedList<Integer>list2=new LinkedList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list2.add(4);
    list2.add(5);
    list2.add(56);
   
    System.out.println("List 1: " + list1);
    System.out.println("List 2: " + list2);
    // Merging two lists
    LinkedList<Integer> mergedList = alternate(list1,list2);
    System.out.println("Merged List: " + mergedList);
  }
  public static LinkedList<Integer> alternate(LinkedList<Integer> list1, LinkedList<Integer> list2) {
    LinkedList<Integer> mergedList = new LinkedList<>();
    int size1 = list1.size();
    int size2 = list2.size();
    int i=0;
    while(i<size1 || i<size2) {
      mergedList.add(list1.get(i));
      mergedList.add(list2.get(i));
      i++;
    }
    return mergedList;
  }
}
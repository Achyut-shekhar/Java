import java.util.*;

public class evenLength{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    ArrayList<String> list = new ArrayList<String>();
    int n;
    System.out.println("Enter total number of string");
    n=sc.nextInt();
    for(int i = 0; i < n; i++) {
      if(i==0) sc.nextLine(); // Consume newline character after nextInt
      System.out.println("Enter string " + (i + 1) + ":");
      String str = sc.nextLine();
      list.add(str);
    }

    System.out.println(list);
    removeEvenLengthStrings(list);
    System.out.println("List after removing even length strings: " + list);
  }

  public static void removeEvenLengthStrings(ArrayList<String>list){
    for(int i = 0; i < list.size(); i++) {
      if(list.get(i).length() % 2 == 0) {
        list.remove(i);
        i--; // Adjust index after removal
      }
    }
  }
}
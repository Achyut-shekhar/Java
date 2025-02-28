import java.util.*;
import java.io.*;



class buffer{
  public static void main(String args[]){
    BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

    try{
      System.out.println("Enter your name: ");
      String name=reader.readLine();

      System.out.println("Enter your age: ");
      int age=Integer.parseInt(reader.readLine());

      System.out.println("Name: " + name);
      System.out.println("Age: " + age);

    }catch( IOException e){
      System.out.println("Error reading input: " + e.getMessage());
  } 
  }
}
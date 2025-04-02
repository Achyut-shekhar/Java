import swap.*;
import java.util.*;

public class main2
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      swapnum obj=new swapnum();
      
      System.out.println("input the number");
      obj.a=sc.nextInt();
      sc.nextLine();
      obj.b=sc.nextInt();
      
      obj.swap();
      obj.display();
    }
}

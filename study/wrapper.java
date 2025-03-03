import java.util.*;

class wrapper{
  public static void main(String args[]){
    //Autoboxing
    int num=20;
    Integer obj=num; //Integer obj=Integer.valueOf(num);
    System.out.println(num+" Autoboxing:  "+obj);

    //Unboxing
    Integer obj1=new Integer(10);
    int num1=obj1; //int num1=obj1.intValue();
    System.out.println(obj1+" Unboxing:  "+num1);

    //using arraylist as it only supports objects
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.add(80); //Autoboxing(int->Integer)
    int value=list.get(0); //Unboxing(Integer->int)
    System.out.println("ArrayList:  "+value);
  }
}
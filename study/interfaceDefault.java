import java.util.*;

interface printable{
  void print();//abstract method

  //default method
  default void show(){
    System.out.println("this is the default method ");
  }

  //static method
  static void staticmethod(){
    System.out.println("this is a static method");
  }
}


class documents implements printable{
  public void print(){
   
      System.out.println("printing....");
    
  }
}

public class interfaceDefault{
  public static void main(String args[]){
    documents doc=new documents();
    doc.print();
    doc.show();
    printable.staticmethod();
  }
}
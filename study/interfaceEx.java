import java.util.*;

//making interface
interface Animal{
  //abstract method
  void makeSound();
}

class dog implements Animal{
  //implementing abstract method
  public void makeSound(){
    System.out.println("Bark Bark");
  }
}

//Another implemetation
class cat implements Animal{
  //implementing abstract method
  public void makeSound(){
    System.out.println("Meow Meow");
  }
}

public class interfaceEx{
  public static void main(String args[]){
    Animal obj=new dog();
    Animal obj1=new cat();
    obj.makeSound();
    obj1.makeSound();
  }
}
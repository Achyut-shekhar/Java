import java.util.*;

interface vehicle{
  void start();
  void stop();
}

//second interface
interface fuel{
  void fillFuel();
}

//multiple inheritance
class car implements vehicle,fuel{
  public void start(){
    System.out.println("car has started");
  }
  public void stop(){
    System.out.println("car has stopped");
  }
  public void fillFuel(){
    System.out.println("Refuled");
  }
}

class MultipleInheritance{
  public static void main(String args[]){
    System.out.println("vehicle reference\n");
    vehicle obj=new car();
    obj.start();
    obj.stop(); 
    // obj.fillFuel();
    System.out.println("\nFuel reference\n");
    fuel obj1=new car();
    obj1.fillFuel();
    // obj1.start();
    // obj1.stop();
    System.out.println("\ncar reference\n");
    car obj2=new car();
    obj2.start();
    obj2.stop();
    obj2.fillFuel();
  }
}
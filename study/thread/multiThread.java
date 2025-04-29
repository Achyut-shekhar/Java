class task1 extends Thread{
  public void run(){
    for(int i=0;i<=5;i++){
      System.out.println("Task 1: " + i);
    }
  }
}
class task2 extends Thread{
  public void run(){
    for(int i=0;i<=5;i++){
      System.out.println("Task 2: " + i);
    }
  }
}

public class multiThread{
  public static void main(String args[]){
    task1 t1 = new task1();
    task2 t2 = new task2();
    t1.start(); // Start the first thread
    t2.start(); // Start the second thread
  }
}
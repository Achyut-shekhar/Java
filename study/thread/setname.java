public class setname extends Thread{
  public static void main(String []args){
    Thread t=new Thread();
    System.out.println("Thread name: " + t.getName()); // Default thread name
    t.setName("MyThread"); // Set a new name for the thread
    System.out.println("Thread name after setName: " + t); // New thread name
  }
}
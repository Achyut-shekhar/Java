import java.util.*;

 class comm implements Runnable {
  public String[] items=new String[10];
  public String[] operations;;
  public int count=0;
public void run(){
   System.out.println("Thread started: " + Thread.currentThread().getName());
    run(operations); // Execute operations (add/remove)
    System.out.println("Thread finished: " + Thread.currentThread().getName());
  }
  // Constructor to accept operations
    public comm(String[] operations) {
        this.operations = operations;
    }
  public synchronized void add(String item){
    if(count<items.length){
      items[count++]=item;
      System.out.println("Added item: " + item + ", Count: " + count);

    }else
    {
      System.out.println("Cart is full, cannot add item: " + item);
    }
  }

  public synchronized void remove(String item){
    for(int i=0;i<count;i++){
      if(items[i].equals(item)){
       items[i] = items[count - 1];
items[--count] = null;

        System.out.println("Removed item: " + item + ", Count: " + count);
        return;
      }
    }
    System.out.println("Item not found: " + item);
  }
  public void run(String[] operations) {
    for (String operation : operations) {
      String[] parts = operation.split(":");
      String action = parts[0];
      String item = parts[1];

      if (action.equals("add")) {
        add(item);
      } else if (action.equals("remove")) {
        remove(item);
      } else {
        System.out.println("Unknown operation: " + operation);
      }
    }
  }
}

public class eComm{
  public static void main(String[] args){
    comm cart=new comm(new String[]{});
    Thread t1 = new Thread(new comm(new String[]{"add:car", "add:bike", "remove:car"}), "User-1");
        Thread t2 = new Thread(new comm(new String[]{"add:bus", "remove:bike"}), "User-2");

          // Start the threads
        t1.start();
        t2.start();

        // Wait for them to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All operations completed.");
  }
}
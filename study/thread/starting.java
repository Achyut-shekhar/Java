// class starting extends Thread
// {
// public
//   void run()
//   {
//     System.out.println("Thread is running...");
//   }

// public
//   static void main(String args[])
//   {
//     starting t1 = new starting();
//     t1.start(); // Start the thread
//   }
// }

//ANOTHER WAY BY RUNNABLE


class starting implements Runnable
{
public
  void run()
  {
    System.out.println("Thread is running...");
  }

public
  static void main(String args[])
  {
    starting obj = new starting();
    Thread t1 = new Thread(obj); // Create a new thread with the Runnable object
    t1.start(); // Start the thread
  }
}
public class threadInterf{
  int x = 10;

  public void increment(String threadName) {
      System.out.println(threadName + " - Read x: " + x);
      int temp = x + 10;
      System.out.println(threadName + " - Calculated new x: " + temp);
      x = temp;
      System.out.println(threadName + " - Updated x to: " + x);
  }

  public static void main(String[] args) {
      threadInterf obj = new threadInterf();

      Thread t1 = new Thread(() -> {
          obj.increment("Thread-1");
      });

      Thread t2 = new Thread(() -> {
          obj.increment("Thread-2");
      });

      t1.start();
      t2.start();

      try {
          t1.join();
          t2.join();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

      System.out.println("Final value of x: " + obj.x);
  }
}
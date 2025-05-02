public class DeadlockExample{
  final String resource1="Resource1";
  final String resource2="Resource2";

  public static void main(String args[]){
    DeadlockExample obj=new DeadlockExample();
    

    Thread t1=new Thread(()->{
      synchronized (obj.resource1){
        System.out.println("Thread 1: Holding resource 1...");
        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("Thread 1: Waiting for resource 2...");
        synchronized(obj.resource2){
          System.out.println("Thread 1: Acquired resource 2!");
        }
      }

    });
    Thread t2=new Thread(()->{
      synchronized (obj.resource2){
        System.out.println("Thread 2: Holding resource 2...");
        try{Thread.sleep(100);}catch(Exception e){}
        System.out.println("Thread 2: Waiting for resource 1...");
        synchronized(obj.resource1){
          System.out.println("Thread 2: Acquired resource 1!");
        }
      }

    });
    t1.start();
    t2.start();
  }
}
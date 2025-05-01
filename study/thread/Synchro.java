public class Synchro{
  int x=10;
  public synchronized void increment(String threadName){
    System.out.println(threadName+" - Read x: "+x);
    int temp=x+10;
    System.out.println(threadName+" - Calculated new x: "+temp);
    x=temp;
    System.out.println(threadName+" - Updated x to: "+x);
  }
  public static void main(String[] args){
    Synchro obj=new Synchro();
    Thread t1=new Thread(()->{
      obj.increment("Thread-1");
    });
    Thread t2=new Thread(()->{
      obj.increment("Thread-2");
    });
    t1.start();
    t2.start();
    try{
      t1.join(); //the code will wait for t1 to finish before proceeding
      t2.join();//the code will wait for t2 to finish before proceeding
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    //after both threads have finished, print the final value of x
    System.out.println("Final value of x: "+obj.x);
  }
}
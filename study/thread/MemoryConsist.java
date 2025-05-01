public class MemoryConsist{
  int balance=5000;

  public void transaction(){
    balance=balance-1000;
    System.out.println("Transaction completed. Remaining balance: "+balance);
  }

  public void transactionB(){
    int temp=balance;
    System.out.println("TransactionB - Read balance: "+temp);
  }

  public static void main(String[] args){
    MemoryConsist obj=new MemoryConsist();
    Thread t1=new Thread(()->{
      obj.transaction();
    });
    Thread t2=new Thread(()->{
      obj.transactionB();
    });
    t1.start();
    t2.start();
    try{
      t1.join(); //the code will wait for t1 to finish before proceeding
      t2.join();//the code will wait for t2 to finish before proceeding
    }catch(InterruptedException e){
      e.printStackTrace();
    }
  }
}
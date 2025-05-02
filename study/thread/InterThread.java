class customer{
  int amount=10000;

  synchronized void withdraw(int amount){
    System.out.println("withdraw method called");
    if(this.amount<amount){
      System.out.println("Insufficient balance, waiting for deposit...");
      try{
        wait(); //wait for deposit to be called
      }catch(InterruptedException e){
        e.printStackTrace();
      }
    }
    this.amount-=amount;
    System.out.println("Withdrawn: "+amount+", Remaining balance: "+this.amount);
  }

  synchronized void deposit(int amount){
    System.out.println("Deposit method called");
    this.amount+=amount;
    System.out.println("Deposited: "+amount+", New balance: "+this.amount);
    notify(); //notify waiting threads
  }
}

class t1 extends Thread{
  customer c;
  t1(customer c){
    this.c=c;
  }
  public void run(){
    c.withdraw(15000); //try to withdraw more than the balance
  }
}
class t2 extends Thread{
  customer c;
  t2(customer c){
    this.c=c;
  }
  public void run(){
    c.deposit(1000); //deposit some amount
  }
}

public class InterThread{
  public static void main(String[] args){
    customer c=new customer();
    t1 t1=new t1(c);
    t2 t2=new t2(c);
    t1.start();
    t2.start();

    try{
      t1.join(); //wait for t1 to finish
      t2.join(); //wait for t2 to finish
    }catch(InterruptedException e){ 
      e.printStackTrace();
    }
    System.out.println("Final balance: "+c.amount); //print final balance
  }
}
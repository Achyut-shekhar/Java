import java.util.*;
class sharedData{
int value;
boolean available=false;

 synchronized void produce(int val){
try{
  while(available){
    wait();
  }
  value=val;
  available=true;
  System.out.println("Produced: " + val);
  notify();
}catch(InterruptedException e){
  e.printStackTrace();
}
 }
synchronized void consume(){
  try{
    while(!available){
      wait();
    }
    System.out.println("Consumed: " + value);
    available=false;
    notify();
  }catch(InterruptedException e){
    e.printStackTrace();
  }
}
 }


public class producer{
  public static void main(String []args){
      sharedData data=new sharedData();

      Thread producer=new Thread(()->{
        for(int i=0;i<=5;i++){
          data.produce(i);
        }
      });

      Thread consumer=new Thread(()->{
        for(int i=0;i<=5;i++){
          data.consume();
        }
      });

      producer.start();
      consumer.start();
      try {
          producer.join();
          consumer.join();
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }
}
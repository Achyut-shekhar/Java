import java.util.*;

public class banking{


    public static void main(String arg[])
    {
    int i;int choice,flag=0;
       Scanner scanner=new Scanner(System.in);
       System.out.println("enter the number of account you want to enter");
       int numCustomer=scanner.nextInt();
       scanner.nextLine();
       
       bankingAccount[] accounts=new bankingAccount[numCustomer];
       
       for(i=0;i<numCustomer;i++)
       {
         System.out.println("enter the name for " +(i+1)+":");
         String name=scanner.nextLine();
         
         System.out.println("enter the id");
         int id=scanner.nextInt();
         scanner.nextLine();
         
         System.out.println("enter the balance");
         int balance=scanner.nextInt();
         scanner.nextLine();
         
         accounts[i]=new bankingAccount(balance,id,name);
       } 
       do{
    System.out.println("enter the customer id for transaction");
    int idGet=scanner.nextInt();
    for(i=0;i<numCustomer;i++)
    {
    if(accounts[i].getId()==idGet)
    flag=1;
    break;
    }
    scanner.nextLine();
    if(flag==1)
    {
    System.out.println("Menu: 1-check balance\n 2-deposit money\n3-withdraw money");
     choice=scanner.nextInt();
    scanner.nextLine();
    
    if(choice==1)
    {
      accounts[i].CheckBalance();
    }
    else if(choice==2)
    {
      accounts[i].deposit();
    }
    else
    {
       accounts[i].withdraw();
    }
    }else
    break;
     }  while(choice!=0);
    }
}

class bankingAccount{
int balance;
int id;
String name;
Scanner scanner=new Scanner(System.in);
  
    bankingAccount(int balance,int id,String name)
    {
       this.balance=balance;
       this.id=id;
       this.name=name;
    }
    int getId()
    {
      return id;
    }
 void CheckBalance()
 {
    System.out.println("balance of "+this.name+" is :"+balance);
 }   
 
 void deposit()
 {
   System.out.println("input the amount you want to deposit");
   int amt=scanner.nextInt();
   this.balance+=amt;
 }
 
 void withdraw()
 {
   System.out.println("input the amount you want to withdraw");
   int amt=scanner.nextInt();
   this.balance-=amt;
 }
    
}

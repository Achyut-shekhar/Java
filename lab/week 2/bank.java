import java.util.*;
class bank{
  public static void main(String[] args){
  int numAccounts=Integer.parseInt(args[0]);
  System.out.println(numAccounts);

  Scanner scanner=new Scanner(System.in);

  accounts[] accounts=new accounts[numAccounts];

  for(int i=0;i<numAccounts;i++){
   System.out.println("Enter the name of account holder "+(i+1)+":");
    String nameGet=scanner.nextLine();

    System.out.println("Enter the id of account holder "+(i+1)+":");
    int idGet=scanner.nextInt();

    System.out.println("Enter the principal amount of account holder "+(i+1)+":");
    int principalAmtGet=scanner.nextInt();  

    System.out.println("Enter the rate of interest of account holder "+(i+1)+":");
    int ROI=scanner.nextInt();

    System.out.println("Enter the year time of account holder "+(i+1)+":");
    int time=scanner.nextInt();
    scanner.nextLine();
    
    accounts[i]=new accounts(nameGet,idGet,principalAmtGet,ROI,time);
  }
  do{
    System.out.println("Enter the name of the account holder to calculate interest (or type 'exit' to quit):");
    String nameGet=scanner.nextLine();
    if(nameGet.equalsIgnoreCase("exit")){
      break;
    }
    int flag=0;
    for(int i=0;i<numAccounts;i++){
      if(accounts[i].getName().equalsIgnoreCase(nameGet)){
        flag=1;
        break;
      }
    }
    if(flag==1){
      for(int i=0;i<numAccounts;i++){
        if(accounts[i].getName().equalsIgnoreCase(nameGet)){
          accounts[i].calculateInterest();
          break;
        }
      }
    }
    else{
      System.out.println("Account holder not found.");
    }
}while(true);
  }
}
class accounts{
  private int id,principalAmt,ROI,time;
  private String name;
  accounts(String name,int id,int principalAmt,int ROI,int time){
    this.name=name;
    this.id=id;
    this.principalAmt=principalAmt;
    this.ROI=ROI;
    this.time=time;
  }
  public String getName(){
    return name;
  }
  public void calculateInterest(){
    int interest=(principalAmt*ROI*time)/100;
    System.out.println("The interest of "+name+" is: "+interest);
  }
}
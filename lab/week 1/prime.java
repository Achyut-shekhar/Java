public class prime{
  boolean prime(int n)
  {
    if(n<=1)
    {
      System.out.println("Not prime");
      return false;
    }

    for(int i=2;i<n/2;i++)
    {
      if(n%i==0)
      {
        System.out.println("Not prime");
        return false;
      }
    }
    System.out.println("prime");
    return true;
  }
  public static void main(String[] args)
  {
    prime obj=new prime();
    obj.prime(2);
  }

}
public class fact{
  static int factorial(int n)
  {
    int f=1;
    for(int i=1;i<=n;i++)
    {
      f*=i;
    }
    return f;
  }
  public static void main(String[] args)
  {
    System.out.println("factorial:"+factorial(5));
  }
}
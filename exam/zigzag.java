import java.util.*;

public class zigzag{
  public static void main(String args[]){
    System.out.println("enter the value of n:");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the element is an array:");
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n-1;i++)
    {
      if(i%2==0)
      {
        if(arr[i]>arr[i+1])
        {
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        }
      }
        else{
          if(arr[i]<arr[i+1])
          {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
          }
        }
      
    }
    System.out.println("the zigzag array is:");
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
   }
}
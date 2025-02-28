//scanner class
import java.util.*;
// class input{
//   public static void main(String arg[])
//   {
//     int a,b,c;
//     Scanner scan=new Scanner(System.in);
//     System.out.println("input the num");
//     a=scan.nextInt();
//     b=scan.nextInt();
//     c=scan.nextInt();
//     System.out.println("a:"+a+" b:"+b+" c:"+c);
//   }
// }1 2


//COMMAND LINE ARGUMENT

class input{
  public static void main(String[] args) {
    System.out.println("Number of arguments: " + args.length);

    // Loop through and print all arguments
    for (int i = 0; i < args.length; i++) {
        System.out.println("Argument " + i + ": " + args[i]);
    }
    //using parseInt

    int a=Integer.parseInt(args[0]); //converting the string into integer and saving in a 
    int b=Integer.parseInt(args[1]);
    int c=Integer.parseInt(args[2]);
   int sum=a+b+c;
   System.out.println("sum: "+sum);
}
}
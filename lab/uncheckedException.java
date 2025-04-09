import java.util.*;

class UncheckedException extends RuntimeException
{
   UncheckedException()
   {
      super();
   }
}

class first {
  static void method()
   {
      throw new UncheckedException();
   }
}

class second extends first
{
   public static void main(String args[])
   {
      try{
      method();
      }
      catch(UncheckedException e)
      {
         System.out.println("Exception");
      }
   }
}

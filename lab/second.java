import java.util.*;

class uncheckedException extends RuntimeException
{
   uncheckedException()
   {
      super();
   }
}

class first {
  static void method()
   {
      throw new uncheckedException();
   }
}

class second extends first
{
   public static void main(String args[])
   {
      try{
      method();
      }
      catch(uncheckedException e)
      {
         System.out.println("Exception");
      }
   }
}

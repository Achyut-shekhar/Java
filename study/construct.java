import java.util.*;

class a {
  public a()
  {
  System.out.println("enterd a class");
  }
  void show(){
    System.out.println("a class");
  }
}

class b extends a{
  public b()
  {
    //there is a super() func
    super();
  System.out.println("enterd b class");
  }

  public b(int n)
  {
    //there is a super() func
    this();
  System.out.println("enterd parameterized b class");
  }
  
  void show(){
    System.out.println("b class");
  }
}

class construct{
  public static void main(String args[]){
    System.out.println("in psvm");
    b obj=new b(5);
    obj.show();
  }

}
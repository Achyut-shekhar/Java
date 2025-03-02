class garbage{
  garbage(){
    System.out.println("object created "+this);
  }



  protected void finalize()  {
    System.out.println("object destroyed "+this);
  
  }

  public static void main(String args[]){
    //creating objects
    garbage obj1=new garbage();
    garbage obj2=new garbage();
    //destroying objects
    obj1=null;
    obj2=null;
    System.gc(); //request for garbage collector to run

    System.out.println("end of main method");
  }
}

package studentpkj;

public class student{
   public  String name="achyut shekhar singh";
   public int sid=101;
    public String dept="CSE";
   public int marks1=90,marks2=90,marks3=90,totalmarks;
    
     public student(){
        totalmarks=marks1+marks2+marks3;
     }
     
     public void display()
     {
       System.out.println("Student id: "+sid+"\nname: "+name+"\ndept: "+dept+"\ntotal marks: "+totalmarks);
     }
}



























































































































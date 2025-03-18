public class StudentInfo {
  public static void main(String[] args) {
      if (args.length != 4) {
          System.out.println("Please provide Name, Course, University Roll No, and Semester as command line arguments.");
          return;   }
      String name = args[0];
      String course = args[1];
      int universityRollNo = Integer.parseInt(args[2]); 
      int semester = Integer.parseInt(args[3]);         
      System.out.println("Name: " + name);
      System.out.println("University Roll No: " + universityRollNo);
      System.out.println("Course: " + course);
      System.out.println("Semester: " + semester); }  }

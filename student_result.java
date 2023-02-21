import java.util.Scanner;
class student
{
  float roll_number;
  String name;

    public void show()
        {
           Scanner sc=new Scanner(System.in);
           System.out.println(" Name of student:");
             name=sc.next();
           System.out.println(" Roll number of student:");
            roll_number=sc.nextFloat();
        }
  

}
 
class exam extends student
{
  float mark_hindi;
  float mark_math;
  float mark_bio;
  float mark_chemistry;
  float mark_physics;
  float mark_computer;
  
    public void get()
       {      
           Scanner sc=new Scanner(System.in);
           System.out.println("1.marks of hindi subject:");
            mark_hindi=sc.nextFloat();
            System.out.println("2.marks of math subject:");
            mark_math=sc.nextFloat();
            System.out.println("3.marks of bio subject:");
            mark_bio=sc.nextFloat();
            System.out.println("4.marks of chemistry subject:");
            mark_chemistry=sc.nextFloat();
            System.out.println("5.marks of physics subject:");
            mark_physics=sc.nextFloat();
            System.out.println("6.marks of computer subject:");
            mark_computer=sc.nextFloat();
       }    
}

class student_result extends exam
{
 float total_marks;

           void given()
              {
                  total_marks= mark_hindi+ mark_math+mark_bio+mark_chemistry+mark_physics+mark_computer;
                  System.out.println("Total marks of student="+total_marks);
              }

   public static void main(String arg[])
     {
         student_result ob=new student_result();
       
         ob.show();
         ob.get();
         ob.given();
     }
}

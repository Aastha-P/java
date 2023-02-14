import java.util.Scanner;
class Addition
{
  public static void main(String arg[])
{
   int x,y,z;
   Scanner sc=new Scanner (System.in);
System.out.println("Enter 1st number");
   x=sc.nextInt();
System.out.println("Enter 2nd number");
  y=sc.nextInt();
System.out.println("Enter 3rd number");
  z=sc.nextInt();
  System.out.println("Sum of Three numbers="+(x+y+z));
}
}
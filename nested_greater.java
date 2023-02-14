import java.util.*;
class nested_greater
{
  public static void main( String a[])
  {
     int x,y,z;
   Scanner sc=new Scanner(System.in);

 System.out.println("Enter 1st number");
   x=sc.nextInt();
System.out.println("Enter 1st number");
  y=sc.nextInt();
System.out.println("Enter 1st number");
   z=sc.nextInt();

    if(x>y)
      { 
          if(x>z)
           { System.out.println("1st number is greater."); }
         else
          { System.out.println("3rd number is greater."); }
      }
  else if(y>x)
   {
          if(y>z)
         {  System.out.println("2nd number is greater."); }
       else
      { System.out.println("3rd number is greater."); }
   }
 else 
    { System.out.println("3rd number is greater."); }
}
}
import java.util.*;
class Base 
{ String name;
  int age;
Scanner sc=new Scanner(System.in);
   void getbasedata()
   {
   System.out.println("Enter Name:");
   name=sc.next();
System.out.println("Enter Age:");
   age=sc.nextInt();
}
   void getshowdata()
   {
System.out.println("Enter Name:"+name);
   
System.out.println("Enter Age:"+age);
   }
}

class Child extends Base 
{ String branch;
int sem;
  void getchilddata()
   {
    System.out.println("Enter Branch:");
   branch=sc.next();
System.out.println("Enter semester:");
   sem=sc.nextInt();
}
  void showchilddata()
  {
System.out.println("Enter Branch:"+branch);
   
System.out.println("Enter semester:"+sem);
   }
public static void main(String a[])
{
Child ob= new Child();
ob.getbasedata();
ob.getshowdata();
ob.getchilddata();
ob.showchilddata();
}
}

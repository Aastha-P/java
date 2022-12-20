     //*****Overriding*****//
class Sub
{
void f1()
{
System.out.println("<<<Hello Everyone>>>");
}
}
 
class Subclass extends Sub
{
void f1()
{
System.out.println("I wish your Day Is Full Of Smile");
}
public static void main(String a[])
{
Sub r;
Sub ob1=new Sub();
Subclass ob2=new Subclass();
r=ob1;
r.f1();
r=ob2;
r.f1();
}
}

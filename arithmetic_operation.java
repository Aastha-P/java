import java.util.*;
class example_switch
{  
	public void addition(int x,int y) 	
	{ 
		System.out.println("Addition of numbers="+(x+y));
	}
   	void sub(int x,int y)
   	{ 
		System.out.println("Addition of numbers="+(x-y));
	}
	void multi(int x,int y)
   	{ 
		System.out.println("Addition of numbers="+(x*y));
	}
 	void div(int x,int y)
   	{ 
		System.out.println("Addition of numbers="+(x%y));
	}
	
}
class 
{
  	public static void main( String a[])
  	{
      		arithmetic_operation  ob=new arithmetic_operation();
     		int x,y,choice;
   		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
   		x=sc.nextInt();
		System.out.println("Enter 1st number");
   		y=sc.nextInt();
		System.out.println("1. Addition");
		System.out.println("2. Substratction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("Enter choice:");
     		choice=sc.nextInt();

  		switch(choice)
   		{
     			case 1:
				ob.addition(x,y);
      			break;
     			case 2:
				ob.sub(x,y);
       			break;
      			case 3:
				ob.multi(x,y);
        			break;
      			case 4:
				ob.div(x,y); 
        			break;
    			default:
				System.out.println("Invalid Choice");
  		}
	}
}

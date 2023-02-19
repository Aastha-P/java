import java.util.Scanner;
class search_num
{ 
   public static void main(String arg[])
    { 
        int n[] = new int[4],x,flag=0,i;
          Scanner sc=new Scanner(System.in);     
                 for(int j=0;j<4;j++)
                {
                
                 n[j]=sc.nextInt();
                }
            
             System.out .println("Search Element=");
              x=sc.nextInt();

               for( i=0;i<4;i++)
                  {
                       if(n[i]==x)
                         { 
                           flag=1;
                           break;
                         }
                  }
			 if(flag==1)
                            {
				  System.out .println("Element is found at "+(i+1));
			      }
			  else
                           {
				System.out .println("Element is not found");
                           } 
    }
}
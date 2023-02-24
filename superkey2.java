class shoes
	{  
     String color="white";  
    }  

class puma extends shoes
{  
    String color="black";  

      void color()
		  {  
           System.out.println(color);         //print color of puma class  
           System.out.println(super.color);  //print color of shoes class  
          }  
}  

class superkey2
{  
     public static void main(String args[])
	{  
      puma d=new puma();  
      d.color();  
    }
}  

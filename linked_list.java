import java.util.*;
class  linked_list
{
	public static void main(String[] args) 
	{
		LinkedList<String> ob=new LinkedList<String>();
		ob.add("Apple");
		ob.add("Cherry");
		ob.add("Mango");

		 //Object_Name.add(index_position,"String_name");  
		 // with this we add element in specific position
		 
		ob.add(0,"Potato");   //add element at zero index position
		ob.add(2,"Chilli");  //add element at second index position

		System.out.println("Elements of list: ");
		Iterator<String> it=ob.iterator();
		while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	}
}

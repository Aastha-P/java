import java.util.*;
class que_ue					 
{
	public static void main(String[] args) 
	{
		Queue<String> q=new LinkedList<String>();
		q.add("richa");
		q.add("rocky");
		q.add("risabh");
		q.add("rose");
		System.out.println("Element in queue:"+q);          //Show all elements
        System.out.println("Remove element:"+q.remove());  //Remove elements
	    System.out.println("head element:"+q.element());  //Returns head of the queue
		System.out.println("poll:"+q.poll());            //Remove and returns head of the queue 
		System.out.println("peek:"+q.peek());           //Show peek element
	   System.out.println("Element in queue:"+q);      //Show leftover elements
		
	}
}

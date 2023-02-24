class fruit
{
	public void eat()
	{
      System.out.println("Eating....");
    }
}

class apple extends fruit
{
	public void eat()
	{
      System.out.println("Eating apple....");
    }

	public void test()
	{
	  System.out.println("Testing.......");
	  
    }
	public void work()
    {
      super.eat();
	  test();
    }
}

class superkey1
{
	public static void main(String[] args) 
	{
		apple s=new apple();
		s.work();
	}
}

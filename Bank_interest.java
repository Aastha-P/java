class Bank
{
    public float getRateOfInterest()
      {     
        System.out.println("Total interest of bank :");
        return 100.0f;
      }
}

class SBI extends Bank
{
     public float getRateOfInterest()
      {
         System.out.println("Rate of interest of SBI :");
         return 8.4f;
      }
}

class ICIC extends Bank
{
     public float getRateOfInterest()
      {
         System.out.println("Rate of interest of ICIC :");
         return 7.3f;
      }
}

class AXIS extends Bank
{
      public float getRateOfInterest()
      {
         System.out.println("Rate of interest of AXIS :");
         return 9.7f;
      }
}
 
class Bank_interest
{   
     public static void main(String arg[])
        {
            Bank b=new Bank();
           System.out.println(b.getRateOfInterest());

           Bank b1=new SBI();
           System.out.println(b1.getRateOfInterest());

           Bank b2=new ICIC();
           System.out.println(b2.getRateOfInterest());

          Bank b3=new AXIS();
           System.out.println(b3.getRateOfInterest());
        }
}
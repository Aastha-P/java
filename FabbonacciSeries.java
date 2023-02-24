import java.util.Scanner;

class FabbonacciSeries
{
     public static void main(String arg[])
     {
        int sum = 0, x = 0, y = 1;

        System.out.println(x);
        System.out.println(y);
     
        for (int n = 2; n < 10; n++)
        {
          sum = x + y;
          System.out.println(sum);
          x = y;
          y = sum;
        }
     }
}

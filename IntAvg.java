import java.util.Scanner;
class IntAvg
{
          public  static void main (String args[])
          { 
          Scanner in= new Scanner (System.in);
          int ar []= new int[10];
          int i;
          float sum=0.0f,Avg;
          System.out.println ("enter 10 integers: " );
          for (i=0;i<10;i++) 
          {
           ar [i]= in.nextInt(); 
                  sum =sum+ar[i];
}
           Avg = sum/10;
          System.out.println ("  average:  "+Avg );              
}
}
               
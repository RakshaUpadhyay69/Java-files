import java.util.Scanner;
class IntAvg2
{
        public static void main (String args[])
        {
        Scanner in= new Scanner(System.in);
        int i,count = 0;
        float sum= 0.0f,Avg;
        int ar[]= new int[10];
         System.out.println ("enter 10 numbers: ");
         for ( i=0;i<10;i++)
          {
          ar[i]= in.nextInt();
          sum =sum +ar[i];
           }
          Avg = sum/10;
           for (i=0;i<10;i++)
           {
           if (ar[i]<Avg)
          {
          count++;
          }
         }  
         System.out.println ("average: "+Avg);
         System.out.println ("total numbers less than average= " +count);
    }
}
      
       
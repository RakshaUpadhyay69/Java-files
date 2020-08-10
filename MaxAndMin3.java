import java.util.Scanner;
class MaxAndMin3
{ public static void main(String[ ] args)
  { Scanner scan = new Scanner(System.in);
    int[ ] ar = new int[20];
    int i;
System.out.println("\nEnter 20 elements into array : ");
for(i=0;i<20;i++)
    { ar[i] = scan.nextInt(); }
    int max1 = ar[0] , min1 = ar[0]; 
    for(i=0;i<20;i++)
    { if(ar[i]>max1)	max1=ar[i];
      if(ar[i]<min1)		min1=ar[i]; }
    int max2 = min1 , min2 = max1;
    for(i=0;i<20;i++)
    { if(ar[i]>max2 && ar[i]<max1)
    { max2=ar[i]; }
      if(ar[i]<min2 && ar[i]>min1)	
      { min2=ar[i]; }
    }
    int max3 = min2 , min3 = max2;
    for(i=0;i<20;i++)
    { if(ar[i]>max3 && ar[i]<max2)	
      { max3=ar[i]; }
    if(ar[i]<min3 && ar[i]>min2)	
      { min3=ar[i]; }
    }
    System.out.println("Greatest 3 elements are : "+max1+" "+max2+" "+max3);
    System.out.println("Smallest 3 elements are : "+min1+" "+min2+" "+min3);
   }
}
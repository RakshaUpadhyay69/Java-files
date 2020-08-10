import java.util.Scanner;
class MarksCount
{ public static void main(String[ ] args)
  { Scanner scan = new Scanner(System.in);
    int ar[ ] = new int[30];
    int i,j,count;
    System.out.print("Enter number of students : ");
    int N = scan.nextInt();
    System.out.println("Enter marks of "+N+" students : ");
    for(i=0;i<N;i++)	{ ar[i] = scan.nextInt(); }
    System.out.print("\n");
    for(j=0;j<=100;j++)
    { count = 0;
    for(i=0;i<N;i++)
    { if(ar[i]==j)	count++; }
    System.out.println("No. of students scored "+j+" : "+count);    }
}	}
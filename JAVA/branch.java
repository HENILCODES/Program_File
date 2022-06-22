import java.util.Scanner; 
class branch
{
	public static void main(String arg[])
	{
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Choose Following Option ");
		System.out.println(" 1. Check Positive, Nagetive, Zero");
		System.out.println(" 2. Swap Two Number");
		System.out.println(" 3. Print Accending Order Seris");
		System.out.print("\n Enter Choise : ");
		a =s.nextInt();
		switch(a)
		{ 
			case 1:
					System.out.print("\n Enter Number ");
					int b=s.nextInt();
					if(a<0)
						System.out.println("Nagetive");
					else if(a==0)
						System.out.println("Zero");
					else
						System.out.println("Positive");
					break;
			case 2:
					System.out.println("Enter Two Number for Swap");
					System.out.print("First Number : ");
					int A =s.nextInt();
					System.out.print(" Second Number : ");
					int B =s.nextInt();
					System.out.println("First ="+A);
					System.out.println("Second ="+B);
					int t;
					System.out.println("\t Aftre Swap ");
					t = A;
					A = B;
					B = t;
					System.out.println("First ="+A);
					System.out.println("Second ="+B);
					break;
			case 3:
					System.out.print("\n Enter one Number : ");
					int c=s.nextInt();
					System.out.println("Order list ");
					int i=0;
					while(i<=c)
					{
						System.out.println(i);
						i++;
					}
					break;
			default:
					System.out.println("Not valid number");
		}
	}
}
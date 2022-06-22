import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		Scanner ob1 = new Scanner(System.in);
		int a;
		System.out.print("Enter Number : ");
		a = ob1.nextInt();
		System.out.println("\t Multiplication Table");
		for(int i=1;i<=10;i++)
		{
			System.out.println(a +" x "+ i +" = "+(a*i));	
		}
	}
}
import java.util.Scanner;
class input
{
	public static void main(String arg[])
	{
		Scanner hp = new Scanner(System.in);
		Scanner h = new Scanner(System.in);
			
		System.out.print("Enter Number =");
		int a=hp.nextInt();
		System.out.println("Number is = "+a);
		System.out.print("Enter Name =");
		String b=h.nextLine();
		System.out.println("Name is = "+b);
		
	}
}
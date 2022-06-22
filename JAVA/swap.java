// Swap Two number
class swap
{
	public static void main(String arg[])
	{
		int a=Integer.parseInt(arg[0]);
		int b=Integer.parseInt(arg[1]);
		int c;
		System.out.println("First Number = "+ a);
		System.out.println("Second Number = "+ b);
		
		System.out.println("\t After Swap Number");
		c = a;
		a = b;
		b = c;
		System.out.println("First Number = "+ a);
		System.out.println("Second Number = "+ b);
	}
}
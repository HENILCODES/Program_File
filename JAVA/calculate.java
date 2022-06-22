// program for calculate two number 
class calculate
{
	public static void main(String arg[])
	{
		int a=Integer.parseInt(arg[0]);
		int b=Integer.parseInt(arg[1]);
		System.out.println("First Number  = "+ a);
		System.out.println("Second Number = "+ b);
		System.out.println(" ( + ) = "+ (a+b));
		System.out.println(" ( - ) = "+ (a-b));
		System.out.println(" ( * ) = "+ (a*b));
		System.out.println(" ( / ) = "+ (a/b));
	}
}
class factorial
{
	public static void main(String args[])
	{
		// int a=Integer.parseInt(args[0]);
		int a=5;
		int fact=1,i=1;
	
		while(i<=a)
		{
			fact=fact*i;
			i++;
		}
			System.out.println("Factorial = "+fact);
	}
}
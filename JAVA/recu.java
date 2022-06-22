class recu
{
	int fact=1,i=1;
	recu(int n)
	{
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
			System.out.println("Factorial = "+fact);
	}
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		recu r1 = new recu(a);
	}
}
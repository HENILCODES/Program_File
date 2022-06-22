// Check number is prime or not
class prime
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int c=0,i;
		System.out.println(a);
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
				c++;
		}
		if(c==2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}
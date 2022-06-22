//add 3 number in(2 integer & 1 float)
class h1
{
	public static void main(String args[])
	{
		int a,b;
		float c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Float.parseFloat(args[2]);
		System.out.println("Addition "+(a+b+c));
	}
}

class A
{
	int roll;
	A(int d,String s)
	{
		roll = d;
		System.out.println(roll);
		System.out.println(s);
	}
}
class inher
{
	public static void main(String arg[])
	{
		A a1 = new A(Integer.parseInt(arg[0]),arg[1]);
	}
}
class thi
{
	int name;
	thi(int name)
	{
		this.name = name;
		System.out.println(this.name);
		name+=2;
		System.out.println(name);
	}
	public static void main(String args[])
	{
		new thi(19);
	}
}
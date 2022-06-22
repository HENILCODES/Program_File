class overload
{
	int age;
	String name;
	void value(String a)
	{
		name=a;
		System.out.println("Name = "+name);
	}
	void value(int b)
	{
		age = b;
		System.out.println("Age = "+age);
	}
	public static void main(String args[])
	{
		overload p1= new overload();
		p1.value(19);
		p1.value("henil");
	}
}
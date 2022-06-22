class Student
{
	int roll;
	String name;
	void input(int r,String N)
	{
		roll= r;
		name = N;
	}
}
class Per extends Student
{
	float pers;
	void input(float p)
	{
		pers = p;
	}
	void disp(){
		System.out.print(roll+" "+name+" "+pers);
	}
}
class perent
{
	public static void main(String args[])
	{
		Per s = new Per();
		s.input(Integer.parseInt(args[0]),args[1]);
		s.input(Integer.parseInt(args[2]));
		s.disp();
	}
}
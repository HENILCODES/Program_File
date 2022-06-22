import java.util.Scanner;
class Student
{
	int Roll_No;
	String Name;
	Scanner STD1 = new Scanner(System.in);
	Student()
	{
		System.out.print("Enter Student Name = ");
		Name = STD1.nextLine();
		System.out.print("Enter Roll Number = ");
		Roll_No = STD1.nextInt();
	}
}
class disp extends Student
{
	void display()
	{
		System.out.println("Roll Number = "+Roll_No);
		System.out.println("Name = "+Name);
	}
	
}
class inherit
{
	public static void main(String args[])
	{
		disp St1 = new disp();
		St1.display();
	}
}
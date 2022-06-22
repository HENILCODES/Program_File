import java.util.Scanner;
class Profile
{
	Scanner P1 = new Scanner(System.in);
	long Contact,Age;
	String Full_Name;
	long Account_Number;
	void input_profile()
	{
		System.out.print("Enter Full Name : ");
		Full_Name=P1.nextLine();
		System.out.print("Enter Account Number : ");
		Account_Number=P1.nextInt();
		System.out.print("Enter Contact Number : ");
		Contact=P1.nextInt();
	}
} 
class Display extends Profile
{
		void Profile_Detail()
		{
			System.out.println("Account Holder Name : "+Full_Name);
			System.out.println("Account Number : "+Account_Number);
			System.out.println("Contact Number : "+Contact);
		}
}
class HP
{
	public static void main(String args[])
	{
		Display d1 = new Display();
		d1.input_profile();
		d1.Profile_Detail();
	}
}
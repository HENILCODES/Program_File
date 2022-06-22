class empl2
{
	public static void main(String arg[])
	{
		float salary;
		salary=Float.parseFloat(arg[0]);
		System.out.println("Enter Salary = "+salary);
		
		if(salary<=25000)
		{
			System.out.println("Total Salary + Bonus = "+(salary+5000));
		}
	}
}
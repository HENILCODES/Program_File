class empl
{
	public static void main(String arg[])
	{
		float basic_salary,da,hra;
		basic_salary=Float.parseFloat(arg[0]);
		System.out.println("Enter Salary Is = "+basic_salary);
		if(basic_salary >= 50000)
		{
			da = basic_salary*10/100;
			hra = basic_salary*20/100;
			System.out.println("Total Salary = "+ (basic_salary+da+hra));
		}
	}
}
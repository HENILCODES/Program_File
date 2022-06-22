class empl1
{
	public static void main(String arg[])
	{
		float basic_salary,Da,Hra;
		basic_salary=Float.parseFloat(arg[0]);
		System.out.println("Enter Salary Is = "+basic_salary);
		
		if(basic_salary>=25000 && basic_salary<=50000)
		{
			Da =  basic_salary*5/100;
			Hra = basic_salary*10/100;
			System.out.println("Total Salary  = "+(basic_salary+Da+Hra));
		}
	}
}
// Number positive and nagtive
class posit_nagt
{
	public static void main(String arg[])
	{
		int a =Integer.parseInt(arg[0]);
		System.out.println("Number is = "+ a);
		if(a<0)
			System.out.println("Nagtive number");
		else if(a>0)
			System.out.println("Postive number");
		else
			System.out.println("Zero number");
	}
}
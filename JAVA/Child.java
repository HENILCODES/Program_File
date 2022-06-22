class HvP_Stock
{
	double stock,Buy_stock;
	HvP_Stock()                      //Default constructor WithOut Perameter
	{
		stock = 5500.56; 
		System.out.println("HvP Stock Total Price is "+stock+" $ Per Month" );
	}
	HvP_Stock(double B_s)               // constructor With Perameter
	{
		Buy_stock = B_s;
		System.out.println("You are Total "+Buy_stock+" $ Buy Stock");
	}
	public static void main(String args[])
	{
		HvP_Stock h = new HvP_Stock();
	}
}
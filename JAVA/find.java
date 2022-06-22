class Area 
{
	double pi=3.14;
	void disp(int a)
	{
		System.out.println("Area of Circle = "+(pi*a*a));
	}
}
class Circle extends Area
{
	void Find_circle(int r)
	{
		disp(r);
	}
}
class Rectangle extends Area
{
	void Find_Rectangle(int length, int width)
	{
		pi = width*length;
		System.out.println("Area of Rectangle = "+ pi);
	}
}
class find
{	
	public static void main(String arg[])
	{
			Circle c = new Circle();
			c.Find_circle(10);
			Rectangle r = new Rectangle();
			r.Find_Rectangle(15,12);
	}
}
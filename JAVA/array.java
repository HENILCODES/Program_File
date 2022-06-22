import java.util.*;
class array
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		int a[] = new int[2];
		String b[] = new String[2];
		

		b[0]="G";
		b[1]="G";
		for (int i = 0; i < b.length; i++) {
			System.out.print("Enter");	
			a[i] = s.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + b[i]);
		}
	}
}
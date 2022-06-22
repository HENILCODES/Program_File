import java.util.*;

public class cal {
	void sum(int n, int m) {
		System.out.println("Sum = " + (n + m));
	}

	void subt(int n, int m) {
		System.out.println("Subtract = " + (n - m));
	}

	void mult(int n, int m) {
		System.out.println("Multipli =  " + (n * m));
	}

	void divi(int n, int m) {
		System.out.println("Divide = " + (n / m));
	}

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int a, b;
		System.out.print("Enter 1st number");
		a = s1.nextInt();
		System.out.print("Enter 2nd number");
		b = s1.nextInt();
		String s = new String();
	
		cal c1 = new cal();
		c1.sum(a, b);
		c1.mult(a, b);
		c1.subt(a, b);
		c1.divi(a, b);
	}
}

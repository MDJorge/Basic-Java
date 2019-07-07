import java.util.Scanner;

public class GCD
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Compute the Greatest Common Divisor of" + "two positive Integers using Euclids Algorithm.");
		System.out.println("Enter two positive integers.");
		System.out.print("a = ");
		int a = Integer.parseInt(keyboard.nextLine());
		System.out.print("b = ");
		int b = Integer.parseInt(keyboard.nextLine());
		
		if(a < 0)
			a *= -1;
			
		if(b < 0)
			b *= -1;
			
		if(a < b)
		{
			int c = a;
			a = b;
			b = c;
		}
		
		int A = a;
		int B = b;
		
		int q = a / b;
		int r = a % b;
		
		while(r != 0)
		{
			System.out.println(a + " = (" + b + ")(" + q + ") + " + r);
			a = b;
			b = r;
			q = a / b;
			r = a % b;
		}
		System.out.println(a + " = (" + b + ")(" + q + ")");
		System.out.println("GCD(" + A + "," + B + ") = " + b);
	}
}
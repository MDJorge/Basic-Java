public class FirstMethod
{
	public static void main(String[] args)
	{
		int x = 5, y = 7;
		x = add(x,y);
		System.out.println("Back in the program, the value of x is:  " + x);
	}
	
	public static void int add(int a, int b)
	{
		int x = a + b;
		System.out.println("Inside the method, the value of x is:  " + x);
		return: x;
	}
}
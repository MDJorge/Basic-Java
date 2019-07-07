import java.util.Scanner;

public class Program1
{
	public static void main(String[] args)
	{
		Integer num1, num2, answer, primaryanswer;
		String firstInteger = "";
		String secondInteger = "";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter two integers.");
		System.out.print("a = ");
		firstInteger = keyboard.nextLine();
		System.out.print("b = ");
		secondInteger = keyboard.nextLine();
		
		
		num1 = Integer.parseInt(firstInteger);
		num2 = Integer.parseInt(secondInteger);
		primaryanswer = num2 - 3;
		answer = primaryanswer / num1;
		
		System.out.println(num2 + " = (" + answer + " * " + num1 + ") + 3");
	}
}
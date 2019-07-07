import java.util.Scanner;

public class StandardArrays
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		System.out.print("> ");
		int length = Integer.parseInt(keyboard.nextLine());
		double[] numbers = new double [length];
		// Enter the numbers one at a time.
		System.out.println("Enter each of the numbers");
		for(int i = 0; i < length; i++)
		{
			System.out.print((i+1) + ">  ");
			numbers[i] = Double.parseDouble(keyboard.nextLine());
		}
		
		double average = 0;
		System.out.print("You entered:\n{");
		for(int i = 0; i < length; i++)
		{
			if(i > 0)
				System.out.print(",");
				
			System.out.print(" " + numbers[i]);
			average += numbers[i];
		}
		System.out.println(" }");
		
		average /= length;
		
		System.out.println("The average is " + average);
	}
}
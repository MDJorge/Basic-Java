import java.util.Scanner;

public class StandardArrayExample
{		
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double[] numbers = getNewArrayFrom(keyboard);				
		displayList(numbers);
		
		int choice = 1;
		while(choice > 0)
		{
			System.out.println("What would you like to do?");
			System.out.println("1) Enter a new list.");
			System.out.println("2) Average the stored list.");
			System.out.println("3) Display the current list.");
			System.out.println("0) Quit.");
			
			choice = Integer.parseInt(keyboard.nextLine());
			
			if(choice < 0 || choice > 3)
			{
				System.out.println("Invalid Choice, " + choice);
				choice = 1;
				continue;
			}
			
			if(choice == 1)
			{
				numbers = getNewArrayFrom(keyboard);
			}	
			else if(choice == 3)
			{
				displayList(numbers);
			}
			else if(choice == 2)
			{
				System.out.println("The average is " + computeAverage(numbers));
			}
		}
		
		System.out.println("Goodbye...");
	}
	
	public static double computeAverage(double[] numbers)
	{
		double average = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			average += numbers[i];
		}
		average /= numbers.length;
		
		return average;
	}
	
	public static void displayList(double[] numbers)
	{
		System.out.print("You entered:\n{");
		for(int i = 0; i < numbers.length; i++)
		{
			if(i > 0)
				System.out.print(",");
			
			System.out.print(" " + numbers[i]);
		}
		System.out.println(" }");
	}
	
	/**
	 * Get a new standard array of doubles from the given input
	 * @param input	The source stream for reading numbers.
	 * @return returns the list entered by the user.
	 */
	public static double[] getNewArrayFrom(Scanner input)
	{
		System.out.println("How many numbers do you want to enter?");
		System.out.print(">  ");
		int length = Integer.parseInt(input.nextLine());
		double[] numbers = new double[length];
		// Enter the numbers one at a time.
		System.out.println("Enter each of the numbers.");
		for(int i = 0; i < length; i++)
		{
			System.out.print((i+1) + ">  ");
			numbers[i] = Double.parseDouble(input.nextLine());
		}
		
		return numbers;
	}
}

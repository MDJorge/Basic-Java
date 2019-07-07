import java.util.Scanner;

public class circlestuff
{
	public static void main(String[] args)
	{
		double radius, circumference, area;
		String textFromKeyboard = "";
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the radius of a circle.");
		System.out.print("> ");
		
		textFromKeyboard = keyboard.nextLine();
		
		radius = Double.parseDouble(textFromKeyboard);
		circumference = 2 * Math.PI * radius;
		area = Math.PI * radius * radius;
		
		System.out.println("A circle with a radius of " + radius + " cm has a circumference of " + circumference + " cm. It also has an area of " + area + " cm^2.");
	}
}
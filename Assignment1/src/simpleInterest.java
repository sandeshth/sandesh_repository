import java.util.Scanner; 

/*
 * This programme calculate the simple interest as per the user input.
 */

public class simpleInterest 
{
	public static void main(String[] args)
	{
	int principle, time;
	double rate;
	double simpleinterest;
	
	Scanner keyboard = new Scanner(System.in);
	
	// Get the user's principle
	System.out.print("Enter the principle: ");
	principle = keyboard.nextInt();
	
	// Get the user's time
		System.out.print("Enter the time in years: ");
		time = keyboard.nextInt();
		
		// Get the user's rate
		System.out.print("Enter the rate: ");
		rate = keyboard.nextDouble();
		
		rate = rate / 100;
		
		simpleinterest = (principle * time * rate) / 100;
		
		System.out.println("The simple interest is " + simpleinterest);
	}
		
	
}

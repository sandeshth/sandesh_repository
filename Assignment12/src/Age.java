import java.util.Scanner;

public class Age {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		
		int dateOfBirth;
		int age;
		int currentYear;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the current year: ");
		currentYear = keyboard.nextInt();
		
		System.out.println("What is your date of birth? ");
		dateOfBirth = keyboard.nextInt();
		
		age = currentYear - dateOfBirth;
		
		System.out.println("Your current age is " + age);
		
	}

}

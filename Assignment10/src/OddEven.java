import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		CheckOddEven();

	}
	
	public static void CheckOddEven()
	{
		int number;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		number = keyboard.nextInt();
		
		if(number % 2 == 0)
		{
			System.out.print("The number is even.");
		}
		else
		{
			System.out.print("The number is odd.");
		}
		
	}

}

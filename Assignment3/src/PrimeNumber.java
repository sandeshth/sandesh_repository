import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		primeNumber();

	}

	public static void primeNumber()
	{
		int number;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		number = keyboard.nextInt();
		
		for(int i =2; i <= number; i++)
		{
			int count = 0;
			
			for(int divider = 2; divider < i; divider++)
			if(i % divider == 0)
			{
				count = 1;
			    break;
			}
			
			if(count == 0)
			{
				System.out.print(" " + i);
			}
		}
		
		
	}
}

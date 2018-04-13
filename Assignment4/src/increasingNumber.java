import java.util.Scanner;

public class increasingNumber 
{
	public static void main(String[] args)
	{
		int num;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		num = keyboard.nextInt();
		
		for(int i = 1; i <= num; i++)
		{
			for(int j  = 1; j < (i + 1); j++)
			{
			System.out.print(i);
			}
			System.out.println();
		}
	}

}

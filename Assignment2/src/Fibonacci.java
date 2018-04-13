import java.util.Scanner;

/*
 * This programme displays the fibonacci series.
 */

public class Fibonacci 
{
	public static void main(String[] args)
	{
		int num;
		
		Scanner keyboard = new Scanner(System.in);
		
		int first = 0;
		int second = 1;
		int third;
		
		System.out.println("Enter the number: ");
		num = keyboard.nextInt();
		
		System.out.println(first);
		System.out.println(second);
		
		do { 
	          third = first + second;
	          
	          System.out.println(third);
	          
	          first = second;
	          second = third;
	          third++;
			
		}
		while(third <= num);	
	}
}

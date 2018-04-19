import java.util.Scanner;

public class ReverseString
{
	public static void main(String[] args)
	{
		String name;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print(" Enter the one word name: ");
		name = keyboard.nextLine();
		
		for(int i = name.length() - 1; i >= 0; i--)
		{
			System.out.println(name.charAt(i));
			
		}
	}
}

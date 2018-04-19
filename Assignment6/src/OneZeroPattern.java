import java.util.Scanner;

public class OneZeroPattern {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		final int BASE_SIZE = 5;
		
		for(int i = BASE_SIZE; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(i%2);
			}
			
			System.out.println();
		}
		
	}

}

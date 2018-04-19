import java.util.Scanner;
import java.text.DecimalFormat;

public class FahtoCel {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		double fahrenite;
		double celsius;
		
		DecimalFormat formatter = new DecimalFormat("#0.00");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the temperature of fahrenite: ");
		fahrenite = keyboard.nextDouble();
		
		celsius = (fahrenite - 32.0) * (5.0/9.0);
		
		System.out.println("The temperature in celsius is " + 
									formatter.format(celsius));	

	}

}

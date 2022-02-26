/****************************************************
/Aziah Blanding
/Loop-Labs
/November 8, 2021
/Output by the 2nd power using for, while, and do-while loops
*****************************************************/
import static java.lang.Math.*;

public class Looplab4
{
	public static void main(String[] args)
	{
		//Executing for loop and using pow method for calculating the 2nd power
		System.out.println("For Loop: ");
		int i;
		for(i = 1; i <= 20; i++)
			System.out.println(i + "^2 = " + pow(i,2));

		// Add a break b/w lines
		System.out.println(" ");

		//Executing while loop
		System.out.println("While Loop: ");
		int counter = 1;
		while(counter <= 20)
		{
			System.out.println(counter + "^2 = " + pow(counter,2));
			counter++;
		}

		System.out.println(" ");

		//Executing do-while loop
		System.out.println("Do-while Loop: ");
		int count = 1;
		do
		{
			System.out.println(count + "^2 = " + pow(count,2));
			count++;
		}
		while(count <= 20);



	}
}
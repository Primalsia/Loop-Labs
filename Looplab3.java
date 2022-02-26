/****************************************************
/Aziah Blanding
/Loop-Labs
/November 8, 2021
/Outputting "*HELLO*" 5 times using for, while, and do-while loops
*****************************************************/

public class Looplab3
{
	public static void main(String[] args)
	{
		//Executing for loop
		System.out.println("For Loop: ");
		int i = 0;
		for(i = 1; i <= 5; i++)
			System.out.println("*HELLO*");

		//Executing while loop
		System.out.println("While Loop: ");
		int counter = 1;
		while(counter <= 5)
		{
			System.out.println("*HELLO*");
			counter++;
		}

		//Executing do-while loop
		System.out.println("Do-while Loop: ");
		int count = 1;
		do
		{
			System.out.println("*HELLO*");
			count++;
		}
		while(count <= 5);



	}
}
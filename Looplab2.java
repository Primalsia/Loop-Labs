/****************************************************
/Aziah Blanding
/Loop-Labs
/November 8, 2021
/Adding 10's from 7 using for, while, and do-while loops
*****************************************************/

public class Looplab2
{
	public static void main(String[] args)
	{
		//Executing for loop
		System.out.println("For Loop: ");

		int i;
		for(i = 7; i <= 57; i = i + 10)
			System.out.println(i + " ");
			System.out.println();

		//Executing while loop
		System.out.println("While Loop: ");

		int counter = 7;
		while(counter <= 57)
			{
				System.out.println(counter + " ");
				counter = counter + 10;
			}
			System.out.println();

		//Executing do-while loop
		System.out.println("Do-while Loop: ");

		int count = 7;
		do
		{
			System.out.println(count + " ");
			count = count + 10;
		}
		while(count <= 57);
		System.out.println();

	}
}
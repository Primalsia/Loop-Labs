/****************************************************
/Aziah Blanding
/Loop-Labs
/November 8, 2021
/Count by 5's using for, while, and do-while loops
*****************************************************/

public class Looplab1
{
	public static void main(String[] args)
	{
		//executing for loop
		System.out.print("For Loop: ");

		int i;
		for(i = 5; i <= 40; i = i + 5)
			System.out.print(i + " ");
			System.out.println();

		//Executing while loop
		System.out.print("While Loop: ");

		int counter = 5;
		while(counter <= 40)
			{
				System.out.print(counter + " ");
				counter = counter + 5;
			}
			System.out.println();

		//Executing do-while loop
		System.out.print("Do-while Loop: ");

		int count = 5;
		do
		{
			System.out.print(count + " ");
			count = count + 5;
		}
		while(count <= 40);
		System.out.println();

	}
}
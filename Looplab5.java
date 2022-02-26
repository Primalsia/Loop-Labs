/****************************************************
/Aziah Blanding
/Loop-Labs
/November 8, 2021
/Output time tables using for, while, and do-while loops
*****************************************************/

public class Looplab5
{
	public static void main(String[] args)
	{
		//Executing for loop
		System.out.println("For Loop: ");
		int mult = 0;
		int i;
		for(i = 1; i <= 5; i++)
			{
				for(mult = 1; mult <= 10; mult++)
				System.out.println(i + "*" + mult +" = " + (i*mult));
				System.out.print("\n");
			}

		//Executing while loop
		System.out.println("While Loop: ");
		int num = 1;
		int numtotal = 1;
		int counter = 1;
		while(numtotal <= 10)
		{
			while(counter <= 10)
				{
					while(num <= 5)
						{
							System.out.print(num + "*" + counter + " = " + (counter*num) + "       ");
							num++;
						}
					num = 1;
					System.out.print("\n");
					counter++;
				}
				numtotal++;
			}
//break
		System.out.println("\n");

		//Executing do-while loop
		System.out.println("Do-while Loop: ");
		int n = 1;
		int count = 1;
		int total = 1;
		do
		{
				do
				{
					do
					{
						System.out.print(n+"*"+count+" = "+(n*count)+"    ");
						n++;
					}
					while(n <= 5);
					n = 1;
					System.out.println("   ");
					count++;
				}
				while(count <= 10);

			total++;
		}
		while(total <= 1);

	}
}

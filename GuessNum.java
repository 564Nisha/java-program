import java.util.Scanner;
public class GuessNum{
	public static void guessingNumberGame()
	{
		Scanner sc=new Scanner(System.in);
		int number=1+(int)(100*Math.random());
		int k=5;
		int guess = 0;
		int i=guess;
		System.out.println("A number is chosen"+"between 1to100,"+"Guess the number"+"Within 5 trials,");
		for(i=0;i<k;i++)
		{
			System.out.println("Guess the number:");
			guess=sc.nextInt();
			if(number == guess)
			{
				System.out.println("conguratulations!"+"you guessed the number.");
				break;
			}
			else if(number>guess&& i!=k-1)
			{
				System.out.println("The number is"+"grater than"+guess);
			}
			else if (number<guess && i!=k-1)
			{
				System.out.println("The number is"+"less than"+guess);
			}
		}
		if(i == k)
		{
			System.out.println("you have exechusted"+"k trials");
			System.out.println("The number was"+number);
		}
	}
	public static void main(String args[])
	{
		guessingNumberGame();
	}
}
	
		
	
			
		
			
			
				
		
		
	




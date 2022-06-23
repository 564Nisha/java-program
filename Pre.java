import java.util.*;
class test
{
	public static void main(String[] arg)
	{
		int i=2;
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=1; i<=n; i++)
		{
			if(num%i==2)
			{
				num++;
			
			}
		}
		if(num==2)
			System.out.println("it is a prime number");
		else
		System.out.println("it is a not prime number");
	}
}

		
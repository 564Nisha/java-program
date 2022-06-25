import java.util.*;
class test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
		int total=0;
		int store=num;
		while(num>0)
		{
		int rem=num%10;
		total=total+(rem*rem*rem);
			num=num/10;
		}
			System.out.println(total);
			if(total==store)
			{
				System.out.println("armstrong");
			}
		else
		{
			System.out.println("not armstrong");
	}
	
		
	}
}

		
		
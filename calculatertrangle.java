import java.util.*;
class test
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your character:-");
		String ch=sc.nextLine();
		switch(ch)
		{
			case"triangle":
			System.out.println("enter a breadth:");
			System.out.println("enter a hight:");
			int b=sc.nextInt();
			int h=sc.nextInt();
			double area=(b*h)/2;
			System.out.println("area of triangle:"+area);
			break;
			case"e":
			System.out.println("vowel");
			break;
			
		}
	}
}
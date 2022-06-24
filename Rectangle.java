import java.util.*;
class test
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter a leagth: "+l);
		System.out.println("enter a breadth: "+b);
		double perimeter=2*(l+b);
		System.out.println("perimeter of trangle is: "+perimeter);
	}
}
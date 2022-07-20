import java.util.*;
class test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Mathematics marks:");
		int Mathematics=sc.nextInt();
		System.out.println("Enter your physics marks:");
		int physics=sc.nextInt();
	    System.out.println("Enter your english  marks:");
		int english=sc.nextInt();
		System.out.println("Enter your chemistry  marks:");
		int chemistry=sc.nextInt();
		System.out.println("Enter your computer marks:");
		int computer=sc.nextInt();
		int total=Mathematics+physics+english+chemistry+computer;
		double perecentage=((total*100)/500);
		System.out.println("perecentage:");
		System.out.println(percentage);
	
	}
}
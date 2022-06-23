import java.util.*;
class test
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("enter a breadth: "+b);
		System.out.println("enter a height: "+h);
	
		double area=b*h/2;
		System.out.println("area of Rhombus" +area);
	}
}

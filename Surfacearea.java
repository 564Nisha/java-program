import java.util.*;
class test
{
	

 public static void main(String[] arg)
	{
		
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	int h=sc.nextInt();
	System.out.println("enter a radius: ");
	System.out.println("enter a height: ");
	double surfacearea=3.14*r*(r+h);
	System.out.println("surface area of cylinder is:"+surfacearea);
	}
}

import java.util.*;
class test
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int t1=0,t2=1;
		int next=t1+t2;
		System.out.println(t1+"\n"+t2);
		for(int i=0;i<num;i++)
		{
			t1=t2;
			t2=next;
			next=t1+t2;
			System.out.println(next);
		}
	}
}
	
			
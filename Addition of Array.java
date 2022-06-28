import java.util.*;
import java.lang.Math;
class test
{
	public static void main(String[] arg)
	{
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	System.out.println("enter your size:- ");
	
	int arr1[]=new int[size];
	int arr2[]=new int[size];
	int arr3[]=new int[size];
	System.out.println("enter your element");
	
	for(int i=0;i<size;i++)
	{
	
		arr1[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		arr2[i]=sc.nextInt();
	}
	
			System.out.println("your element are- ");
			for(int i=0;i<size;i++)
			{
				System.out.println(arr1[i]);
			}
for(int i=0;i<size;i++)
{

	System.out.println(arr2[i]);

}
  System.out.println("result- ");
   for(int i=0;i<size;i++)
   {
	   

	arr3[i]=arr1[i]+arr2[i];
   }
   

   for(int i=0;i<size;i++)
   {

	System.out.println(arr3[i]);
   }
	}
}






	

	


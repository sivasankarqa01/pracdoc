package arrays;
import java.util.Scanner;

public class Arraydec {

	public static void main (String args[])
	{
		int a[]= {1,2,3,4,5};
		int[] b= new int[10];
		int n=8;
		int y=5;
		int aaa[]=new int[y];
		int[] c=new int[n];

		
//printing the elements in the array a
		System.out.println("enter the array elements for the array a");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
	// for array b
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the array elements for the array b");
		for(int i=0;i<b.length;i++)
		{
			b[i]=scan.nextInt();
			
			
		}
		System.out.println("printing the elements");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
			
		}
		
		System.out.println("enter the array elements for the array aaa");
		for(int i=0;i<aaa.length;i++)
		{
			aaa[i]=scan.nextInt();
			
			
		}	
		
		System.out.println("printing the elements");
		for(int i=0;i<aaa.length;i++)
		{
			System.out.println(aaa[i]);
			
		}
		System.out.println("string to array");
		
		String name="siva";
		
		
		char[] ss=name.toCharArray();
		
		System.out.println("printing the elements");
		for(int i=0;i<ss.length;i++)
		{
			System.out.println(ss[i]);
			
		}
		
		
		
		
		
	}







}
	
	
package pkg1;

import java.util.Scanner;

public class ScannerClass 
{
	//(((((x1+x2)-x3)*x4)+x5)/x6)
	
	public int sum(int a, int b)
	{
		int c = a+b;
		return c;
	}
	public int sub(int a, int b)
	{
		int c = a-b;
		return c;
	}	
	public int mul(int a, int b)
	{
		int c =  a*b;
		return c;
	}
		
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("Value of (((((x1+x2)-x3)*x4)+x5)/x6) is "+c);
	}
	public static void main(String[] args) 
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x1");
		int x1 = s.nextInt(); 
		System.out.println("Enter x2");
		int x2 = s.nextInt(); 
		System.out.println("Enter x3");
		int x3 = s.nextInt(); 
		System.out.println("Enter x4");
		int x4 = s.nextInt(); 
		System.out.println("Enter x5");
		int x5 = s.nextInt(); 
		System.out.println("Enter x6");
		int x6 = s.nextInt();
		
	ScannerClass obj =  new ScannerClass();
	int addone = obj.sum(x1,x2);
	System.out.println("Value of x1+x2= "+ addone);
	int subs = obj.sub(addone, x3);
	System.out.println("Value of x1+x2-x3 = "+ subs);
	int multi = obj.mul(subs, x4);
	System.out.println("Value of (x1+x2-x3)*x4= "+ multi);
	int subtwo = obj.sum(multi, x5);
	System.out.println("Value of (((x1+x2)-x3)+x5)= "+ subtwo);
	obj.div(subtwo, x6);
	
	

	}	
}

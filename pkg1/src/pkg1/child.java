package pkg1;

public class child extends parent
{
	public void method5()
	{
		System.out.println("Child default method");
	}
	public void method6(int a)
	{
		System.out.println("Child 1 method");
	}
	public void method7(int a, int b)
	{
		System.out.println("Child 2 method");
	}
	public void method8(int a, int b, int c)
	{
		this.method1(1);
		this.method();
		this.method3(1,2,3);
		super.method4(1, 2, 3, 4);
		this.method5();
		this.method6(1);
		this.method7(1, 2);
		this.method9(1, 2, 3, 4);
		System.out.println("Child 3 method");
	}
	public void method9(int a, int b, int c, int d)
	{
		System.out.println("Child 4 method");
	}	
	public static void main(String[] args) 
	{
		child obj = new child();
		obj.method8(1,2,3);		
	}
}

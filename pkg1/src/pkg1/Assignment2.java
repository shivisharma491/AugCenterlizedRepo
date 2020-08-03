package pkg1;

public class Assignment2 
{
	
	//expression (10-2)+2)*2/2
	
	public int sub(int a, int b) 
	{
		int c = a-b;
		System.out.println("Sub value "+c);
		return c;
	}
	
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("After sum"+c);
		return c;
	}
	
	public int mult(int a, int b)
	{
		int c = a*b;
		System.out.println("After Multiple "+c);
		return c;
    }
	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("After Divide " +c);
	}
	
	public static void main(String[] args) 
	{
		Assignment2 obj = new Assignment2();
		int x,y,z;
		x = obj.sub(10, 2);
		y = obj.sum(x, 2);
		z = obj.mult(y, 2);
		obj.div(z, 2);
		
	}
}
	
package pkg1;

public class Assignment1 
{
	//Code for the Expression (10+2)+2)*2/2
	
	//create method to sum the values
	public int sum(int a, int b)    
	{
		int c = a+b;
		System.out.println("The value sum = "+c);
		return c;
	}
	
	//create method to multiply the values
	
	public int mult(int a, int b)
	{
		int c = a*b;
		System.out.println("The value of multiple "+c);
		return c;
	}
	
	//create method to divide the values
	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("The value after divide "+c);
		
	}

	public static void main(String[] args) 
	{
		Assignment1 obj = new Assignment1();
		int x = obj.sum(10, 2);
		int y = obj.sum(x, 2);
		int z = obj.mult(y, 2);
		obj.div(z, 2);
		
	}

}

package pkg1;

public class maruti 
{
	public maruti()
	{		
		this(1,2,4);
		System.out.println("Parent Default Constructor");
	}
	public maruti(int a)
	{
		this(1,2,34,1);
		System.out.println("Parent 1 Parameterized Constructor");
	}

	public maruti(int a, int b)
	{
		this(1);
		System.out.println("Parent 2 Parameterized Constructor");
	}
	public maruti(int a, int b, int c)
	{
		System.out.println("Parent 3 Parameterized Constructor");
	}
	
	public maruti(int a, int b, int c, int d)
	{
		this();
		System.out.println("Parent 4 Parameterized Constructor");
	}
}

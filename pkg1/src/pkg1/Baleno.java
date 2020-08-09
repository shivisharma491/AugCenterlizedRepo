package pkg1;

public class Baleno extends maruti
{
	public Baleno()
	{
		super(1,2);
		System.out.println("Child Default Constructor");
	}
	
	public Baleno(int a)
	{
		this(1,2,5);
		System.out.println("Child 1 Parametrized Constructor");
	}
	
	public Baleno(int a, int b)
	{
		this(3);
		System.out.println("Child 2 Parametrized Constructor");
	}
	
	public Baleno(int a, int b, int c)
	{
		this(1,2,3,4);
		System.out.println("Child 3 Parametrized Constructor");
	}
	
	public Baleno(int a, int b, int c, int d)
	{
		this();
		System.out.println("Child 4 Parametrized Constructor");
	}
	
	public static void main(String[] args) 
	{
		Baleno obj = new Baleno(1,2);
		
	}
     
}

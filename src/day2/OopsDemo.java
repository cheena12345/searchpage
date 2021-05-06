package day2;

public class OopsDemo {

	public static void main(String[] args)
	{
	OopsDemo ob1 =new OopsDemo();
	ob1.walk();
	
	OopsDemo ob2 =new OopsDemo();
	ob2 .Run();
	
	
	OopsDemo ob3 =new OopsDemo();
	//int c =ob3.sum();
	//System.out.println(c);
	
	System.out.println(ob3.sum());
	
	 

	}
public void walk()
{
	System.out.println("please walk");
	
}
public void Run()
{
	System.out.println("please Run");
	
}
public int sum()
{
	int a=10;
	int b=10;
	int c =a+b;
	return c;
	
}
}

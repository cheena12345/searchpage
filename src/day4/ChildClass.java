package day4;

public class ChildClass extends BaseClass {
	String name1 ="child calss variable";
	

	public void methodFromChild()
	{
		System.out.println("i am from Child class");
	}
	public static void main(String[] args) 
	{
		ChildClass ob1 =new ChildClass();
		ob1.methodFromChild();
		ob1.methodFromParent();
		

	}

}

package employee;

import company.Admin;

public class Programmer extends Admin{
	
public Programmer(String name) {
	System.out.println("Hey Thanks for Contacting us " +name);
	
}
public void developer()
{
	System.out.println("Base Salary is 35K");

}
public void automationTester()
{
	System.out.println("Base Salary is 30K");}

	public static void main(String[] args) {
		
		Programmer p  =new Programmer("cheena");
		
		p.adminsalary();
		p.automationTester();
		p.developer();
		
	}
}


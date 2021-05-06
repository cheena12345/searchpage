package day3;

public class polymophism 
{

	public static void main(String[] args)
	{
	}
	public void calculateEMI()
 {
	 System.out.println("Emi is 40K");
 }
	
	public void calculateEMI(int x)
 {
	System.out.println("emi is " +x); 
 }
 
	public void calculateEMI(double x)
 {
	System.out.println("emi is " +x);
 }
	
	public void calculateEMI(int x , double y)
	
 {
	System.out.println("emi is " +x  +y);
 }

}
 
 
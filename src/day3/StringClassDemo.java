package day3;

public class StringClassDemo {

	public static void main(String[] args) {
		
		
		String title ="Selenium is for Web Automation";
		System.out.println(title.toLowerCase());
		System.out.println(title.toUpperCase());
		
		String myNewTitle="Selenium for webAutomation";
		boolean result = title.equals(myNewTitle);
		System.out.println(result);
		boolean result1 = title.equalsIgnoreCase(myNewTitle);
		System.out.println(result1);
		System.out.println(title.contains("Selenium"));
				
	}

}

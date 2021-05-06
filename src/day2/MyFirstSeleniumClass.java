package day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumClass {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/cheenaarora/Downloads/chromedriver2");
		ChromeDriver ob1 = new ChromeDriver();
		ob1.get("");
		
	}

}

package day2;

import org.openqa.selenium.chrome.ChromeDriver;



public class Assignment3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/cheenaarora/Downloads/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://learn-automation.com");
		
		String s = driver.getTitle();
		System.out.println("The Title is " +s);
		
		
		
		String u =driver.getCurrentUrl();
		System.out.println("The URL is " +u);
		
		
		String p = driver.getPageSource();
		System.out.println("The URL is " +p);
		
		driver.close();
		
	}

}

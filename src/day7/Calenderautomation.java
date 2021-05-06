package day7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenderautomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/cheenaarora/Downloads/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.southwesthotels.com/index.html?label=SWA-GSUBNAV-HOTEL-BOOK&clk=GSUBNAV-HOTEL-BOOK");
		
		driver.findElement(By.xpath("//input[@id='ss']")).sendKeys("s");
		Thread.sleep(5000);
		
		
		
	List<WebElement> allMenus = driver.findElements(By.xpath("//ul[@class='c-autocomplete__list sb-autocomplete__list sb-autocomplete__list-with_photos']//li"));
	  driver.manage().timeouts().getImplicitWaitTimeout();
	
	int count = allMenus.size();
	System.out.println(count);
	


	
	for (WebElement values : allMenus) {
		String Values1 = values.getAttribute("innerHTML");
		
		System.out.println(Values1);
	}}
	

		
		
	
	
		
		

	}



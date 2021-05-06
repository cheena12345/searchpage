package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "/Users/cheenaarora/Downloads/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://mail.rediff.com/cgi-bin/login.cgi\n");
		
		
		 WebElement Newacc =driver.findElement(By.xpath("//u[text()='Create a new account']"));
		 Newacc.click();
		 Thread.sleep(2000);
		 
		 WebElement Fname =driver.findElement(By.xpath("//input[@name='name6f90d089']"));
		 Fname.sendKeys("cheena");		
		 
		 WebElement Id =driver.findElement(By.xpath("//input[@name='login6f90d089']"));
		 Id.sendKeys("cheena1234");	
		 
		 
		 
	}

}

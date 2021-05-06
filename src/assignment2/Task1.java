package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/cheenaarora/Downloads/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://mail.rediff.com/cgi-bin/login.cgi\n");
		
		
		 WebElement uname=driver.findElement(By.xpath("//input[@id='login1']"));
		 uname.sendKeys("cheena123");
		 
		 WebElement Submit=driver.findElement(By.xpath("//input[@title='Sign in']"));
		 Submit.click();
		 
		 String Alert = driver.switchTo().alert().getText();	
		 System.out.println("Alert message is" +Alert);
		 
		 
		 if (Alert.contains("password")) 
		 {
			 System.out.println("password is Present");
		 } 
		 else 
		 	{
			 System.out.println("password is  not Present");
		 	}
		 
		 
		 driver.switchTo().alert().accept();
		
	
		 uname.clear();
		 WebElement uname1=driver.findElement(By.xpath("//input[@id='login1']"));
		 uname1.sendKeys("cheena123");
		 
		 WebElement Password =driver.findElement(By.xpath("//input[@id='password']"));
		 Password.sendKeys("cheena123");
		 
		 WebElement Submit1=driver.findElement(By.xpath("//input[@title='Sign in']"));
		 Submit1.click();
		 WebElement error =driver.findElement(By.xpath("//b[text()='Temporary error occured[#5001], please try again.']"));
		 String ErrorMessage = error.getText();
		 System.out.println("error Message is "  +ErrorMessage);
		 
		 driver.quit();
		 
		

}}

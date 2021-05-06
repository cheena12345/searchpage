import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/cheenaarora/Downloads/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.redbus.in/");
		 List<WebElement> Footerbuttons =driver.findElements(By.xpath("//div[@class='operator-footer-list clearfix']//a"));
		 int count =Footerbuttons.size();
		 System.out.println("count is "  +count);
		 
		 for (WebElement Ftext : Footerbuttons) 
		 {
		String Footertext= Ftext.getText();
		System.out.println(Footertext);
		 
		 }
		 WebElement Src =driver.findElement(By.xpath("//input[@id='src']"));
		 Src.sendKeys("Bangalore");
		 WebElement Destination  =driver.findElement(By.xpath("//input[@id='dest']"));
		 Destination.sendKeys("Chennai");
		 WebElement Calender  =driver.findElement(By.xpath("//input[@id='onward_cal']"));
		 Calender.click();
		 
		 List<WebElement> Dates =driver.findElements(By.xpath("//div[@id=\"rb-calendar_onward_cal\"]//td"));
		 	int countDates= Dates.size();
			System.out.println(countDates);
		
		for (WebElement ele : Dates) 
		{
			String Values =ele.getText();
			System.out.println(Values);
			if (Values.contains("25"))
			{
				ele.click();
				break;
			}	
		}
		
		 WebElement Nextbutton  =driver.findElement(By.xpath("//button[normalize-space()='>']"));
		 Nextbutton.click();
		 WebElement Date  =driver.findElement(By.xpath("//td[text()='20']"));
		 Date.click();
		 WebElement SearchButton = driver.findElement(By.id("search_btn"));
		 SearchButton.click();
		//div[@class='travels lh-24 f-bold d-color']
		 
		 
		 
		 

		 
		 
		 
	}}

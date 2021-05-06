package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandler {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/cheenaarora/Downloads/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.amazon.com/");
		
		 WebElement ddown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		 
		 Select Alldropdown=new Select(ddown);
		 
		 Alldropdown.selectByIndex(5);
		 Alldropdown.selectByValue("search-alias=alexa-skills");
		 Alldropdown.selectByVisibleText("Amazon Devices");
		 
		List<WebElement> AllElements= Alldropdown.getOptions();
		
			int count=	AllElements.size();
			System.out.println(count);
		 
		for (WebElement ddown1 : AllElements) {
			
			
				String ddowntext = ddown1.getText();
				System.out.println(ddowntext);
			
			
			if (ddowntext.equalsIgnoreCase("Amazon Warehouse")) {
				System.out.println("Amazon Warehouseis present");
				break;
				
			}
		}
	
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("S");
		Thread.sleep(2000);
	
		
		
		
		
		
		
		  
	}

}

package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/cheenaarora/Downloads/chromedriver 2");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		String s =driver.getTitle();
		
		if (s=="HRM")
		{
			System.out.println("title is correct");
			
		} else 
		{
			
			System.out.println("title is not correct");
			
		}
		WebElement element=driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[1]/img"));
				if(element.isDisplayed())
				{
				System.out.println("Linkedin icon is displayed");
				}
				else
				{
				System.out.println("Linkedin icon is not  displayed");
				
				}
				
				WebElement element1=driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[2]/img"));
				if(element1.isDisplayed())
				{
				System.out.println("Facebook icon is displayedd");
				}
				else
				{
				System.out.println("Facebook icon is not  displayed");
				
				}
				WebElement element3=driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[3]/img"));
				if(element3.isDisplayed())
				{
				System.out.println("Twitter icon is displayedd");
				}
				else
				{
				System.out.println("Twitter icon is not  displayed");
				
				}
				WebElement element4=driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[4]/img"));
				if(element4.isDisplayed())
				{
				System.out.println("Youtube icon is   displayed");
				}
				else
				{
				System.out.println("Youtube icon is   displayed");
				
				}
				WebElement uname = driver.findElement(By.xpath("//input[@id='txtUsername']"));
				  WebElement passwrd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
				  WebElement button = driver.findElement(By.xpath("//input[@id='btnLogin']"));
				  uname.sendKeys("Admin");
				  passwrd.sendKeys("admin123");		
				  button.click();
				  WebElement pim = driver.findElement(By.xpath(" //b[contains(text(),'PIM')]"));
				 
				 String p = pim.getText();
				 System.out.println(p);
				 pim.click();
				 
				 Boolean buttonNotFound = true;

				 while(buttonNotFound)
				 {
				     List<WebElement> follow =   driver.findElements(By.xpath("//input[@id='firstName']"));  
				     
				     if(follow.size()!=0)
				     {
				             follow.get(0).click();
				             buttonNotFound=false;
				     }
				     else
				     {
				    	 driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
				     }
				 }
				 
				/*  WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));  
				  fname.sendKeys("cheena");

				 // WebElement mname = driver.findElement(By.xpath("//input[@id='middleName']\""));  
				//  mname.sendKeys("arora");
				  

				  WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));  
				  lname.sendKeys("Vijay");
				  
				  WebElement E_id = driver.findElement(By.xpath("//input[@name='employeeId']")); 
				  
				  E_id.clear();
				  E_id.sendKeys("245");
				  
				  WebElement image = driver.findElement(By.xpath("//input[@name='photofile']"));  
				  image.sendKeys("/Users/cheenaarora/Desktop/image.png");
				  
				  
				  WebElement save = driver.findElement(By.xpath("//input[@id='btnSave'] "));
				  save.click();*/
				  
				  

				  WebElement leave = driver.findElement(By.xpath("//a[@id=\"menu_leave_viewLeaveModule\"]"));
				  
				  leave.click();
				  
				  
			
				  
				  WebElement ddown = driver.findElement(By.xpath("//select[@id='leaveList_cmbSubunit'] "));
				  
				  Select dropdown =new Select(ddown);
				  
				   WebElement elements = dropdown.getFirstSelectedOption();
				   System.out.println(elements.getText());
				   
				 List<WebElement> allelements = dropdown.getOptions();
				 
				  int count = allelements.size();
				  System.out.println(count);
				 
				  
				   
				   
				   for (WebElement ele : allelements) {
					   
					System.out.println(ele.getText());
					
					if(allelements.contains("Sales"))
							{
						ele.click();
							}
				}
				   
				   
				  // dropdown.selectByIndex(7);
					//dropdown.selectByValue("Engineering");
					 
				 // driver.quit();
				  
				 // driver.findElement(By.xpath("//img[@xpath='1']")).click();
				  
				List<WebElement> Tableelements=  driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
				  
			int count1=	Tableelements.size();
			System.out.println(count1);
			
				  for (WebElement table : Tableelements) {
					  
					  System.out.println(table.getText());
					  
					  if (Tableelements.contains(25)) {
					
						  
						  System.out.println("it contains 25");
					}
	
				}
				  
				   
				
				  
				  
				  
				  
				  
				  
				  
				  
				  
				 
				 
				 
				 
				 
				 
				
					  
					 
					
				}
			   
				 
				
				
				
				
				 
			
		
	}


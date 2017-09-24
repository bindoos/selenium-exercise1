package testCaseExercise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestCase4 {
//@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("http://leaftaps.com/opentaps");
		   driver.manage().window().maximize();
		   
		   //Login to leaftap
		   
		   driver.findElementById("username").sendKeys("DemoSalesManager");
		   driver.findElementById("password").sendKeys("crmsfa");
		   driver.findElementByClassName("decorativeSubmit").click();
		   
		   //Click CRM/SFA -> Leads 
		   
		   driver.findElementByPartialLinkText("CRM/SFA").click();
		   driver.findElementByLinkText("Leads").click();
		   //click Merge Leads
		   driver.findElementByLinkText("Merge Leads").click();
		   //click on icon1
		
		   driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		   //move to new window
		   
		   String Parent_Window = driver.getWindowHandle();
		   
		   for(String child_window1 :driver.getWindowHandles() )
		   {
			   driver.switchTo().window(child_window1);
			  
		   }
		   System.out.println(driver.getTitle());	
		   
		   Thread.sleep(3000);
		   
		   driver.findElementByXPath("//input[@name='id']").sendKeys("123");
		   driver.findElementByXPath("//button[text()='Find Leads']").click();
		   //click first resulting lead
		   
		   Thread.sleep(1000);
		   
		   driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		   //move control back to parent window
		   driver.switchTo().window(Parent_Window);
		   //click on icon2
			
		   driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
           //move to new window
		   		   		   
		   for(String child_window :driver.getWindowHandles() )
		   {
			   driver.switchTo().window(child_window);
			  
		   }
		   System.out.println(driver.getTitle());	
		   
		   Thread.sleep(2000);
		   
		   driver.findElementByXPath("//input[@name='id']").sendKeys("10");
		   driver.findElementByXPath("//button[text()='Find Leads']").click();
		   //click first resulting lead
		   
		   Thread.sleep(1000);
		   
		   driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		   //move control back to parent window
		   driver.switchTo().window(Parent_Window);
		   
		   //click merge
		   driver.findElementByLinkText("Merge").click();
		   //accept alert
		   driver.switchTo().alert().accept();
		   //verify error message
		   String errorMessage = driver.findElementByXPath("//li[@class='errorMessage']").getText();
		   System.out.println(errorMessage);
		   //click on Find Leads
		   driver.findElementByXPath("//a[@href='/crmsfa/control/findLeads']").click();
		   System.out.println("TEST PASS4");
		   driver.close();
		   
		   
		   
		   
		   
		   

	}

}

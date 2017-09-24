package testCaseExercise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
@Test
	public void verifyDeleteAction() throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.get("http://leaftaps.com/opentaps");
		   driver.manage().window().maximize();
		   
		   //Login to leaftap
		   
		   driver.findElementById("username").sendKeys("DemoSalesManager");
		   driver.findElementById("password").sendKeys("crmsfa");
		   driver.findElementByClassName("decorativeSubmit").click();
		   
		   //Click CRM/SFA -> Leads > Find Leads >
		   
		   driver.findElementByPartialLinkText("CRM/SFA").click();
		   driver.findElementByLinkText("Leads").click();
		   driver.findElementByLinkText("Find Leads").click();
		   
		   //Click on Phone
		   driver.findElementByXPath("//span[text()='Phone']").click();
		   //Enter phone number
		   driver.findElementByXPath("//input[@name='phoneCountryCode']").clear();
		   driver.findElementByXPath("//input[@name='phoneCountryCode']").sendKeys("1");
		   driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("1");
		   driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1");
		   //Click Find Leads button
		   driver.findElementByXPath("//button[text()='Find Leads']").click();
		   //capture lead id of first resulting lead
		   Thread.sleep(3000);
		   String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();
		   //System.out.println(leadId);
		   //Click the first resulting lead
		   Thread.sleep(1000);
		   driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		   //Click Delete
		   driver.findElementByClassName("subMenuButtonDangerous").click();
		   //click Find Leads
		   driver.findElementByXPath("//a[text()='Find Leads']").click();
		   //Enter captured Lead Id
		   driver.findElementByXPath("//input[@name='id']").sendKeys(leadId);
		   //click Find Leads
		   driver.findElementByXPath("//button[text()='Find Leads']").click();
		   //verify error message
		   Thread.sleep(1000);
		   String message = driver.findElementByXPath("//div[text()='No records to display']").getText();
		   if (message .equalsIgnoreCase("No records to display")){
			   System.out.println("Test pass");}
			   else
				   System.out.println("Test fail");
		   System.out.println("TEST PASS3");
		   driver.close();
	       		   
		   
		   
		

	}

}

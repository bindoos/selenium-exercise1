package testCaseExercise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase5 {
@Test
	public void verifyDuplicateLead() throws InterruptedException {
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
		   
		   //click email > enter email >
		   Thread.sleep(1000);
		   driver.findElementByXPath("//span[text()='Email']").click();
		   driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("@gmail.com");
		   driver.findElementByXPath("//button[text()='Find Leads']").click();
		   Thread.sleep(1000);
		   String FirstName = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a").getText();
		   driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		   //click duplicate lead
		   driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		   //verify title as Duplicate Lead
		   if(driver.getTitle() .equalsIgnoreCase("Duplicate lead")){
			   System.out.println("Title is correct and is "+driver.getTitle());
		   }
		   driver.findElementByXPath("//input[@value='Create Lead']").click();
		   String duplicatedLead = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		   if(FirstName.equals(duplicatedLead)){
			   System.out.println("The duplicated Lead is same as captured lead and  is "+ FirstName);
		   }
		   System.out.println("TEST PASS5");
		   driver.close();

	}

}

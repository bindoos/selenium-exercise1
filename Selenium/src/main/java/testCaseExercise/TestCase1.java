package testCaseExercise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase1 {
@Test
	public void createLead() {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("http://leaftaps.com/opentaps");
	   driver.manage().window().maximize();
	   
	   driver.findElementById("username").sendKeys("DemoSalesManager");
	   driver.findElementById("password").sendKeys("crmsfa");
	   driver.findElementByClassName("decorativeSubmit").click();
	   
	   driver.findElementByPartialLinkText("CRM/SFA").click();
	   driver.findElementByPartialLinkText("Create Lead").click();
	   
	   driver.findElementById("createLeadForm_companyName").sendKeys("ABC Company");
	   driver.findElementById("createLeadForm_firstName").sendKeys("MyFirstName");
	   driver.findElementById("createLeadForm_lastName").sendKeys("MyLastName");
	   
	   Select sourceDropDown = new Select(driver.findElementById("createLeadForm_dataSourceId"));
	   sourceDropDown.selectByIndex(4);
	   Select MCampaign = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
	   MCampaign.selectByValue("CATRQ_CARNDRIVER");
	   
	   driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
	   driver.findElementById("createLeadForm_primaryEmail").sendKeys("mFirstName.mLastName@gmail.com");
	   driver.findElementByXPath("//input[@value ='Create Lead']").click();
	   String str = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
	   System.out.println(str);
	   System.out.println("TEST PASS1");
	   driver.close();
	   

	   
       
     
	}

}

package testCaseExercise;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {
@Test
	public void verifyEditCompany() throws InterruptedException {
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
	   
	   String title = driver.getTitle();
	   System.out.println("Title of the page now is "  + title);
	   
	   Thread.sleep(3000);
	   //Find leads by entering First Name 
	   driver.findElementByXPath("//div[@id='x-form-el-ext-gen248']/input").sendKeys("san");
	   
	   //Click the first data displayed
       driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a").click();
       
       //Verify we are in View Lead page
       String title2 = driver.getTitle();
       if (title2 .equals("View Lead | opentaps CRM")){  
    	   System.out.println("We are currently in the correct page and the Title of the page is "  + title2);}
       
       //Click Edit  
       driver.findElementByXPath("//a[text()='Edit']").click();
       
       //change the Company name and click Update
       driver.findElementById("updateLeadForm_companyName").clear();
       driver.findElementById("updateLeadForm_companyName").sendKeys("ABC Company");
       String CompanyName = driver.findElementById("updateLeadForm_companyName").getText();
       driver.findElementByXPath("//input[@value ='Update']").click();
       
       //Verify the company name has changed to updated company 
	   String updatedCompany = driver.findElementById("viewLead_companyName_sp").getText();
	   if (updatedCompany .contains(CompanyName) ){
		   System.out.println("The company name has successfully changed ");}
	   System.out.println("TEST PASS2");
	   
	   driver.close();
	   
	   
       
     
	   
	}

}

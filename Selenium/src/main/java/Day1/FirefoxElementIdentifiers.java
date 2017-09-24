package Day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxElementIdentifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe");
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.get("http://leaftaps.com/opentaps");
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	System.out.println(driver.findElementByTagName("h2").getText());
	System.out.println(driver.getCurrentUrl());
	driver.findElementByPartialLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementByClassName("inputBox").sendKeys("CAPITA");
	driver.findElementById("createLeadForm_firstName").sendKeys("Bindu");
	driver.findElementById("createLeadForm_lastName").sendKeys("Sekhar");
	driver.findElementByClassName("smallSubmit").click();
	
	}

}

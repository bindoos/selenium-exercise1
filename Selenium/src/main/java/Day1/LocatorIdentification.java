package Day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorIdentification {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://leaftaps.com/opentaps");
	List<WebElement> noOfLinks = driver.findElementsByTagName("a");
    int count = noOfLinks.size();
    System.out.println(count);
	
	
	
	driver.findElementById("username").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	System.out.println(driver.findElementByTagName("h2").getText());
	System.out.println(driver.getCurrentUrl());
	driver.findElementByPartialLinkText("CRM/SFA").click();
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementByClassName("inputBox").sendKeys("XYZSolutions");
	driver.findElementById("createLeadForm_firstName").sendKeys("FirstName");
	driver.findElementById("createLeadForm_lastName").sendKeys("SecondName");
	Select s = new Select(driver.findElementById("createLeadForm_dataSourceId"));
	s.selectByValue("LEAD_EMPLOYEE");
	s = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
	s.selectByIndex(2);
	
	File srcFile= driver.getScreenshotAs(OutputType.FILE);
	File destFile= new File("./snaps/snap1.jpg");
	FileUtils.copyFile(srcFile, destFile);
	
	driver.findElementByClassName("smallSubmit").click();
	Thread.sleep(3000);
	
	driver.findElementByLinkText("Find Leads").click();
	driver.findElementByXPath("//button[@id='ext-gen334']").click();
	
	List<WebElement> tableRows  = driver.findElementsByXPath("//table[@class='x-grid3-row-table']");
	System.out.println("No : Of Rows = " +tableRows.size());
	
	//WebElement firstRow = tabRows.get(0);
	//System.out.println(firstRow.findElement(By.tagName("td")).size());
	 WebElement table = driver.findElementByClassName("x-grid3-row-table");
	 List<WebElement> allRows = driver.findElementsByTagName("tr")	; 
	 WebElement firstRow = allRows.get(0);
	 List<WebElement> allColumns = firstRow.findElements(By.tagName("td"));
	 WebElement fourthcolumn = allColumns.get(3);
	 System.out.println("No: of columns in the table = " + allColumns.size());
	 //System.out.println("Fourth column name is  " + allColumns.indexOf(3));
	 
	 
	 
	 
	 //System.out.println("The fourth column in the table is  = " + noOfColumns[3]);
	
	
	
	}

}

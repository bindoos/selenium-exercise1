package day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
@Test
	public void LearnMouseOver() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.co.uk/");
		WebElement target = driver.findElementById("nav-link-yourAccount");
		
		
		
		Actions builder = new Actions(driver);
		builder.moveToElement(target).build().perform();
		driver.findElementByXPath("//span[text()='Your Prime Membership']").click();
		
		
				
		
		
	}

}

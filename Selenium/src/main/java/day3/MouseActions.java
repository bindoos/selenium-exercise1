package day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
 @Test
	public void MouseAction() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/droppable/");
		driver.findElementByLinkText("Droppable");
		
		WebElement demo = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(demo);
		
		WebElement source = driver.findElementByXPath("//p[text()='Drag me to my target']");
		WebElement destination = driver.findElementById("droppable");
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, destination).build().perform();
		
		
				
		
		
	}

}

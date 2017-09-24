package Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement frameElement = driver.findElementById("iframeResult");
		driver.switchTo().frame(frameElement);
		driver.findElementByXPath("/html/body/button").click();
		Alert alrt  = driver.switchTo().alert();
		System.out.println(alrt.getText());

	}

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Bindu");
		System.setProperty("webdriver.chrome.driver", "C:/Programs/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		driver.close();
		

	}

}

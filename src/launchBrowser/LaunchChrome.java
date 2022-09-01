package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		//Setup System Property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\robg1\\Selenium\\1st_Selenium\\driver\\chromedriver.exe");
		//Object of Chrome Driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		//Pause Execution
		Thread.sleep(5000);
		//Close Browser
		driver.close();
		
	}
}

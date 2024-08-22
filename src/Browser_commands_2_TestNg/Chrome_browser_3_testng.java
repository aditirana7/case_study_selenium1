package Browser_commands_2_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome_browser_3_testng {
	WebDriver driver;

	@Test
	public void ChromeBrowserLaunch() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Chrome_driver_jars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php ");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String pagesrc = driver.getPageSource();
		System.out.println(pagesrc);
		String title = driver.getTitle();
		int titleLength = title.length();
		System.out.println("Title Length: " + titleLength);
		driver.quit();
	}
}

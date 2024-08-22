package Browser_commands_2_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_browser_testng3 {
	WebDriver driver;

	public void FirefoxBroswerLaunch() throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Firefox_driver_jars/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(" http://automationpractice.com/index.php ");
		driver.manage().window().maximize();
		Thread.sleep(5000);
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

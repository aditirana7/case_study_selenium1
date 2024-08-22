package Launch_the_browser_using_max_and_min;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Browsers_2 {
	public static void main(String args[]) throws InterruptedException {
		// key and value copy only .exe file
		System.setProperty(" webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Documents\\Aditi Rana\\Selinium class\\Selenium Practices\\Launch_chrome_browser\\Chrome_driver_jars\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
}

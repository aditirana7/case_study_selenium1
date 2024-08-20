package Five_url_browser_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class five_url {
	WebDriver driver;
	@Test(priority=1)
	public void ChromeBrowserLaunch() throws Exception{
		System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demo.opencart.com/ ");
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.get("http://www.bing.com ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.freecrm.com/ ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.half.ebay.com ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String pagesrc=driver.getPageSource();
		System.out.println(pagesrc);
		String title = driver.getTitle();
		int titleLength = title.length();
	    System.out.println("Title Length: " + titleLength);
		driver.quit();
	}
	@Test(priority=2)
	public void EdgeBroswerLaunch() throws Exception{
			System.setProperty("webdriver.edge.driver","./Edge_Driver_Jars/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/ ");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://demo.opencart.com/ ");
			driver.manage().window().minimize();
			Thread.sleep(2000);
			driver.get("http://www.bing.com ");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.freecrm.com/ ");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("http://www.half.ebay.com ");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			String pagesrc=driver.getPageSource();
			System.out.println(pagesrc);
			String title = driver.getTitle();
			int titleLength = title.length();
		    System.out.println("Title Length: " + titleLength);
			driver.quit();
	
	}
	@Test(priority=3)
	public void FirefoxBroswerLaunch() throws Exception{
			System.setProperty("webdriver.gecko.driver","./Firefox_driver_jars/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/ ");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://demo.opencart.com/ ");
			driver.manage().window().minimize();
			Thread.sleep(2000);
			driver.get("http://www.bing.com ");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.freecrm.com/ ");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("http://www.half.ebay.com ");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			String pagesrc=driver.getPageSource();
			System.out.println(pagesrc);
			String title = driver.getTitle();
			int titleLength = title.length();
		    System.out.println("Title Length: " + titleLength);
			driver.quit();
	}

}

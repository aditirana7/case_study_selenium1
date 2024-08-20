package Browser_commands_2_TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Edge_Browser_3_testng {
	WebDriver driver;
	@Test
	public void EdgeBroswerLaunch() throws Exception{
			System.setProperty("webdriver.edge.driver","./Edge_Driver_Jars/msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("http://automationpractice.com/index.php ");
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

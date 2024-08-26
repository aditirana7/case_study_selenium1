package Drop_down_casestudy;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook_page {


		WebDriver driver;
		@Test
	public void Dropdown1() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","./Chrome_driver_jars/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/campaign/landing.php?");
		 driver.manage().window().maximize();
		 
		WebElement month_Dropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(month_Dropdown);
		month_dd.selectByIndex(5);
		Thread.sleep(5000);
		System.out.println(month_dd.getFirstSelectedOption().getText());
		
		
		WebElement day_Dropdown=driver.findElement(By.id("day"));
		Select day_dd=new Select(day_Dropdown);
		day_dd.selectByValue("7");
		Thread.sleep(1000);
		System.out.println(day_dd.getFirstSelectedOption().getText());
		
		WebElement year_Dropdown=driver.findElement(By.id("year"));
		Select year_dd=new Select(year_Dropdown);
		year_dd.selectByVisibleText("2000");
		Thread.sleep(1000);
		System.out.println(year_dd.getFirstSelectedOption().getText());
		
		//count number of items in day_dropdown
		List<WebElement> d=day_dd.getOptions();
		System.out.println("Number of days:"+d.size());
		
		//count number of items in month_dropdown
		List<WebElement> y=year_dd.getOptions();
		System.out.println("Number of year:"+y.size());
		driver.quit();
	}
	}



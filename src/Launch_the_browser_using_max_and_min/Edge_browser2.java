package Launch_the_browser_using_max_and_min;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge_browser2 {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./Edge_Driver_Jars/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https:www.yahoo.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
}

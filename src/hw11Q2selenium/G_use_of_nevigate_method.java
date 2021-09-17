package hw11Q2selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class G_use_of_nevigate_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(enabled = true, priority = 1)
	public void saveOnlineIDButton() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='saveOnlineId']")).isSelected();
		System.out.println("\n Is selected button : true");
		Thread.sleep(4000);
	}

	@AfterTest
	public void tearUp() {
		driver.quit();
	}
}

package hw10Q2selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_use_of_get_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sarker/eclipse-workspace/SeleniumProject2021/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bankofamerica.com");
		Thread.sleep(3333);
		driver.quit();
	}
}

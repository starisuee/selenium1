package Selenium_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class primer_ejemplo {
	public static void main (String[] args)throws
	InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Object texto = driver.findElement(By.id("twotabsearchtextbox"));
	((WebElement) texto).sendKeys("laptop");
	Thread.sleep(5000);
	driver.quit();
	}

}

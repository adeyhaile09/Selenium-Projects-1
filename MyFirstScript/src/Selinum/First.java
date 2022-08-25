package Selinum;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\Selinum\\ChromDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Guitar");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	}

}

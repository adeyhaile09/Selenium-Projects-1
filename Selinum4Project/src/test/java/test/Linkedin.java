package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkedin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login");
		
		driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.tagName("path")).click();
		driver.findElement(By.className("global-nav__primary-item")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();

	}

}

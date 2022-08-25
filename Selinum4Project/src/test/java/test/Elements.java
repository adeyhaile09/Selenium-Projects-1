package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com/");
		
		//WebElement searchBox = driver.findElement(By.name("q"));
		//searchBox.sendKeys("automation step by step", Keys.ENTER);
		/*
		driver.navigate().to("https://trytestingthis.netlify.app/");
		List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
		for(WebElement element : options) {
			System.out.println(element.getText());
		}
		*/
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		driver.findElement(RelativeLocator.with(By.tagName("ïnput")).above(loginbutton)).sendKeys("password");
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		WebElement dropDown = driver.findElement(By.id("option"));
		Select selectObject = new Select(dropDown);
		selectObject.selectByIndex(1);
		Thread.sleep(2000);
		selectObject.selectByValue("option 2");
		Thread.sleep(2000);
		selectObject.selectByVisibleText("Option 3");
		
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Done");

	}

}

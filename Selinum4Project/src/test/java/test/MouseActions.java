package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxA = driver.findElement(By.xpath("//li[text() = 'A']"));
		WebElement boxD = driver.findElement(By.xpath("//li[text() = 'D']"));
		
	    Actions actions = new Actions(driver);
	    //actions.moveToElement(boxA);
	    //actions.clickAndHold();
	    //actions.moveToElement(boxD);
	    //actions.contextClick(boxD);
	    actions.doubleClick(boxA);
	    
	    actions.release().perform();
	    
	    Thread.sleep(2000);
	    driver.quit();
	    

	}

}

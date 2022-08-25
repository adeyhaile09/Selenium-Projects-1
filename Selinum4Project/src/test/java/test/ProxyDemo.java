package test;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProxyDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Proxy proxy = new Proxy();
		proxy.setAutodetect(false);
		proxy.setSslProxy("localhost:8888");
		
		ChromeOptions options = new ChromeOptions();
		options.setCapability("proxy", proxy);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.quit();
	

	}

}

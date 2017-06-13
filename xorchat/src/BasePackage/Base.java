package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pageobjectspkg.chatBoxLandingPg;

public class Base {

	private final WebDriver driver;
	private final ChromeOptions options;

	public Base() {
		options = new ChromeOptions();
		driver = new ChromeDriver(options);
	}

	public void process(){
		options.addArguments("--disable-notifications");		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_2_29/chromedriver.exe");	
		WebDriver driver = new ChromeDriver(options);		
		driver.get("https://10.20.14.67:9091/");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}

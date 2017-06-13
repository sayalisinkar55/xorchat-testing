package Testpkg;

/**
 * Imported the packages 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageobjectspkg.chatBoxLandingPg;

public class Message_Test {
	
	
	
	@Test
	public void msgSendRecieve() throws InterruptedException {
		/**
		 * Open New chrome_brower Disable the notification Disable the alert box
		 * Maximize the screen
		 */
		ChromeOptions options = new ChromeOptions();

		
		options.addArguments("--start-maximized");
		options.addArguments("--disable-web-security");
		options.addArguments("--disable-notifications");
		options.addArguments("--no-proxy-server");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_2_29/chromedriver.exe");

		WebDriver driver = new ChromeDriver(options);

		/**
		 * Enter the url
		 */
		driver.get("https://10.20.14.67:9091/");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		/**
		 * Created object of login page Login with first user
		 */
		chatBoxLandingPg loginpage = new chatBoxLandingPg(driver);
		try {
			loginpage.loginByUsername("XOR-IND\\sinkar_s", "xori123#");

			System.out.println("login successful");
			Reporter.log("login successful");
		} catch (Exception e) {
			Reporter.log("login failed");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/**
		 * Click on End_tour button
		 */
//		loginpage.clickendtoorbtn(driver);
//		/**
//		 * Search the user by name and send the message
//		 */
//		WebElement e = driver.findElement(By.xpath("//*[@id='_userSearch']"));
//		e.click();
//		e.sendKeys("Abhijeet");
//		loginpage.clickuser();
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		loginpage.clickclick().sendKeys("Hi");
//		loginpage.clickclick().sendKeys(Keys.ENTER);

		/**
		 * Open the new window of chrome_browesr Disable the notification
		 * Disable the alert box Maximize the screen
		 */
		WebDriver driver1 = new ChromeDriver(options);
		options.addArguments("--disable-web-security");
		options.addArguments("--disable-notifications");
		options.addArguments("--no-proxy-server");
		Map<String, Object> prefs1 = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_2_29/chromedriver.exe");
		/**
		 * Enter the url
		 */
		driver1.get("https://10.20.14.67:9091/");
		driver1.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		chatBoxLandingPg loginpage1 = new chatBoxLandingPg(driver1);
		/**
		 * Created object for login page Login with second user
		 */
		try {
			loginpage1.loginByUsername("XOR-IND\\sonaje_a", "asdf#123");
			Reporter.log("login successful");
		} catch (Exception e1) {
			Reporter.log("login failed");
			;
		}

		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		loginpage1.clickendtoorbtn(driver1);
//
//		try {
//			loginpage1.clickclick().sendKeys("Hello");
//			loginpage1.clickclick().sendKeys(Keys.ENTER);
//			Reporter.log("Reply sent to the sender");
//		} catch (Exception e4) {
//			Reporter.log("There is an error to send the reply");
//		}
		// driver.quit();
		// driver1.quit();

	}

}

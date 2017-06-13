package Testpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageobjectspkg.chatBoxLandingPg;

public class conversationFor2Users {
	/**
	 * Fetch the Excel file location
	 */
	private static final String FILE_NAME = "C:/Users/sinkar_s/Desktop/TestScript1.xlsx";
	private static final Reporter Report = null;

	/**
	 * 
	 * Passing the parameter
	 */
	public void verifyConversationFor2Users(String userName, String password, String URL, String msg,String user) 
			throws InterruptedException {		
		/**
		 * open the new chrome_browser
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
	
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		chatBoxLandingPg objchatboxLandingPg = new chatBoxLandingPg(driver);
		/**
		 * Login and verify message for first user
		 */
		objchatboxLandingPg.loginByUsername(userName, password);	
		/**
		 * click on end tour button
		 */
		objchatboxLandingPg.clickEndTourBtn(driver);
		
		/**
		 * click on search icon enter username
		 */
		WebElement userSearch = driver.findElement(By.xpath("//*[@id='_userSearch']"));
		userSearch.click();
		/**
		 * enter the username and click on it
		 */
	    objchatboxLandingPg.selectUserToChat();
		
		/**
		 * Enter the message in chatbox
		 */
		objchatboxLandingPg.enterMsgInChatBox(msg);
		objchatboxLandingPg.validateUserMessage(msg);
		/**
		 * Mouse hovering
		 */
		//objchatboxLandingPg.validateMouseHover();
		//objchatboxLandingPg.mouseClickHover();
		/**
		 * Transfer the chat
		 */
		//objchatboxLandingPg.validateTransferChat();
		//objchatboxLandingPg.transferChat();
		/**
		 * click on leave group
		 *//*
		objchatboxLandingPg.leaveGroup();
		objchatboxLandingPg.validateLeaveGroupe();
		*//**
		 * click on fav icon
		 *//*
		objchatboxLandingPg.favouriteIcon();
		objchatboxLandingPg.validateFavouriteIcon();
		*//**
		 * click on download chat
		 *//*
		objchatboxLandingPg.downloadChat();
		objchatboxLandingPg.validatedownloadChatIcon();
		
	
		*/
		//driver.quit();
	}

	/**
     * Fetch the data from Excel
     */
	@Test
	public void test() throws InterruptedException, IOException {
		conversationFor2Users myClass = new conversationFor2Users();
        
		FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
		Workbook workbook = new XSSFWorkbook(excelFile);
		Sheet datatypeSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = datatypeSheet.iterator();
		String[] parameters = new String[4];
		Cell currentCell;
		while (iterator.hasNext() == true) {

			Row currentRow = iterator.next();
			Iterator<Cell> cellIterator = currentRow.iterator();					
			currentCell = cellIterator.next();
			System.out.print(currentCell.getStringCellValue() + "  ");
			String URL = currentCell.getStringCellValue();
			if(URL.isEmpty()) break;
			currentCell = cellIterator.next();
			System.out.print(currentCell.getStringCellValue() + "  ");
			String userName = currentCell.getStringCellValue();
			currentCell = cellIterator.next();
			System.out.print(currentCell.getStringCellValue() + "  ");
			String password = currentCell.getStringCellValue();
			currentCell = cellIterator.next();
			System.out.print(currentCell.getStringCellValue() + "  ");
			String msg = currentCell.getStringCellValue();
			currentCell = cellIterator.next();
			System.out.print(currentCell.getStringCellValue() + "  ");
			String user = currentCell.getStringCellValue();
		
			myClass.verifyConversationFor2Users( userName,  password,  URL,  msg,user);	
			
				
		}		
	}
}

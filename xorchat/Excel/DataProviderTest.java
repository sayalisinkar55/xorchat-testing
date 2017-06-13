package Excel;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.testng.annotations.DataProvider;
 
import org.testng.annotations.Test;
 

public class DataProviderTest {
  @Test(dataProvider = "‘Authentication’")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][]Authentication() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}

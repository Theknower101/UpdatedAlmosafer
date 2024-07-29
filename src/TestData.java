import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestData {
	protected static WebDriver driver;
	  String url="https://global.almosafer.com/en";
	  String expectedLanguageDefault="en";
	  String expectedCurrency="SAR";
	  String expectedContactNumber="+966554400000";
	  String expectedIsSelected="false";
	  LocalDate now=LocalDate.now();
	  Random rand=new Random();
	  
	  @BeforeSuite
	  public void configuration() {
		  if(driver==null) {
			  driver=new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  }
	  }
	  @AfterSuite
	  public void tear() {
		  if(driver!=null) {
			  driver.quit();
			  driver=null;
		  }	
		  
	  }
	  public void defualtConfiguration() {
			driver.get(url);

	  }
}

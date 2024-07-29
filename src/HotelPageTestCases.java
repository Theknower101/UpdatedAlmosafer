import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HotelPageTestCases extends TestData {
	public void checkTheLoadingTest() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(1));
		WebElement result=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@data-testid='HotelSearchResult__resultsFoundCount']")));
		Assert.assertEquals(result.getText().contains("found")||result.getText().contains("وجدنا"), true);
	}
	public void checkTheLowest() {
		WebElement lowestButton=driver.findElement(By.xpath("//button[@data-testid='HotelSearchResult__sort__LOWEST_PRICE']"));
		lowestButton.click();
		List<WebElement> element=driver.findElements(By.className("Price__Value"));
		String lowestPrice=element.get(0).getText();
		int lowestPriceInt=Integer.parseInt(lowestPrice);
		String highestPrice=element.get(element.size()-1).getText();
		int highestPriceInt=Integer.parseInt(highestPrice);
		
		Assert.assertEquals(highestPriceInt>lowestPriceInt, true);
	}
}

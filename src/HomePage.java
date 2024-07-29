

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends TestData{
public void closeWindowTest() {
	WebElement button=driver.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary"));
	button.click();
}
public void checkTheLanguageTest() {
	WebElement html=driver.findElement(By.tagName("html"));
	String actualLanguageDefault=html.getAttribute("lang");
	Assert.assertEquals(actualLanguageDefault, expectedLanguageDefault);
}
public void checkTheCurrency() {
	String actualCurrency=driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']")).getText();
	Assert.assertEquals(actualCurrency, expectedCurrency);
}
public void checkContactNumber() {
	String actualContactNumber=driver.findElement(By.tagName("strong")).getText();
	Assert.assertEquals(actualContactNumber, expectedContactNumber);
}

//public void checkLogoTest() {
//	 boolean expectedResults = true;
//        WebElement TheFooter = driver.findElement(By.tagName("footer"));
//        boolean ActualResult = TheFooter.findElement(By.cssSelector(".sc-fihHvN eYrDjb")).findElement(By.tagName("svg")).isDisplayed();
//        Assert.assertEquals(ActualResult, expectedResults);
//}
public void checkTheHotelsTabsNotSelectedTest() {
	WebElement hotelTab=driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
	String actualIsSelected=hotelTab.getAttribute("aria-selected");
	Assert.assertEquals(actualIsSelected, expectedIsSelected);
}
public void checkDepartureFlightTest() {
	int actualDepartureFlight=now.plusDays(1).getDayOfMonth();
	int expectedDepartureFlight=Integer.parseInt(driver.findElement(By.cssSelector("div[class='sc-iHhHRJ sc-kqlzXE blwiEW'] span[class='sc-cPuPxo LiroG']")).getText());
	Assert.assertEquals(actualDepartureFlight, expectedDepartureFlight);
}
public void checkReturnFlightTest() {
	int actualReturnFlight=now.plusDays(2).getDayOfMonth();
	int expectedReturnFlight=Integer.parseInt(driver.findElement(By.cssSelector("div[class='sc-iHhHRJ sc-OxbzP edzUwL'] span[class='sc-cPuPxo LiroG']")).getText());
	Assert.assertEquals(actualReturnFlight, expectedReturnFlight);
}
public void setTheLanguageRandomlytTest() {
	String []languages= {"https://www.almosafer.com/en","https://www.almosafer.com/ar"};
	int randomIndex=rand.nextInt(languages.length);
	driver.get(languages[randomIndex]);
}
public void setLocationRandomlyTest() {
	WebElement hotelTab=driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
	hotelTab.click();
	WebElement hotelSearch=driver.findElement(By.cssSelector(".sc-phbroq-2.uQFRS.AutoComplete__Input"));
	
	String arabicLocations[]= {"دبي","الرياض","جدة"};
	String englishLocations[]= {"Riyadh","Dubai","Jeddah"};
	WebElement html=driver.findElement(By.tagName("html"));
	String actualLanguageDefault=html.getAttribute("lang");
   if(actualLanguageDefault.equals("en")) {
	   int randomIndex=rand.nextInt(englishLocations.length);
	   hotelSearch.sendKeys(englishLocations[randomIndex]);
   }	
   else if(actualLanguageDefault.equals("ar")) {
	   int randomIndex=rand.nextInt(arabicLocations.length);
	   hotelSearch.sendKeys(arabicLocations[randomIndex]);
   }
}
public void selectRoomSizeTest() {
	WebElement element=driver.findElement(By.xpath("//select[@data-testid='HotelSearchBox__ReservationSelect_Select']"));
	WebElement searchHotelButton=driver.findElement(By.xpath("//button[@data-testid='HotelSearchBox__SearchButton']"));
	Select newSelect=new Select(element);
	int randomIndex=rand.nextInt(2);
	newSelect.selectByIndex(randomIndex);
	searchHotelButton.click();
}

}


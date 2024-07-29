
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class MyTestCases extends TestData {
 
	HomePage home=new HomePage();
	HotelPageTestCases hotel=new HotelPageTestCases();
  
	@BeforeTest
	public void setUp() {
		defualtConfiguration();

		
	}
	@Test(priority=1)
	public void closeTheWindow() {
	home.closeWindowTest();
	}
	@Test(priority=2)
	public void checkTheLanguage() {
		home.checkTheLanguageTest();
	}
	@Test(priority=3)
	public void checkTheCurrency() {
		home.checkTheCurrency();
		
	}
	@Test(priority=4)
	public void checkContactNumber() {
		home.checkContactNumber();
	}
//	@Test(priority=5)
//	public void checkLogo() {
//home.checkLogoTest();
//	}
	@Test(priority=6)
	public void checkTheHotelsTabNotSelected() {
		home.checkTheHotelsTabsNotSelectedTest();
	}
	@Test(priority=7)
	public void checkTheDepartureFlight() {
	home.checkDepartureFlightTest();
	}
	@Test(priority=8)
	public void checkReturnFlight() {
		home.checkReturnFlightTest();
	}
	@Test(priority=9)
	public void setTheLanguageRandomly() {
	home.setTheLanguageRandomlytTest();
	}
	@Test(priority=10)
	public void setLocationRandomly() {
	home.setLocationRandomlyTest();
       
       
	}
	@Test(priority=11)
	public void selectRoomSize() {
	home.selectRoomSizeTest();
	}
	
	@Test(priority=12)
	public void checkTheLoading() {
hotel.checkTheLoadingTest();
	}
	@Test(priority=13)
	public void checkTheLowest() {
	hotel.checkTheLowest();
	}
}
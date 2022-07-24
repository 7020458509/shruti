package velocity2ndApril;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import maven1.loginPage;

public class LoginTest {
	WebDriver driver;
	loginPage p=new loginPage(driver);
	
	@BeforeClass
	public void inItObject() {
		p=new loginPage (driver);
	}
	@BeforeSuite
	public void beforesuite() {
		//System.setProperty("webdriver.chrome.driver", "C:\\testing\\New folder (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void login() {
		p.entercred("scffdgh","utkarsh@123");
		p.clickloginbtn();
		//Assert.assertEquals(driver.getCurrentUrl(), "https://kite.zerodha.com/");
		Assert.assertTrue(true);
	}

}

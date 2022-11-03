package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pages.InventoryPage;
import pages.MessagePopUpPage;
import pages.NavPage;
import pages.SignInPage;

public abstract class BasicTest {
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected String baseUrl = "https://www.saucedemo.com";
	protected InventoryPage inventoryPage;
	protected MessagePopUpPage messagePopUpPage;
	protected NavPage navPage;
	protected SignInPage signInPage;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		inventoryPage = new InventoryPage(driver, wait);
		messagePopUpPage = new MessagePopUpPage(driver, wait);
		navPage = new NavPage(driver, wait);
		signInPage = new SignInPage(driver, wait);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get(baseUrl);
	}

	@AfterMethod
	public void afterMethod() {

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}

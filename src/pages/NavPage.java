package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public NavPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	// ________________MENU HEADER______________________

	public WebElement getMenuButoon() {
		return driver.findElement(By.id("react-burger-menu-btn"));
	}

	public WebElement getCloseMenuButoon() {
		return driver.findElement(By.xpath("//*[text() = 'Close Menu']"));
	}

	public WebElement getAllItemsLink() {
		return driver.findElement(By.xpath("//nav[contains(@class,'bm-item-list')]/a[1]"));
	}

	public WebElement getAboutLink() {
		return driver.findElement(By.xpath("//nav[contains(@class,'bm-item-list')]/a[2]"));
	}

	public WebElement getLogoutLink() {
		return driver.findElement(By.xpath("//nav[contains(@class,'bm-item-list')]/a[3]"));
	}

	public WebElement getResetAppStateLink() {
		return driver.findElement(By.xpath("//nav[contains(@class,'bm-item-list')]/a[4]"));
	}

//________________SELECT DROPDOWN NAV______________________
	public WebElement getSelectOptions() {
		return driver.findElement(By.xpath("//*[contains(@class,'product_sort_container')]"));
	}

	public void SelectOptionsOne() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[contains(@class,'product_sort_container')]")));
		dropdown.selectByValue("az");
	}

	public void SelectOptionsTwo() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[contains(@class,'product_sort_container')]")));
		dropdown.selectByValue("za");
	}

	public void SelectOptionsThree() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[contains(@class,'product_sort_container')]")));
		dropdown.selectByIndex(2);
	}

	public void SelectOptionsFour() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[contains(@class,'product_sort_container')]")));
		dropdown.selectByVisibleText("Price (high to low)");
	}

//_____________________CART BUTTON___________________________

	public WebElement getCartLink() {
		return driver.findElement(By.xpath("/*[@id = 'shopping_cart_container']/a"));
	}
}

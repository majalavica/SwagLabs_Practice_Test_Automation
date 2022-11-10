package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
	private WebDriver driver;
	private WebDriverWait wait;

	public InventoryPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

//______________Everything for Backpack________________________

	public WebElement getBackpackImgLink() {
		return driver.findElement(By.id("item_4_img_link"));
	}

	public WebElement getBackpackTitleLink() {
		return driver.findElement(By.id("item_4_title_link"));
	}

	public WebElement getBackpackAddToCartButton() {
		return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	}

	public WebElement getBackpackPrice() {
		return driver.findElement(
				By.xpath("//*[contains(@class, 'inventory_item')][1]//*[contains(@class, 'inventory_item_price')]"));
	}

	// ______________Everything for BikeLight________________________

	public WebElement getBikeLightImgLink() {
		return driver.findElement(By.id("item_0_img_link"));
	}

	public WebElement getBikeLightTitleLink() {
		return driver.findElement(By.id("item_0_title_link"));
	}

	public WebElement getBikeLightAddToCartButton() {
		return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
	}

	public WebElement getBikeLightPrice() {
		return driver.findElement(
				By.xpath("//*[contains(@class, 'inventory_item')][2]//*[contains(@class, 'inventory_item_price')]"));
	}

	// ______________Everything for BlackTShirt________________________

	public WebElement getBlackTShirtImgLink() {
		return driver.findElement(By.id("item_1_img_link"));
	}

	public WebElement getBlackTshirtTitleLink() {
		return driver.findElement(By.id("item_1_title_link"));
	}

	public WebElement getBlackTShirtAddToCartButton() {
		return driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
	}

	public WebElement getBlackTShirtPrice() {
		return driver.findElement(
				By.xpath("//*[contains(@class, 'inventory_item')][3]//*[contains(@class, 'inventory_item_price')]"));
	}

	// ______________Everything for Jacket________________________

	public WebElement getJacketImgLink() {
		return driver.findElement(By.id("item_5_img_link"));
	}

	public WebElement getJacketTitleLink() {
		return driver.findElement(By.id("item_5_title_link"));
	}

	public WebElement getJacketAddToCartButton() {
		return driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
	}

	public WebElement getJacketPrice() {
		return driver.findElement(
				By.xpath("//*[contains(@class, 'inventory_item')][4]//*[contains(@class, 'inventory_item_price')]"));
	}
	// ______________Everything for SmallRedTShirt________________________

	public WebElement getSmallRedTShirtImgLink() {
		return driver.findElement(By.id("item_2_img_link"));
	}

	public WebElement getSmallRedTShirtTitleLink() {
		return driver.findElement(By.id("item_2_title_link"));
	}

	public WebElement getSmallRedTShirtAddToCartButton() {
		return driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
	}

	public WebElement getSmallRedTShirtPrice() {
		return driver.findElement(
				By.xpath("//*[contains(@class, 'inventory_item')][5]//*[contains(@class, 'inventory_item_price')]"));
	}
	// ______________Everything for BigRedTShirt________________________

	public WebElement getBigRedTShirtImgLink() {
		return driver.findElement(By.id("item_3_img_link"));
	}

	public WebElement getBigRedTShirtTitleLink() {
		return driver.findElement(By.id("item_3_title_link"));
	}

	public WebElement getBigRedTShirtAddToCartButton() {
		return driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
	}

	public WebElement getBigRedTShirtPrice() {
		return driver.findElement(
				By.xpath("//*[contains(@class, 'inventory_item')][6]//*[contains(@class, 'inventory_item_price')]"));
	}

	// ______________Footer informations/Links________________________

	public WebElement getTwitterLink() {
		return driver.findElement(By.xpath("//*[text()='Twitter']"));
	}

	public WebElement getFacebookLink() {
		return driver.findElement(By.xpath("//*[text()='Facebook']"));
	}

	public WebElement getLinkedinLink() {
		return driver.findElement(By.xpath("//*[text()='LinkedIn']"));
	}

}

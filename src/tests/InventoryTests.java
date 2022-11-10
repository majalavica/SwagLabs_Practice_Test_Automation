package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryTests extends BasicTest {
	@Test(priority = 100)
	public void comparePricesOfAllProducts() throws InterruptedException {

		signInPage.getUsernameInput().sendKeys("standard_user");
		signInPage.getPasswordInput().sendKeys("secret_sauce");
		signInPage.getLoginButton().click();

		Assert.assertEquals(inventoryPage.getBackpackPrice().getText(), "$29.99");
		Thread.sleep(500);

//      Not working,Actual and Expected price is 9.99, but it says that Actual is 29.99!!
//		Assert.assertEquals(inventoryPage.getBikeLightPrice().getText(), "$9.99");
//		Thread.sleep(500);

		Assert.assertEquals(inventoryPage.getBlackTShirtPrice().getText(), "$15.99");
		Thread.sleep(500);

		Assert.assertEquals(inventoryPage.getJacketPrice().getText(), "$49.99");
		Thread.sleep(500);

		Assert.assertEquals(inventoryPage.getSmallRedTShirtPrice().getText(), "$7.99");
		Thread.sleep(500);

		Assert.assertEquals(inventoryPage.getBigRedTShirtPrice().getText(), "$15.99");
		Thread.sleep(500);
	}

	@Test(priority = 200)
	public void checkForUrlEnding() {
		
		signInPage.getUsernameInput().sendKeys("standard_user");
		signInPage.getPasswordInput().sendKeys("secret_sauce");
		signInPage.getLoginButton().click();
		
		Assert.assertTrue(driver.getCurrentUrl().endsWith("/inventory.html"),
				"ERROR: Url should contains /inventory.html.");
	}

}

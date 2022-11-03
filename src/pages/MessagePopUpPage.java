package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MessagePopUpPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public MessagePopUpPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void waitForMenuToBeVisible() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("bm-menu")));
	}

	public void waitForLockedUserErrorToBeVissible() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error-message-container")));
	}

	public WebElement getErrorMessage() {
		return driver.findElement(By.xpath("//*[@data-test = 'error']"));
	}

}

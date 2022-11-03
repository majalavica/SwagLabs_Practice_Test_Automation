package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTests extends BasicTest {

	@Test(priority = 1000)
	public void checksInputTypes() throws InterruptedException {
		signInPage.getUsernameInput().click();
		Assert.assertEquals(signInPage.getUsernameInput().getAttribute("type"), "text",
				"ERROR: Input name should be text ");
		signInPage.getPasswordInput().click();
		Assert.assertEquals(signInPage.getPasswordInput().getAttribute("type"), "password",
				"ERROR: Inpup type should be password ");
		Thread.sleep(1000);
	}

	@Test(priority = 100)
	public void displayErrorWhenUsernameIsRequired() throws InterruptedException {
		signInPage.getLoginButton().click();

		messagePopUpPage.waitForLockedUserErrorToBeVissible();

		Assert.assertTrue(messagePopUpPage.getErrorMessage().getText().equals("Epic sadface: Username is required"),
				"ERROR: Message should be Epic sadface: Username is required.");
		Thread.sleep(1000);
	}

	@Test(priority = 200)
	public void displayErrorWhenPasswordIsRequired() throws InterruptedException {
		signInPage.getUsernameInput().sendKeys("standard_user");
		signInPage.getLoginButton().click();

		messagePopUpPage.waitForLockedUserErrorToBeVissible();

		Assert.assertTrue(messagePopUpPage.getErrorMessage().getText().equals("Epic sadface: Password is required"),
				"ERROR: Message should be Epic sadface: Password is required.");
		Thread.sleep(1000);
	}

	@Test(priority = 300)
	public void standardSignIn() throws InterruptedException {
		signInPage.getUsernameInput().sendKeys("standard_user");
		signInPage.getPasswordInput().sendKeys("secret_sauce");
		Thread.sleep(500);
		signInPage.getLoginButton().click();
	}

	@Test(priority = 400)
	public void displayErrorWhenUserIsLockedOut() throws InterruptedException {
		signInPage.getUsernameInput().sendKeys("locked_out_user");
		signInPage.getPasswordInput().sendKeys("secret_sauce");
		signInPage.getLoginButton().click();

		messagePopUpPage.waitForLockedUserErrorToBeVissible();

		Assert.assertTrue(
				messagePopUpPage.getErrorMessage().getText()
						.equals("Epic sadface: Sorry, this user has been locked out."),
				"ERROR: Message should be Epic sadface: Sorry, this user has been locked out.");
		Thread.sleep(1000);
	}

	@Test(priority = 500)
	public void problemUserSignIn() throws InterruptedException {
		signInPage.getUsernameInput().sendKeys("problem_user");
		signInPage.getPasswordInput().sendKeys("secret_sauce");
		Thread.sleep(500);
		signInPage.getLoginButton().click();
	}

	@Test(priority = 600)
	public void performanceGlitchUserSignIn() throws InterruptedException {
		signInPage.getUsernameInput().sendKeys("performance_glitch_user");
		signInPage.getPasswordInput().sendKeys("secret_sauce");
		Thread.sleep(500);
		signInPage.getLoginButton().click();
	}

	@Test(priority = 700)
	public void displayErrorWhenPasswordOrUsernameAreNotCorrect() throws InterruptedException {

		// Wrong username, but correct password
		signInPage.getUsernameInput().sendKeys("standard_users");
		signInPage.getPasswordInput().sendKeys("secret_sauce");
		signInPage.getLoginButton().click();

		messagePopUpPage.waitForLockedUserErrorToBeVissible();

		Assert.assertTrue(
				messagePopUpPage.getErrorMessage().getText()
						.equals("Epic sadface: Username and password do not match any user in this service"),
				"ERROR: Message should be Epic sadface: Username and password do not match any user in this service.");
		Thread.sleep(1000);

		// Wrong password, but correct username
		signInPage.getUsernameInput().clear();
		signInPage.getUsernameInput().sendKeys("standard_user");
		signInPage.getPasswordInput().sendKeys("secretsauce");

		messagePopUpPage.waitForLockedUserErrorToBeVissible();

		Assert.assertTrue(
				messagePopUpPage.getErrorMessage().getText()
						.equals("Epic sadface: Username and password do not match any user in this service"),
				"ERROR: Message should be Epic sadface: Username and password do not match any user in this service.");
		Thread.sleep(1000);

	}
}

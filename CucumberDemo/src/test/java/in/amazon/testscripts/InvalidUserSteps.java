package in.amazon.testscripts;

import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidUserSteps extends Driver {
	
	
	@Given("a user is on the home page of Amazon")
	public void a_user_is_on_the_home_page_of_amazon() {
		Assert.assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	}

	@When("he hovers over Hello Sign in menu")
	public void he_hovers_over_hello_sign_in_menu() {
		
		landingPage.hoverOverHelloSignIn();
	}

	@When("he clicks on Sign in button in the sub-menu")
	public void he_clicks_on_sign_in_button_in_the_sub_menu() {
		landingPage.clickSignInBtn();
	}

	@When("he enters an invalid username as {string}")
	public void he_enters_an_invalid_username_as(String string) {
		
		signIn.enterUsername(string);
		//Thread.sleep(2000);
	}

	@When("he click on continue button")
	public void he_click_on_continue_button() {
		signIn.clickContinueBtn();
	}

	@Then("he must see the error message {string}")
	public void he_must_see_the_error_message(String string) {
		String expectedErrMsg = "We cannot find an account with that email address";
		String actualErrMsg = signIn.getErrMsg();
		Assert.assertEquals(actualErrMsg,expectedErrMsg);
		
	}

}

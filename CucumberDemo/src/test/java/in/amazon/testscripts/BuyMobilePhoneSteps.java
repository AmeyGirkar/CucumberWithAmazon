package in.amazon.testscripts;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.AssertJUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyMobilePhoneSteps extends Driver {
	
	@Given("a user is on the Landing page of Amazon")
	public void a_user_is_on_the_landing_page_of_amazon() {
		Assert.assertTrue(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
	}

	@When("he clicks on Mobiles menu")
	public void he_clicks_on_mobiles_menu() {

		landingPage.clickMobiles();
		

	}

	@When("he hovers the pointer over Mobile & Accessories section")
	public void he_hovers_the_pointer_over_mobile_accessories_section() {
		mobiles.hoverOverMobilesAndAccessories();
		
	}

	@When("he clicks on Apple in the sub-menu")
	public void he_clicks_on_apple_in_the_sub_menu() {
		mobiles.clickApple();

	}

	@When("he clicks on the first avaiable phone")
	public void he_clicks_on_the_first_avaiable_phone() {
		applePhones.clickFirstApplePhone();
		

	}

	@When("he clicks on Buy Now button")
	public void he_clicks_on_buy_now_button() {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		buyPhone.clickBuyNowButton();

	}

	@Then("he should be able to purchase a mobile phone successfully")
	public void he_should_be_able_to_purchase_a_mobile_phone_successfully() {
		String expectedTitle = "Amazon Sign In";
		String actualTitle = driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
		
		

	}



}

package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Base.DriverManager;
import Fixtures.HomePageFixture;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	HomePageFixture objHomePageFixture = new HomePageFixture();
	public static String CountBeforeItemAdd;

	@Given("^user has launched the application$")
	public void user_already_on_login_page() throws IOException {
		DriverManager.openPage("loginURL");

	}

	@When("^title of login page is \"(.*)\"$")
	public void title_of_login_page_is_free_CRM(String ExpetedTitle) {
		String Title = DriverManager.getDriver().getTitle();
		Assert.assertEquals(ExpetedTitle, Title);
	}

	
	@Then("^user enters \"(.*)\" in search box$")
	public void user_enters_username_and_password(String searchItem) {
		objHomePageFixture.enterSearchItem(searchItem);
	}

	@Then("^user clicks on search button$")
	public void user_clicks_on_search_button() {
		objHomePageFixture.clickSearchbutton();
	}

	@Then("^user clicks on first search option$")
	public void user_clicks_on_First_search_opt() throws InterruptedException {
		Thread.sleep(2000);
		objHomePageFixture.clickFirstSearchOpt();
		Thread.sleep(2000);
	}

	@Then("^user clicks on Item link$")
	public void user_clicks_on_Item_link() throws InterruptedException {
		Utility.reusableMethods.waitforVisibilityOfElement(objHomePageFixture.ItemLink());
		objHomePageFixture.clickOnItemLink();
		Thread.sleep(4000);
		Utility.reusableMethods.switchedToChildWindow();
		try {
			CountBeforeItemAdd = objHomePageFixture.getNoofItemsAddedInCard();
		} catch (NoSuchElementException e) {
			CountBeforeItemAdd = "0";
		}

	}

	@Then("^Validate item count after adding new item to card$")
	public void validate_card_Count_post_item_add() throws InterruptedException {

		String CountAfterItemAdd = objHomePageFixture.getNoofItemsAddedInCard();

		if (Integer.valueOf(CountAfterItemAdd) > Integer.valueOf(CountBeforeItemAdd)) {
			System.out.println("Successfully added Item to card");
		}

	}

	@Then("^user clicks on Add to Card button$")
	public void user_clicks_on_addToCard_Button() {
		objHomePageFixture.clickaddToCardButton();
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		DriverManager.getDriver().close();
	}

}

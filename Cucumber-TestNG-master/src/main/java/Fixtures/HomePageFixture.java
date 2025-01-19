package Fixtures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base.DriverManager;
import pages.HomePage;

public class HomePageFixture {

	HomePage homePageLocators = null;

	public HomePageFixture() {

		this.homePageLocators = new HomePage();

		PageFactory.initElements(DriverManager.getDriver(), homePageLocators);
	}

	// Get the User name from Home Page
	public void enterSearchItem(String searchItem) {
		homePageLocators.getProductSearch(searchItem);
	}

	public void clickSearchbutton() {
		homePageLocators.clickSearchButton();
	}

	public void clickFirstSearchOpt() {
		homePageLocators.clickFirstSearchOpt();
	}

	public void clickOnItemLink() {
		homePageLocators.clickOnItemLink();
	}

	public WebElement ItemLink() {
		return homePageLocators.ItemLink();
	}

	public void clickaddToCardButton() {
		homePageLocators.clickaddToCardButton();
	}

	public String getNoofItemsAddedInCard() {
		return homePageLocators.getNoofItemsAddedInCard();
	}

	public boolean IsgetNoofItemsAddedInCardPresent() {
		return homePageLocators.IsgetNoofItemsAddedInCardPresent();
	}

}

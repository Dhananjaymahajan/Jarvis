package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath = "//input[@title='Search']")
	private WebElement getSearchbox;

	@FindBy(xpath = "//button[@value='Search']")
	private WebElement getSearchbutton;

	@FindBy(xpath = "(//a[@role='option'])[1]")
	private WebElement getFirstSearchOption;

	@FindBy(xpath = "(//a[@class='s-item__link']/div/span[@role='heading'])[3]")
	private WebElement clickOnItemLink;

	@FindBy(xpath = "//a[@id='atcBtn_btn_1']")
	private WebElement addToCardButton;

	@FindBy(xpath = "//span[@class='badge']")
	private WebElement getNoofItemsAddedInCard;

	public void getProductSearch(String searchItem) {
		getSearchbox.sendKeys(searchItem);
	}

	public void clickSearchButton() {
		getSearchbutton.click();
	}

	public void clickFirstSearchOpt() {
		getFirstSearchOption.click();
	}

	public void clickOnItemLink() {
		clickOnItemLink.click();
	}

	public WebElement ItemLink() {
		return clickOnItemLink;
	}

	public void clickaddToCardButton() {
		addToCardButton.click();
	}

	public String getNoofItemsAddedInCard() {
		return getNoofItemsAddedInCard.getText();
	}

	public boolean IsgetNoofItemsAddedInCardPresent() {
		return getNoofItemsAddedInCard.isDisplayed();
	}

}

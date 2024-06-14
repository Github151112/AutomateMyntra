package PomPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BaseClass {

	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// profile button
	@FindBy(xpath = "//span[text()='Profile']")
	private WebElement profileButton;

	// login Button
	@FindBy(xpath = "//a[@class='desktop-linkButton']")
	private WebElement loginButton;

	// Phone no
	@FindBy(xpath = "//input[@class='form-control mobileNumberInput']")
	private WebElement phoneNoTextField;

	// continue button
	@FindBy(xpath = "//div[text()='CONTINUE']")
	private WebElement continueButton;
	
	
	//searchTextField
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	private WebElement searchTextField;
	

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getProfileButton() {
		return profileButton;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getPhoneNoTextField() {
		return phoneNoTextField;
	}

	public void searchProduct(String productName)
	{
		searchTextField.sendKeys(productName,Keys.ENTER);
	}

}

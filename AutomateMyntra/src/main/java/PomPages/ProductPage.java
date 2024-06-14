package PomPages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import GenericLibrary.WorkLib;

public class ProductPage extends BaseClass {

	public ProductPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//h4[@class='product-product'])[3]")
	private WebElement shoesLink;

	@FindBy(xpath = "//div[text()='ADD TO BAG']")
	private WebElement addToBag;
	
	@FindBy(xpath = "//p[text()='6']")
	private WebElement size;

	public WebElement getShoesLink() {
		return shoesLink;
	}

	public void clickOnShoes(WebDriver driver) {
		shoesLink.click();
		WorkLib lib = new WorkLib();
		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			driver.switchTo().window(id);
			if (driver.getTitle()
					.equals("Buy Puma Women Adelina Ballerina Shoes  - Casual Shoes for Women 29533748 | Myntra")) {
				break;
			}
		}
		size.click();
		addToBag.click();

	}

}

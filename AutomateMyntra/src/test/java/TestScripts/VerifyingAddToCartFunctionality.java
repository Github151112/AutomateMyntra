package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import GenericLibrary.ReusableMethods;
import PomPages.ProductPage;
import PomPages.WelcomePage;

public class VerifyingAddToCartFunctionality extends BaseTest {

	@Test
	public void addToCartFunctionality() {

		WelcomePage page = new WelcomePage(driver);
		ProductPage pp = new ProductPage(driver);
		ReusableMethods r = new ReusableMethods();
		try {
			page.searchProduct(r.getDataFromExcelSheet(EXCEL_PATH, PROD_SHEET, 1, 0));
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		pp.clickOnShoes(driver);

	}

}

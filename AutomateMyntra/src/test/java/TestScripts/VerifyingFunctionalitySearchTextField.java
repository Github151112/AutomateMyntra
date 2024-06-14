package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import GenericLibrary.ReusableMethods;
import PomPages.WelcomePage;

public class VerifyingFunctionalitySearchTextField extends BaseTest {

	@Test
	public void searchProduct() throws EncryptedDocumentException, IOException {
		WelcomePage wp = new WelcomePage(driver);

		for (int i = 0; i < 5; i++) {
			ReusableMethods methods = new ReusableMethods();
			String value = methods.getDataFromExcelSheet(EXCEL_PATH, PROD_SHEET, i, 0);
			wp.searchProduct(value);
		}
	}

}

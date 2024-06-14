package GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConstant {

	public WebDriver driver;


	@BeforeClass
	public void setUp() throws IOException {
		ReusableMethods methods = new ReusableMethods();
		String browser = methods.getDataFromProperty(PROP_PATH, "browser");
		String url = methods.getDataFromProperty(PROP_PATH, "url");
		if (browser.equals("chrome"))
			driver = new ChromeDriver();
		else if (browser.equals("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equals("edge"))
			driver = new EdgeDriver();
		else
			Reporter.log("Invalid browser", true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);

	}

	@AfterClass
	public void tearDown() {
		//driver.quit();
	}

}

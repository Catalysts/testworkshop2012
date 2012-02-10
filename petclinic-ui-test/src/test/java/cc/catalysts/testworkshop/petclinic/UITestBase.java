package cc.catalysts.testworkshop.petclinic;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class UITestBase {

	protected static FirefoxDriver driver;
	protected final long timeoutMillis = 5000;
	protected long ajaxTimeoutMillis = 100;

	@BeforeClass
	public static void setup() {
		driver = new FirefoxDriver();
	}

	@AfterClass
	public static void teardown() {
		driver.close();
	}

	

	public UITestBase() {
		super();
	}

}
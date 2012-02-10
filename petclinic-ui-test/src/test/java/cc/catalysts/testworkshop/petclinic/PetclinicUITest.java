package cc.catalysts.testworkshop.petclinic;

import cc.catalysts.testworkshop.petclinic.component.ComponentFactory;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PetclinicUITest {
	private static TestContext context;

	@BeforeClass
	public static void setup() {
		context = new TestContext();
		context.setBaseUrl("http://localhost:8080");
		context.setDriver(new FirefoxDriver());
		context.setComponentFactory(new ComponentFactory(context.getDriver()));
	}

	@AfterClass
	public static void teardown() {
		context.getDriver().close();
	}

	protected static TestContext getContext() {
		return context;
	}

}
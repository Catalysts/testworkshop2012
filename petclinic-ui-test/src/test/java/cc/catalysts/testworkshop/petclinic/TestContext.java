package cc.catalysts.testworkshop.petclinic;

import cc.catalysts.testworkshop.petclinic.component.ComponentFactory;

import org.openqa.selenium.WebDriver;

public class TestContext {
	private String baseUrl;
	private WebDriver driver;
	private ComponentFactory componentFactory;

	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(final String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(final WebDriver driver) {
		this.driver = driver;
	}

	public ComponentFactory getComponentFactory() {
		return componentFactory;
	}

	public void setComponentFactory(final ComponentFactory componentFactory) {
		this.componentFactory = componentFactory;
	}
}

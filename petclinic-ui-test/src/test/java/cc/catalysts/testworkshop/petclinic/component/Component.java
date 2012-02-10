package cc.catalysts.testworkshop.petclinic.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Component {
	private WebDriver driver;
	private By by;

	public Component(WebDriver driver, By by) {
		super();
		this.driver = driver;
		this.by = by;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public By getBy() {
		return by;
	}

	public void setBy(By by) {
		this.by = by;
	}

	public WebElement getElement() {
		return getDriver().findElement(getBy());
	}
}
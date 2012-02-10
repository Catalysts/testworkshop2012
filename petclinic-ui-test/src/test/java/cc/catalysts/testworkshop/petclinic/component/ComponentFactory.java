package cc.catalysts.testworkshop.petclinic.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComponentFactory {
	private WebDriver driver;

	public ComponentFactory(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public Input createInput(String id) {
		return new Input(driver, By.id(id));
	}

	public Input createInput(By by) {
		return new Input(driver, by);
	}

	public Button createButton(By by) {
		return new Button(driver, by);
	}
}
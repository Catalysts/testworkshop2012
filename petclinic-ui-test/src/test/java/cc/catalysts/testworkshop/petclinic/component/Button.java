package cc.catalysts.testworkshop.petclinic.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends Component {
	public Button(WebDriver driver, By by) {
		super(driver, by);
	}

	public void click() {
		getElement().click();
	}
}
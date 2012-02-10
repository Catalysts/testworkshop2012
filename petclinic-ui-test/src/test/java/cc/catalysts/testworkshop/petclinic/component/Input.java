package cc.catalysts.testworkshop.petclinic.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input extends Component {
	public Input(WebDriver driver, By by) {
		super(driver, by);
	}

	public void setText(CharSequence txt) {
		WebElement element = getElement();
		element.clear();
		element.sendKeys(txt);
	}

	public String getText() {
		return getElement().getText();
	}

}
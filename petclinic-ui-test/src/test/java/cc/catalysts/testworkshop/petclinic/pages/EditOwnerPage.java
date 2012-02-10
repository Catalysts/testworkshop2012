package cc.catalysts.testworkshop.petclinic.pages;

import cc.catalysts.testworkshop.petclinic.TestContext;
import cc.catalysts.testworkshop.petclinic.component.Button;
import cc.catalysts.testworkshop.petclinic.component.ComponentFactory;
import cc.catalysts.testworkshop.petclinic.component.Input;

import org.openqa.selenium.By;

public class EditOwnerPage {
	private final String url;
	private final TestContext context;

	private final Input firstName;
	private final Input lastName;
	private final Input address;
	private final Input city;
	private final Input telephone;
	private final Button saveButton;

	public EditOwnerPage(final TestContext context) {
		this.context = context;
		this.url = context.getBaseUrl() + "/petclinic/owners/new";

		ComponentFactory componentFactory = context.getComponentFactory();
		firstName = componentFactory.createInput("firstName");
		lastName = componentFactory.createInput("lastName");
		address = componentFactory.createInput("address");
		city = componentFactory.createInput("city");
		telephone = componentFactory.createInput("telephone");
		saveButton = componentFactory.createButton(By.className("submit"));
	}

	public void load() {
		context.getDriver().get(url);
	}

	public Input getFirstName() {
		return firstName;
	}

	public Input getLastName() {
		return lastName;
	}

	public Input getAddress() {
		return address;
	}

	public Input getCity() {
		return city;
	}

	public Input getTelephone() {
		return telephone;
	}

	public Button getSaveButton() {
		return saveButton;
	}
}

package cc.catalysts.testworkshop.petclinic;

import cc.catalysts.testworkshop.petclinic.pages.EditOwnerPage;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EditOwnerPageTest extends PetclinicUITest {
	private static EditOwnerPage editOwnerPage;

	@BeforeClass
	public static void beforeClass() {
		editOwnerPage = new EditOwnerPage(getContext());
	}

	@Test
	public void addOwnerTestValid() {
		editOwnerPage.load();
		editOwnerPage.getFirstName().setText("Max");
		editOwnerPage.getLastName().setText("Mustermann");
		editOwnerPage.getAddress().setText("Hauptstrasse 3");
		editOwnerPage.getCity().setText("Linz");
		editOwnerPage.getTelephone().setText("0900123456");
		editOwnerPage.getSaveButton().click();

		Assert.assertFalse(getContext().getDriver().getCurrentUrl()
				.endsWith("/new"));
	}

	@Test
	public void addOwnerTestTelephoneNotNumeric() {
		editOwnerPage.load();
		editOwnerPage.getFirstName().setText("Max");
		editOwnerPage.getLastName().setText("Mustermann");
		editOwnerPage.getAddress().setText("Hauptstrasse 3");
		editOwnerPage.getCity().setText("Linz");
		editOwnerPage.getTelephone().setText("asdf");
		editOwnerPage.getSaveButton().click();

		Assert.assertTrue(getContext().getDriver().getCurrentUrl()
				.endsWith("/new"));
	}

	@Test
	public void addOwnerTestEmpty() {

	}

	@Test
	public void addAndDeleteOwnerTest() {

	}

	@Test
	public void addAndFindOwnerViaNameTest() {

	}

	@Test
	public void addAndFindOwnerInListTest() {

	}

	@Test
	public void editOwnerTestValid() {

	}

	@Test
	public void editOwnerTestEmpty() {

	}

	@Test
	public void editOwnerTestTelephoneNotNumeric() {

	}
}

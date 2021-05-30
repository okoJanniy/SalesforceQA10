package pages;

import elements.contactPage.Search;
import io.qameta.allure.Step;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactModal extends BasePage {
    public static final By SAVE_BUTTON = By.xpath("//button[@name='SaveEdit']");
    public static final By MODAL_TITLE = By.cssSelector("//h2[text()='New Contact']");

    public ContactModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }
    @Step("Create new contact")
    public ContactDetailsPage create(Contact contact) {
        new elements.contactPage.DropDown(driver, "Salutation").select("Mr.");
        new elements.contactPage.Input(driver, "First Name").write(contact.getFirstName());
        new elements.contactPage.Input(driver, "Middle Name").write(contact.getMiddleName());
        new elements.contactPage.Input(driver, "Last Name").write(contact.getLastName());
        new elements.contactPage.Input(driver, "Suffix").write(contact.getSuffix());
        new Search(driver, "Account Name").select("Anton");
        new elements.contactPage.Input(driver, "Title").write(contact.getTitle());
        new elements.contactPage.Input(driver, "Email").write(contact.getEmail());
        new elements.contactPage.Input(driver, "Phone").write(contact.getPhone());
        new elements.contactPage.Input(driver, "Mobile").write(contact.getMobile());
        new elements.contactPage.Input(driver, "Department").write(contact.getDepartment());
        new elements.contactPage.Input(driver, "Fax").write(contact.getFax());
        new Search(driver, "Mailing Address").select("Belarus");
        new elements.contactPage.Input(driver, "Mailing City").write(contact.getMailingCity());
        new elements.contactPage.Input(driver, "Mailing State/Province").write(contact.getMailingState());
        new elements.contactPage.Input(driver, "Mailing Country").write(contact.getMailingCountry());
        new elements.accountPage.Input(driver, "Mailing Zip/Postal Code").write(contact.getMailingZipCode());
        save();
        return new ContactDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
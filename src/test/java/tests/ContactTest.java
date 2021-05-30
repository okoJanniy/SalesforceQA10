package tests;

import models.Contact;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class ContactTest extends BaseTest {

    @Test(description = "Contact should be created")
    public void contactShouldBeCreated() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Login Page не открылась");
        isOpened = loginPage
                .login("meral8-sten@force.com", "Salesforce13111990")
                .isPageOpened();
        assertTrue(isOpened, "Home Page не открылась");
        //FACTORY
        //BUILDER
        //RANDOM DATA
        Contact contact = new Contact("Anton", "Anton", "Anton", "12346", "Title", "mail.ru",
                "12345678", "87654321", "Minsk", "11223344", "Minsk", "1234",
                "Bel", "Bel");
        contactListPage
                .open()
                .clickNew()
                .create(contact)
                .openDetailsTab()
                .validateContact(contact);
    }
}
package tests;

import jdk.internal.jimage.BasicImageReader;
import models.Contact;
import org.testng.annotations.Test;
import pages.ContactListPage;
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
                .login("latosh.viktorija-xyh7@force.com", "password0")
                .isPageOpened();
        assertTrue(isOpened, "Home Page не открылась");
        //FACTORY
        //BUILDER
        //RANDOM DATA
        Contact contact = new Contact("Anton", "Man", "Lol", "6373832",
                "Test", "Title", "test@gmail.com", "256771",
                "375297365426", "department", "321336516", "Knorina",
                "Minsk", "2222222", "Минск", "Belarus");
        contactListPage
                .open()
                .clickNew()
                .create(contact)
                .openDetailsTab()
                .validateContact(contact);
    }
}
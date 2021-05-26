package tests;

import models.Account;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {


    @Test(description = "Account should be created")
    public void accountShouldBeCreated() {
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
        Account account = new Account("Anton", "website.by", "375223452653", "none", "20",
                "Knorina", "Knorina", "Minsk", "Belarus", "Minsk",
                "Belarus", "123456", "Belarus", "654321", "Belarus");

        accountListPage
                .open()
                .clickNew()
                .create(account)
                .openDetailsTab()
                .validateAccount(account);
    }
}
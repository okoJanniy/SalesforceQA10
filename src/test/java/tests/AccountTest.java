package tests;

import models.Account;
import org.testng.annotations.Test;
import pages.AccountListPage;

import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {


    @Test
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
        Account account = new Account("Anton", "+375292342153", "website.by", "salesforce.com",
                "none", "20", "Knorina", "Knorina", "Minsk", "Belarus",
                "Minsk", "Belarus", "232123", "Minsk", "456653", "Minsk");
        accountsListPage
                .open()
                .clickNew()
                .create(account)
                .openDetailsTab()
                .validateAccount(account);
    }
}
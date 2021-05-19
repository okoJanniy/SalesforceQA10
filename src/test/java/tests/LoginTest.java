package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Страница логина не открылась");
        isOpened = loginPage
                .login("meral8-sten@force.com", "Salesforce13111990")
                .isPageOpened();
        assertTrue(isOpened, "Home Page не открылась");
    }
}
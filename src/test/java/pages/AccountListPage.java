package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage {
    public static final By NEW_BUTTON = By.cssSelector("[title=New]");
    By icon = By.cssSelector("img[title=Accounts]");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }
    @Step("Opening login page")
    public boolean isPageOpened() {
        return isExist(icon);
    }
    @Step("Opening account page")
    public AccountListPage open() {
        driver.get(BASE_URL + "lightning/o/Account/list?filterName=Recent");
        return this;
    }
    @Step("Click new account")
    public AccountModal clickNew() {
        driver.findElement(NEW_BUTTON).click();
        return new AccountModal(driver);
    }

}
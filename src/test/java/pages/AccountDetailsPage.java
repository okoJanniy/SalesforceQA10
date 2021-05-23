package pages;

import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage {
    public static final By DETAILS_TAB = By.xpath("//div[contains(@class,'active')]//*[@id='detailTab__item']");

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    //TODO implement
    public boolean isPageOpened() {
        return false;
    }

    public AccountDetailsPage openDetailsTab() {
        driver.findElement(DETAILS_TAB).click();
        return this;
    }

    public void validateAccount(Account account) {
        validateInput("Account Name", account.getAccountName());
        validateInput("Type", "Analyst");
        validateAHref("Website", account.getWebsite());
        validateAHref("Phone", account.getPhone());
        validateInput("Description", account.getDescription());
        validateInput("Industry", "Banking");
        validateNumber("Employees", account.getEmployees());
        validateAddress("Billing Address", new String[]{account.getBillingStreet(), account.getBillingCity(),
                account.getBillingStateProvince(), account.getBillingZip(), account.getBillingCountry()});
        validateAddress("Shipping Address", new String[]{account.getShippingStreet(), account.getShippingCity(),
                account.getShippingStateProvince(), account.getShippingZip(), account.getShippingCountry()});

    }
}
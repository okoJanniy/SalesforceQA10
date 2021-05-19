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
        validateInput("Phone", account.getPhone());
        validateInput("Website", account.getWebsite());
        validateInput("Parent Account", account.getParentAccount());
        validateInput("Description", account.getDescription());
        validateInput("Employees", account.getEmployees());
        validateInput("Billing Street", account.getBillingStreet());
        validateInput("Shipping Street", account.getShippingStreet());
        validateInput("Billing City", account.getBillingCity());
        validateInput("Billing State/Province", account.getBillingStateProvince());
        validateInput("Billing Zip", account.getBillingZip());
        validateInput("Billing Country ", account.getBillingCountry());
        validateInput("Shipping Zip", account.getShippingZip());
        validateInput("Shipping Country", account.getShippingCountry());
        validateInput("Type", "Analyst");
        validateInput("Industry", "Banking");

    }
}
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
        validateInput("Phone", account.getPhone());
        validateInput("Website", account.getWebsite());
        validateInput("Industry", "Banking");
        validateInput("Employees", account.getEmployees());
        validateInput("Billing City", account.getBillingCity());
        validateInput("Billing State/Province", account.getBillingStateProvince());
        validateInput("Billing Zip/Postal Code", account.getBillingZip());
        validateInput("Billing Country ", account.getBillingCountry());
        validateInput("Shipping Zip/Postal Code", account.getShippingZip());
        validateInput("Shipping Country", account.getShippingCountry());



    }
}
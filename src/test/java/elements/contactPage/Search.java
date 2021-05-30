package elements.contactPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    WebDriver driver;
    String searchLabel;
    String searchLocator = "//*[contains(@class,'modal-body')]//label[text()='%s']/ancestor::slot[contains(@name, " +
            "'inputField')]//input";
    String searchOptionLocator = "//*[contains(@class,'modal-body')]//div[contains(@class,'slds-dropdown')]//lightning-base-combobox-item//span[contains(@title,'Test')]";

    public Search(WebDriver driver, String searchLabel) {
        this.driver = driver;
        this.searchLabel = searchLabel;
    }

    public void select(String option) {
        driver.findElement(By.xpath(String.format(searchLocator, searchLabel))).click();
        driver.findElement(By.xpath(String.format(searchOptionLocator, option))).click();
    }
}
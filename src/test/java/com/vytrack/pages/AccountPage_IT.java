package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountPage_IT extends BasePage {
    public AccountPage_IT() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Customers')]")
    public WebElement hoverOverToCustomer;

    @FindBy(xpath = "//span[@class='title title-level-2'][normalize-space()='Accounts']")
    public WebElement account;

    @FindBy(xpath = "//select[@data-action='add-filter-select']/option")
    public List<WebElement> filterOptions;


}

package com.vytrack.pages;

import com.vytrack.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesModelPage_XS extends BasePage {

    public VehiclesModelPage_XS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Locator for Web Table
    @FindBy(xpath = "//thead[@class='grid-header']/tr/th")
    public List<WebElement> webTableColumns;

    // Locator for Error Message
    @FindBy(xpath = "//*[@data-messenger-namespace='eed2dfc230ad3968235b216c8d8c54588cb2f30904a1c179d4416e09dd8008d3']")
    public WebElement errorMessage;

}

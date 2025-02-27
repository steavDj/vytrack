package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesModelPage_XS extends BasePage {

    public VehiclesModelPage_XS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy(linkText = "Vehicles Model")
//    public WebElement vehiclesModelButton;

    @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-2074154532\"]/div[2]/div[2]/div[2]/div/table/thead")
    public WebElement vehiclesModelWebTable;

}

package com.vytrack.pages;

import com.vytrack.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage extends BasePage {
    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Button to see view, edit, and delete car - US06-LS
    @FindBy(xpath = "//table//tbody//tr[2]//td[last()]")
    public WebElement editVehicleOptionsDropdown;


    @FindBy(xpath  ="//li[@class='launcher-item']/a")
    public List<WebElement> editOptions;

}

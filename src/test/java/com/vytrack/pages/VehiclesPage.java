package com.vytrack.pages;

import com.vytrack.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage extends BasePage {
    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Button to see view, edit, and delete car - US06-LS
    @FindBy(xpath = "//table//tbody//tr[2]//td[last()]")
    public WebElement editVehicleOptionsDropdown;;

    @FindBy(xpath = "//a[@title=\"Delete\"]")
    public WebElement deleteVehicleButton;

    @FindBy(xpath = "//a[@title=\"Edit\"]")
    public WebElement editVehicleButton;

    @FindBy(xpath = "//a[@title=\"View\"]")
    public WebElement viewVehicleButton;

    public WebElement dynamicDropdownFinder(String buttonName){
        String xpath = "//a[@title='" + buttonName + "']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

}

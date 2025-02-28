package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesPage extends BasePage {

    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@tabindex='-1']")

    public List<WebElement> allCheckBoxesInBody;


    @FindBy(xpath = "//thead//button/input[@type='checkbox']")
    public WebElement firstCheckBoxInThead;

}

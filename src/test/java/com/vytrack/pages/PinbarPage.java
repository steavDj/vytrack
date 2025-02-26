package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage {

    public PinbarPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='clearfix']/h3")
    public WebElement howToUsePinBarHeader;

    @FindBy(xpath = "(//div[@class='clearfix']//p)[1]")
    public WebElement usePinIconHeader;

    @FindBy(xpath = "(//div[@class='container-fluid']//p)[2]/img")
    public WebElement pinbarImage;



}

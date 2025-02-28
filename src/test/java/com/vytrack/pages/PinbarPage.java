package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PinbarPage extends BasePage {

    @FindBy(xpath = "//div[@class='clearfix']/h3")
    public WebElement howToUsePinBarHeader;

    @FindBy(xpath = "(//div[@class='clearfix']//p)[1]")
    public WebElement usePinIconHeader;

    @FindBy(xpath = "(//div[@class='container-fluid']//p)[2]/img")
    public WebElement pinbarImage;

}

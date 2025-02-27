package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuestionMarkPage extends BasePage {

    public QuestionMarkPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath ="//i[@class='fa-question-circle']" )
    public WebElement questionMark;




}

package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage_DS extends BasePage{

    public CalendarEventsPage_DS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvent;



}

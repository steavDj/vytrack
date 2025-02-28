package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventPage_DS extends CalendarEventsPage_DS {

    public CreateCalendarEventPage_DS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//select[@data-name='recurrence-repeats']")
    public WebElement selectRepeats;

    @FindBy(xpath = "//span[.='day(s)']//preceding-sibling::input[1]")
    public WebElement repeatFrequencyField;

    @FindBy(xpath = "//div[@data-name='recurrence-settings']//div[@data-name='recurrence-daily']//span[@class='validation-failed']")
    public WebElement repeatFrequencyFieldErrorMessage;

    @FindBy(id = "tinymce")
    public WebElement descriptionBox;

    @FindBy(tagName = "iframe")
    public WebElement iframe;
}

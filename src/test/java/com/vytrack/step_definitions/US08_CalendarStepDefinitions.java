package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.CalendarEventsPage_DS;
import com.vytrack.pages.CreateCalendarEventPage_DS;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;


public class US08_CalendarStepDefinitions {

    BasePage basePage = new BasePage();
    CalendarEventsPage_DS calendarEventsPage = new CalendarEventsPage_DS();
    CreateCalendarEventPage_DS createCalendarEventPage = new CreateCalendarEventPage_DS();

    @And("user click to the Calendar Events")
    public void userClickToTheCalendarEvents() {
        BrowserUtils.sleep(2);
        basePage.navigateToModule("Activities", "Calendar Events");
    }

    @Then("user click to the Create Calendar Event")
    public void userClickToTheCreateCalendarEvent() {
        BrowserUtils.sleep(3);
        calendarEventsPage.createCalendarEvent.click();
    }

    @When("user click on the Repeat checkbox")
    public void userClickOnTheRepeatCheckbox() {
        BrowserUtils.sleep(3);
        createCalendarEventPage.repeatCheckBox.click();
    }

    @Then("user see {string} in the Repeat Every option")
    public void userSeeInTheRepeatEveryOption(String expectedValue) {

        String actualValue = createCalendarEventPage.repeatFrequencyField.getDomProperty("value");

        Assert.assertEquals(expectedValue, actualValue);
    }


    @And("user clear Repeat Every field")
    public void userClearRepeatEveryField() {
        createCalendarEventPage.repeatFrequencyField.clear();
        BrowserUtils.sleep(1);
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = createCalendarEventPage.repeatFrequencyFieldErrorMessage.getText();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}

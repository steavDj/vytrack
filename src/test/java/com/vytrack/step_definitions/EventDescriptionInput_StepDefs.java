package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.CalendarEventsPage_DS;
import com.vytrack.pages.CreateCalendarEventPage_DS;
import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EventDescriptionInput_StepDefs {
    CreateCalendarEventPage_DS createCalendarEventPage = new CreateCalendarEventPage_DS();
    //CalendarEventsPage_DS calendarEventsPage = new CalendarEventsPage_DS(); - check with Alvin

    @Given("the user navigates to {string} under {string}")
    public void the_user_navigates_to_under(String tab, String module) {

        createCalendarEventPage.navigateToModule(tab, module);
    }

    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String button) {
        BrowserUtils.waitForClickablility(createCalendarEventPage.createCalendarEvent, 3);
        createCalendarEventPage.createCalendarEvent.click();
    }

    @When("the user writes the {string} in {string}")
    public void the_user_writes_the_in(String actualMessage, String descriptionBox) {

        Driver.getDriver().switchTo().frame(createCalendarEventPage.iframe);

        createCalendarEventPage.descriptionBox.sendKeys(actualMessage);
    }

    @Then("the user should see the {string}")
    public void the_user_should_see_the(String expectedMessage) {
        Assert.assertEquals(expectedMessage, createCalendarEventPage.descriptionBox.getText());
    }
}

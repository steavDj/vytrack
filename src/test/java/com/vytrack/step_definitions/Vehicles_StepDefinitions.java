package com.vytrack.step_definitions;
//just to show
import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.BrowserUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Vehicles_StepDefinitions {
    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("user clicks to vehicles module")
    public void user_clicks_to_vehicles_module() {
        vehiclesPage.navigateToModule("Fleet", "Vehicles");
    }

    @Then("user should see below options in the edit car info dropdown menu")
    public void user_should_see_below_options_in_the_edit_car_info_dropdown_menu(List<String> expectedDropdownItems) {
        BrowserUtils.sleep(2);
        BrowserUtils.hover(vehiclesPage.editVehicleOptionsDropdown);
        //BrowserUtils.sleep(2);
        List<String> actualEditOptions = new ArrayList<>();
        for (WebElement eachOption : vehiclesPage.editOptions) {
            actualEditOptions.add(eachOption.getDomAttribute("title"));
        }
        Assert.assertEquals(expectedDropdownItems, actualEditOptions);
    }

}

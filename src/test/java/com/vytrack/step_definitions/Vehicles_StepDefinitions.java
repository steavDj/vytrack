package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class Vehicles_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    VehiclesPage vehiclesPage = new VehiclesPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("user clicks to vehicles module")
    public void user_clicks_to_vehicles_module() {
        vehiclesPage.navigateToModule("Fleet", "Vehicles");
    }

    @Then("user should see below options in the edit car info dropdown menu")
    public void user_should_see_below_options_in_the_edit_car_info_dropdown_menu(List<String> expectedDropdownItems) {
        BrowserUtils.sleep(2);
        actions.moveToElement(vehiclesPage.editVehicleOptionsDropdown).perform();
        BrowserUtils.sleep(2);
        for (String eachDropdownItem : expectedDropdownItems) {
                    vehiclesPage.dynamicDropdownFinder(eachDropdownItem).isDisplayed();
                }


    }


}

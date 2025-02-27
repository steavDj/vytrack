package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehicleContractsPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class VehicleContractsStepDefs {


    LoginPage loginPage = new LoginPage();
    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();


    @When("the user logs in with {string} and {string}")
    public void theUserLogsInWithAnd(String username, String password) {
        loginPage.login(username, password);
    }

    @And("the user navigates to the Vehicle Contracts page")
    public void theUserNavigatesToTheVehicleContractsPage() {
        vehicleContractsPage.navigateToModule("Fleet", "Vehicle Contracts");

        // Wait for the title to be the expected Vehicle Contracts page title
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("All - Vehicle Contract"));
    }


    @Then("the user should have access to the Vehicle Contracts page")
    public void theUserShouldHaveAccessToTheVehicleContractsPage() {
        // Verify that the user has access to the Vehicle Contracts page
        assertEquals("https://qa1.vytrack.com/entity/Extend_Entity_VehicleContract", vehicleContractsPage.getPageUrl());
        assertEquals("All - Vehicle Contract - Entities - System - Car - Entities - System", vehicleContractsPage.getPageTitle());
    }

    @When("the user cannot access the Vehicle Contracts page")
    public void the_user_cannot_access_the_vehicle_contracts_page() {
        vehicleContractsPage.navigateToModule("Fleet", "Vehicle Contracts");
    }

    @Then("the Driver should see the error message {string}")
    public void the_driver_should_see_the_error_message(String expectedMessage) {
        String actualMessage = vehicleContractsPage.getErrorMessage();
        assertEquals("Error message did not match!", expectedMessage, actualMessage);
    }







}




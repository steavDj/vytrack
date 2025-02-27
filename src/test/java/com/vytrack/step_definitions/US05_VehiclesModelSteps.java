package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.VehiclesModelPage_XS;

import io.cucumber.java.en.Then;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US05_VehiclesModelSteps extends BasePage {

    VehiclesModelPage_XS vehiclesModelPage = new VehiclesModelPage_XS();

    @Then("the user navigates to VehiclesModel page")
    public void theUserNavigatesToVehiclesModelPage() {

        vehiclesModelPage.waitUntilLoaderScreenDisappear();
        vehiclesModelPage.navigateToModule("Fleet", "Vehicles Model");
        vehiclesModelPage.waitUntilLoaderScreenDisappear();

    }

    @Then("the following column should be displayed:")
    public void theFollowingColumnShouldBeDisplayed(List<String> expectedColumns) {

        List<String> actualColumns = new ArrayList<>();

        for (int i = 1; i < vehiclesModelPage.webTableColumns.size() - 1; i++) {
            actualColumns.add(vehiclesModelPage.webTableColumns.get(i).getText());
        }

        Assert.assertEquals("Vehicles Model Column Verification FAILED", actualColumns, expectedColumns);

    }

    @Then("the user gets the error {string}")
    public void theUserGetsTheError(String expectedError) {

        String actualError = vehiclesModelPage.errorMessage.getText().replace("×", "").trim();
        Assert.assertEquals("Message Verification FAILED", expectedError, actualError);

    }
}

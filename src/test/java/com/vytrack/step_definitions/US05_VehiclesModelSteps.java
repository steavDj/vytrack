package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.VehiclesModelPage_XS;

import io.cucumber.java.en.Then;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US05_VehiclesModelSteps extends BasePage {

    VehiclesModelPage_XS vehiclesModelPage = new VehiclesModelPage_XS();

    // Step Definition for navigating to the VehiclesModel page after logging in with necessary credentials
    @Then("the user navigates to VehiclesModel page")
    public void theUserNavigatesToVehiclesModelPage() {

        vehiclesModelPage.waitUntilLoaderScreenDisappear();
        vehiclesModelPage.navigateToModule("Fleet", "Vehicles Model");
        vehiclesModelPage.waitUntilLoaderScreenDisappear();

    }

    // Step Definition for Store Manager to verify column headers, separate to support modularity and maintenance
    // Receives argument List of String for expected columns on the page, compares with actual columns on the page
    @Then("the following Store Manager column should be displayed:")
    public void theFollowingStoreManagerColumnShouldBeDisplayed(List<String> expectedColumns) {

        List<String> actualColumns = new ArrayList<>();

        for (int i = 1; i < vehiclesModelPage.webTableColumns.size() - 1; i++) {
            actualColumns.add(vehiclesModelPage.webTableColumns.get(i).getText());
        }

        // Verification test through console for expected and actual ArrayLists
//        System.out.println("expectedColumns = " + expectedColumns);
//        System.out.println("actualColumns = " + actualColumns);

        Assert.assertEquals("Vehicles Model Column Verification FAILED", expectedColumns, actualColumns);

    }

    // Step Definition for Sales Manager to verify column headers, separate to support modularity and maintenance
    // Receives argument List of String for expected columns on the page, compares with actual columns on the page
    @Then("the following Sales Manager column should be displayed:")
    public void theFollowingSalesManagerColumnShouldBeDisplayed(List<String> expectedColumns) {

        List<String> actualColumns = new ArrayList<>();

        for (int i = 0; i < vehiclesModelPage.webTableColumns.size() - 1; i++) {
            actualColumns.add(vehiclesModelPage.webTableColumns.get(i).getText());
        }

        // Verification test through console for expected and actual ArrayLists
//         System.out.println("expectedColumns = " + expectedColumns);
//         System.out.println("actualColumns = " + actualColumns);

        Assert.assertEquals("Vehicles Model Column Verification FAILED", expectedColumns, actualColumns);

    }

    // Step Definition for verifying Driver users cannot access the Vehicles Model page and receive an error
    @Then("the user gets the error {string}")
    public void theUserGetsTheError(String expectedError) {

        String actualError = vehiclesModelPage.errorMessage.getText().replace("×", "").trim();
        Assert.assertEquals("Message Verification FAILED", expectedError, actualError);

    }
}

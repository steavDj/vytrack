package com.vytrack.step_definitions;

import com.vytrack.pages.BasePage;
import com.vytrack.pages.VehiclesModelPage_XS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class US05_VehiclesModelSteps {

    VehiclesModelPage_XS vehiclesModelPage = new VehiclesModelPage_XS();
    BasePage basePage = new BasePage();

//    @Given("the user is logged in as a store manager")
//    public void the_user_is_logged_in_as_a_store_manager() {
//        vehiclesModelPage.vehiclesModelButton.click();
//    }
//
//    @Given("the user is logged in as a sales manager")
//    public void theUserIsLoggedInAsA() {
//
//    }
//
//    @Given("the user is logged in as a driver")
//    public void theUserIsOnTheVehiclesModelPage() {
//
//    }

    @Then("the user navigates to VehiclesModel page")
    public void theUserNavigatesToVehiclesModelPage() {
        vehiclesModelPage.waitUntilLoaderScreenDisappear();
        vehiclesModelPage.navigateToModule("Fleet", "Vehicles Model");
        // vehiclesModelPage.vehiclesModelButton.click();
    }

    @Then("the following column should be displayed:")
    public void theFollowingColumnShouldBeDisplayed(List<String> expectedColumns) {
        WebElement vehiclesModelWebTable = vehiclesModelPage.vehiclesModelWebTable;

        System.out.println(vehiclesModelWebTable);

//        List<WebElement> actualColumns = vehiclesModelWebTable.findElements(By.tagName("th"));
//
//        // Extract text from the column headers
//        List<String> actualColumnNames = actualColumns.stream()
//                .map(WebElement::getText)
//                .collect(Collectors.toList());
//
//        // Verify the expected columns are displayed
//        Assert.assertEquals("Column names do not match!", expectedColumns, actualColumnNames);
    }

}

package com.vytrack.step_definitions;


import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US07_VehiclesCheckboxes_StepDefinitions {
    // Create the object of page in the class level
    LoginPage loginPage = new LoginPage();
    Actions actions = new Actions(Driver.getDriver());
    VehiclesPage vehiclesPage = new VehiclesPage();

    @When("user logged in with username as {string} and password as {string}")
    public void user_logged_in_with_username_as_and_password_as(String username, String password) {
        BrowserUtils.sleep(1);
        loginPage.login(username, password);

    }


    @When("user hover the Fleet icon on base page")
    public void userHoverTheFleetIconOnBasePage() {

        BrowserUtils.sleep(2);
        actions.moveToElement(vehiclesPage.fleetIcon).perform();
        //actions.moveToElement(basePage.fleetIcon).perform();
        BrowserUtils.sleep(2);
    }


    @When("user can see Vehicles icon and click on it")
    public void user_can_see_vehicles_icon_and_click_on_it() {

        vehiclesPage.navigateToModule("Fleet", "Vehicles");

    }

    @When("user launch on the Vehicles page")
    public void user_launch_on_the_vehicles_page() {
        String expectedTitle = "All - Car - Entities - System - Car - Entities - System";
       // String actualTitle = Driver.getDriver().getTitle();

        BrowserUtils.sleep(10);
        BrowserUtils.verifyTitleContains("All - Car - Entities");
    }

    @When("user can see all the checkboxes")
    public void the_user_can_see_all_the_checkboxes() {

        int expectedCheckBoxes=25;
        int actualCheckBoxes =0;

        for (WebElement eachCheckBox : vehiclesPage.allCheckBoxesInBody) {
            if (eachCheckBox.isDisplayed()){
                actualCheckBoxes++;
            }
        }
        System.out.println("checkBoxes = " + actualCheckBoxes);
        Assert.assertEquals(expectedCheckBoxes, actualCheckBoxes);
    }

    @Then("Verify that  all the checkboxes as unchecked")
    public void verify_that_all_the_checkboxes_as_unchecked() {


        for (WebElement eachCheckBox : vehiclesPage.allCheckBoxesInBody) {
           //Assert that the eachCheckbox is not selected(1st arg.String)
            Assert.assertFalse("Checkbox is selected:"+eachCheckBox,eachCheckBox.isSelected());
        }
        
    }


    @And("user can see first checkboxes")
    public void userCanSeeFirstCheckboxes() {
        Assert.assertTrue(vehiclesPage.firstCheckBoxInThead.isDisplayed());
    }

    @Then("Verify that users can check the first checkbox to select all the cars")
    public void verifyThatUsersCanCheckTheFirstCheckboxToSelectAllTheCars() {
        vehiclesPage.firstCheckBoxInThead.click();

       if (vehiclesPage.firstCheckBoxInThead.isSelected()){
            for (WebElement eachCheckBox : vehiclesPage.allCheckBoxesInBody) {
              Assert.assertTrue(eachCheckBox.isSelected());
            }

        }else{
           System.out.println("First checkbox is not selected ");
       }
    }



    @And("user can select any car_checkbox")
    public void userCanSelectAnyCar_checkbox() {
    }

    @Then("Verify that users can select any car")
    public void verifyThatUsersCanSelectAnyCar() {

    }



}

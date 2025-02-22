package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US01_MainModules_StepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is logged in as driver")
    public void the_user_is_logged_in_as() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("driver_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        loginPage.submit.click();

    }


    @Then("user should see four modules in the select bar")
    public void user_should_see_four_modules_in_the_select_bar() {


    }

}

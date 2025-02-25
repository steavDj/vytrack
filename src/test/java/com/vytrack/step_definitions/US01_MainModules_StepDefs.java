package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.pages.MainModulesPage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class US01_MainModules_StepDefs {

    MainModulesPage mainModulesPage = new MainModulesPage();
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
//        mainModulesPage.mainModules.get(1).click();
//        String actualOption = mainModulesPage.mainModules.get(1).getText().trim();
//        String expectedOption = "Customers";
//
//        Assert.assertEquals(expectedOption, actualOption);

        List<String> expectedOptions = Arrays.asList("Fleet", "Customers", "Activities", "System");

        for(int i = 0; i < mainModulesPage.mainModules.size(); i++){

            WebElement option = mainModulesPage.mainModules.get(i);
            option.click();

            String expectedOption = expectedOptions.get(i);
            String actualOption = option.getText().trim();

            Assert.assertEquals(expectedOption, actualOption);

        }
    }

}

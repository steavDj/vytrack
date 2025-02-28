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


public class US01_MainModules_StepDefs {

    MainModulesPage mainModulesPage = new MainModulesPage();
    LoginPage loginPage = new LoginPage();

    // Driver test

    @Given("the user is logged in as driver")
    public void the_user_is_logged_in_as_driver() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("driver_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("driver_password"));
        loginPage.submit.click();

    }

    @Then("user should see four modules in the select bar")
    public void user_should_see_four_modules_in_the_select_bar() {



        List<String> expectedOptions = Arrays.asList("Fleet", "Customers", "Activities", "System");

        for (int i = 0; i < mainModulesPage.mainModules.size(); i++) {

            WebElement option = mainModulesPage.mainModules.get(i);
            option.click();

            String expectedOption = expectedOptions.get(i);
            String actualOption = option.getText().trim();

            Assert.assertEquals(expectedOption, actualOption);

        }
    }

    // Sales Manager test

    @Given("the user is logged in as sales manager")
    public void the_user_is_logged_in_as_sales_manager() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        loginPage.submit.click();
    }

    @Then("user should see eight modules in the select bar")
    public void user_should_see_eight_modules_in_the_select_bar() {

        List<String> expectedSalesManagerOptions = Arrays.asList
                ("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments",
                        "System");

        for (int i = 0; i < mainModulesPage.mainModules.size(); i++) {

            WebElement SalesManagerOption = mainModulesPage.mainModules.get(i);
            SalesManagerOption.click();

            String expectedSalesManagerOption = expectedSalesManagerOptions.get(i);
            String actualSalesManagerOption = SalesManagerOption.getText().trim();

            Assert.assertEquals(expectedSalesManagerOption, actualSalesManagerOption);

        }


    }

    @Given("the user is logged in as store manager")
    public void the_user_is_logged_in_as_store_manager() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("store_manager_password"));
        loginPage.submit.click();

    }

    @Then("user logged in as store manager should see eight modules in the select bar")
    public void user_logged_in_as_store_manager_should_see_eight_modules_in_the_select_bar() {

        List<String> expectedStoreManagerOptions = Arrays.asList
                ("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments",
                "System");

        for(int i =0; i < mainModulesPage.mainModules.size(); i++){

            WebElement StoreManagerOption = mainModulesPage.mainModules.get(i);
            StoreManagerOption.click();

            String expectedStoreManagerOption = expectedStoreManagerOptions.get(i);
            String actualStoreManagerOption = StoreManagerOption.getText().trim();

            Assert.assertEquals(expectedStoreManagerOption, actualStoreManagerOption);
        }

    }

}

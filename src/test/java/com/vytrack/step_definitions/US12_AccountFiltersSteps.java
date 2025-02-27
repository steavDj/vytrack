package com.vytrack.step_definitions;

import com.vytrack.pages.AccountPage_IT;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class US12_AccountFiltersSteps {

    AccountPage_IT accountPageIt = new AccountPage_IT();

    @When("user hovers over to the Customers")
    public void user_hovers_over_to_the_customers() {
        BrowserUtils.sleep(2);
        BrowserUtils.hover(accountPageIt.hoverOverToCustomer);
    }

    @When("user clicks on the Accounts")
    public void user_clicks_on_the_accounts() {
        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(accountPageIt.account).click().perform();
        BrowserUtils.sleep(7);
    }

    @Then("user should see below options on the Account page")
    public void user_should_see_below_options_on_the_account_page(io.cucumber.datatable.DataTable dataTable) {

        List<String> expectedOptions = dataTable.asList(String.class);

        List<String> actualOptions = new ArrayList<>();
        for (WebElement option : accountPageIt.filterOptions) {
            actualOptions.add(option.getText().trim());
        }

        // Print to debug if needed
        System.out.println("Actual options: " + actualOptions);

        // Assertion to verify expected vs. actual
        Assert.assertEquals("Filter options do not match!", expectedOptions, actualOptions);
    }

}







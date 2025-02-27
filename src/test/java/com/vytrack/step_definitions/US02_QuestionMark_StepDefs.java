package com.vytrack.step_definitions;

import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US02_QuestionMark_StepDefs {

  LoginPage loginPage=new LoginPage();

    @When("User click the question mark icon")
    public void user_click_the_question_mark_icon() {

        loginPage.questionMark.click();
        BrowserUtils.switchToWindow("Welcome to Oro Documentation");

    }

    @Then("Verify User access to the Oronic Documentation page")
    public void verifyUserAccessToTheOronicDocumentationPage() {

        BrowserUtils.sleep(2);

//     BrowserUtils.verifyURLContains("oroinc");

    }
}

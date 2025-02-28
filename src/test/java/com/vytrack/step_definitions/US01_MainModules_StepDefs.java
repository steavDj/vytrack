package com.vytrack.step_definitions;

import com.vytrack.pages.MainModulesPage;

import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


public class US01_MainModules_StepDefs {

    MainModulesPage mainModulesPage = new MainModulesPage();

    @Then("the User should see the following main modules:")
    public void theUserShouldSeeTheFollowingMainModules(List<String> expectedModules) {

         mainModulesPage.waitUntilLoaderScreenDisappear();

        List<String> actualMainModules = new ArrayList<>();

        for (int i = 0; i < mainModulesPage.mainModules.size(); i++) {
            actualMainModules.add(mainModulesPage.mainModules.get(i).getText());
        }

        // Testing Purpose, printing expected and actual main modules
//        System.out.println("expectedModules = " + expectedModules);
//        System.out.println("actualMainModules = " + actualMainModules);

        Assert.assertEquals("Main Module Verification FAILED", expectedModules, actualMainModules);

    }

}

package com.vytrack.step_definitions;

import com.vytrack.pages.PinbarPage;
import com.vytrack.utilities.BrowserUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class US03_Pinbar_StepDefinitions {

    PinbarPage pinbarPage = new PinbarPage();

    @When("user click the Learn how to use this space link on the homepage")
    public void userClickTheLearnHowToUseThisSpaceLinkOnTheHomepage() throws InterruptedException {
        pinbarPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        pinbarPage.learnPinbar.click();
    }

    @Then("user sees {string} as a main header")
    public void userSeesAsAMainHeader(String expectedText) {
        Assert.assertEquals(expectedText, pinbarPage.howToUsePinBarHeader.getText());

    }

    @Then("user sees {string}")
    public void userSees(String expectedText) {
        Assert.assertEquals(expectedText, pinbarPage.usePinIconHeader.getText());
    }

    @Then("user sees an image on the page")
    public void userSeesAnImageOnThePage() {
        String expectedImageSource = "/bundles/oronavigation/images/pinbar-location.jpg";
        Assert.assertTrue(pinbarPage.pinbarImage.getAttribute("src").contains(expectedImageSource));
        Assert.assertTrue("Image is Not Visible", pinbarPage.pinbarImage.isDisplayed());
    }

}

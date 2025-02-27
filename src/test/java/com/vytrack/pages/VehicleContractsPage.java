package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VehicleContractsPage extends BasePage {

    private final By errorMessageLocator = By.xpath("//div[contains(@class, 'alert') and contains(@class, 'alert-error')]//div[@class='message']");


    public String getPageTitle() {
        return Driver.getDriver().getTitle();
    }

    public String getPageUrl() {
        return Driver.getDriver().getCurrentUrl();
    }

    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        WebElement errorMessageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//div[contains(@class, 'alert') and contains(@class, 'alert-error')]//div[@class='message' and text()='You do not have permission to perform this action.']")));
        return errorMessageElement.getText();
    }


}

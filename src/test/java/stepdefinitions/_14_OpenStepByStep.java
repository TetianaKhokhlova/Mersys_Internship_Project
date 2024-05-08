package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.html.HTMLInputElement;
import pages.US_003;
import pages.US_014;
import utilities.DriverClass;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static utilities.DriverClass.getDriver;

public class _14_OpenStepByStep {
    US_014 step =  new US_014();
    WebDriver driver = DriverClass.getDriver();

    @When("the student clicks on the {string} link")
    public void the_student_clicks_on_the_link(String string) throws AWTException {
        step.clickJSExecutor(step.profileSettingClick);
        step.waitTime(1);
        step.clickJSExecutor(step.SettingClick);
        step.waitTime(1);
        step.clickJSExecutor(step.imageClick);
        step.waitTime(1);
        WebElement fileInput = driver.findElement(By.cssSelector("input[type='file']"));
        step.waitTime(2);
        fileInput.sendKeys("C:\\Users\\Azizakhon\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-04-27 115738.png");
//        fileInput.sendKeys("C:\\Users\\Azizakhon\\OneDrive\\Pictures\\Screenshots\\Screenshot 2024-05-01 162640.png");
        step.clickJSExecutor(step.downloadImageClick);
        step.waitTime(2);
        step.clickJSExecutor(step.safeImageClick);
    }

    @Then("the profile settings page should be displayed")
    public void the_profile_settings_page_should_be_displayed() {
        getDriver().navigate().refresh();
        step.clickJSExecutor(step.profileSettingClick);
        step.waitTime(1);
        step.clickJSExecutor(step.singOutClick);

    }
}




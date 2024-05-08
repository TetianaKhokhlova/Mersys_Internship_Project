package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.DriverClass;
import utilities.CommonMethods;

public class _02_NavigationToHomepageStepDefinition {
    private final CommonMethods commonMethods = new CommonMethods();

    @Given("the user is logged into the system as a student")
    public void theUserIsLoggedIntoTheSystemAsAStudent() {
        DriverClass.getDriver().get("https://test.mersys.io/user-courses");
        WebElement username = DriverClass.getDriver().findElement(By.id("mat-input-0"));
        WebElement password = DriverClass.getDriver().findElement(By.id("mat-input-1"));
        WebElement loginButton = DriverClass.getDriver().findElement(By.xpath("//span[@class='mdc-button__label']"));

        username.sendKeys("Student_10");
        password.sendKeys("S12345");
        commonMethods.clickMethod(loginButton);
    }

    @Given("the user sees the company logo at the top left")
    public void theUserSeesTheCompanyLogoAtTheTopLeft() {
        WebElement logo = DriverClass.getDriver().findElement(By.xpath("//div[@fxlayout='row']//div[@class='ng-star-inserted']//img"));
        commonMethods.waitUntilVisible(logo);
        assert logo.isDisplayed();
    }

    @When("the user clicks on the company logo")
    public void theUserClicksOnTheCompanyLogo() {
        WebElement logo = DriverClass.getDriver().findElement(By.xpath("//div[@fxlayout='row']//div[@class='ng-star-inserted']//img"));
        commonMethods.clickMethod(logo);
    }

    @Then("the user should be directed to {string}")
    public void theUserShouldBeDirectedTo(String url) {
        assert DriverClass.getDriver().getCurrentUrl().equals(url);
    }

}

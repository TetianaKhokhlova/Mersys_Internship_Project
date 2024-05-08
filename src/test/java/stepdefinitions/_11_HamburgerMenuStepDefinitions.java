package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import pages._11_HamburgerMenuPage;
import utilities.DriverClass;

import javax.swing.*;

public class _11_HamburgerMenuStepDefinitions {

        _11_HamburgerMenuPage hamburgerMenuPage = new _11_HamburgerMenuPage();
        @Given("the student is logged in")
        public void studentIsLoggedIn() {
//            DriverClass.getDriver().get("https://test.mersys.io/");
//            hamburgerMenuPage.waitTime(2);
        }

        @Given("navigate To the Payment Page")
         public void navigate_to_the_payment_page(){
                hamburgerMenuPage.clickElement(hamburgerMenuPage.clickBurgerMenu);
                hamburgerMenuPage.waitTime(2);
                hamburgerMenuPage.clickElement(hamburgerMenuPage.clickFinance);
                hamburgerMenuPage.waitTime(2);
                hamburgerMenuPage.clickElement(hamburgerMenuPage.clickMyFinance);
                hamburgerMenuPage.waitTime(2);
                hamburgerMenuPage.clickElement(hamburgerMenuPage.clickStudent_10);
                hamburgerMenuPage.waitTime(2);
         }
        @When("the student selects Stripe as the payment method")
        public void selectStripePaymentMethod() {
            Actions actions = new Actions(DriverClass.getDriver());
            hamburgerMenuPage.waitTime(2);
            actions.click(hamburgerMenuPage.selectStripeButton).perform();
//          hamburgerMenuPage.clickElement(hamburgerMenuPage.selectStripeButton);
            hamburgerMenuPage.waitTime(2);
            hamburgerMenuPage.screenShot(DriverClass.getDriver());
            hamburgerMenuPage.waitTime(2);
        }

        @When("enters the payment amount")
        public void enterPaymentAmount() {
            //after fixed bug
            DriverClass.getDriver().close();
        }

        @When("makes the payment")
        public void makePayment() {
            //after fixed bug
        }

        @Then("the remaining debt decreases by the payment amount")
        public void verifyRemainingDebtDecrease() {
            //after fixed bug
        }

        @Then("the debt amount is updated correctly after the payment")
        public void verifyDebtAmountUpdated() {
            //after fixed bug
        }

        @Then("the student receives a success message confirming the payment")
        public void verifySuccessMessage() {
            //after fixed bug
        }

    }


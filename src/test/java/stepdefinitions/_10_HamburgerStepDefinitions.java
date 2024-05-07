package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages._010_HamburgerMenuPage;

public class _10_HamburgerStepDefinitions {


    _010_HamburgerMenuPage page = new _010_HamburgerMenuPage();

    @Given("that i navigates to the payment page through Hamburger Menu")
    public void thatINavigatesToThePaymentPageThroughHamburgerMenu() {
       page.clickElement(page.HamburgerMenu);
    }

    @Then("i click Finance")
    public void iClickFinance() {
        page.clickElement(page.Finance);
    }

    @Then("i click  My Finance")
    public void iClickMyFinance() {
        page.clickElement(page.MyFinance);
    }

    @Then("i click veiw icon to open payment method")
    public void iClickVeiwIconToOpenPaymentMethod() {
        page.clickElement(page.SelectsViewIcon);
    }

    @And("i selects Stripe as the payment method")
    public void iSelectsStripeAsThePaymentMethod() {
        page.clickElement(page.SelectsStripeAsThePaymentMethod);
    }

    @And("i enters ${int} as the payment amount")
    public void iEnters$AsThePaymentAmount(int arg0) {

    }

    @And("i completes the payment process")
    public void iCompletesThePaymentProcess() {
    }

    @Then("the payment amount should be correctly determined as ${int}")
    public void thePaymentAmountShouldBeCorrectlyDeterminedAs$(int arg0) {
    }

    @And("i  should receive a payment confirmation")
    public void iShouldReceiveAPaymentConfirmation() {
    }

    @Then("my  debt status should be updated")
    public void myDebtStatusShouldBeUpdated() {
    }
}

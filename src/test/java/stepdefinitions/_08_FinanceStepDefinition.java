package stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages._08_FinancePage;
import utilities.DriverClass;



public class _08_FinanceStepDefinition {

 _08_FinancePage financePage = new _08_FinancePage();

    @Given("I click on the Hamburger Menu")
    public void i_click_on_the_hamburger_menu() {
     financePage.clickElement(financePage.hamburgerMenu);
    }

    @Given("I click on Financepage")
    public void i_click_on_financepage() {
     financePage.clickElement(financePage.financeMenu);
    }

    @Given("I click on My Finance")
    public void i_click_on_my_finance() {
     financePage.clickElement(financePage.myFinanceMenu);
     financePage.waitTime(1);
    }

    @Then("I should verify the homepage")
    public void i_should_verify_the_homepage() {
     String actualUrl = DriverClass.getDriver().getCurrentUrl();
     String expectedUrl = "https://test.mersys.io/student-finance/active";
     Assert.assertTrue(actualUrl.contains(expectedUrl));
        financePage.waitTime(1);
     // close
        DriverClass.quitDriver();
    }

}

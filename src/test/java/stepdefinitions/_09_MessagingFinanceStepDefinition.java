package stepdefinitions;

import io.cucumber.java.en.Then;
import pages._06_MessagingPage;

public class _09_MessagingFinanceStepDefinition {

    _06_MessagingPage page = new _06_MessagingPage();

    @Then("I go to hamburger menu and press Finance link ---> My Finance")
    public void i_go_to_hamburger_menu_and_press_finance_link_my_finance() {
        page.actionClick(page.hamburgerMenu);
        page.waitTime(1);
        page.clickJSExecutor(page.financeLink);
        page.waitTime(1);
        page.clickJSExecutor(page.financeButton);
        page.waitTime(2);
    }

    @Then("I press on a student profile")
    public void i_press_on_a_student_profile() {

        page.actionClick(page.viewFinance);



    }

    @Then("I go to Fee Balance Detail")
    public void i_go_to_fee_balance_detail() {
        page.waitTime(2);
        page.actionClick(page.balanceDetail);

    }

}

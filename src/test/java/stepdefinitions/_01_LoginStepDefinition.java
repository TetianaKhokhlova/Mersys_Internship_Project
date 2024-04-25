package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages._01_LoginPage;
import utilities.DriverClass;

import java.util.List;

public class _01_LoginStepDefinition {

_01_LoginPage page = new _01_LoginPage();

    @Given("I navigate to the Mersys Login page")
    public void i_navigate_to_the_mersys_login_page() {
        DriverClass.getDriver().get("https://test.mersys.io/");
        page.waitTime(1);

    }

    @Given("I enter correct username and password")
    public void i_enter_correct_username_and_password(DataTable dataTable) {
        List<String> listOfData = dataTable.asList();
        page.sendKeys(page.usernameTextBox,listOfData.get(0));
        page.sendKeys(page.passwordTextBox,listOfData.get(1));
        page.waitTime(1);

    }

    @Then("I press Login button")
    public void i_press_login_button() {
    page.clickElement(page.loginButton);

    }

}

package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import pages._04_MessagingPage;
import utilities.CommonMethods;
import utilities.DriverClass;

import java.util.List;


public class _04_MessagingStepDefinition {

    private final _04_MessagingPage page = new _04_MessagingPage();

    @Given("I need to click on the hamburger menu")
       public void i_need_to_click_on_the_hamburger_menu() {
        page.clickElement(page.hamburgerMenu);
           page.waitTime(1);

       }

       @Given("I should be able to click on the Messaging")
        public void i_should_be_able_to_click_on_the_messaging() {
           page.clickElement(page.messagingLink);
           page.waitTime(1);

        }
     @Given("I should be able to click on the New message")
  public void i_should_be_able_to_click_on_the_new_message() {
         page.clickElement(page.newMessageButton);
         page.waitTime(1);

        }
     @Then("I need to click on the hamburger menu2")
   public void i_need_to_click_on_the_hamburger_menu2() {
         page.clickElement(page.hamburgerMenu);
         page.waitTime(1);

        }
     @Then("I should be able to click on the Messaging2")
  public void i_should_be_able_to_click_on_the_messaging2() {
         page.clickElement(page.messagingLink);
         page.waitTime(1);

        }
     @Then("I should be able to click on the inbox button")
  public void i_should_be_able_to_click_on_the_inbox_button() {
         page.clickElement(page.inboxButton);
         page.waitTime(1);

        }
     @Then("I need to click on the hamburger menu3")
  public void i_need_to_click_on_the_hamburger_menu3() {
         page.clickElement(page.hamburgerMenu);
         page.waitTime(1);

        }
      @Then("I should be able to click on the Messaging3")
  public void i_should_be_able_to_click_on_the_messaging3() {
          page.clickElement(page.messagingLink);
          page.waitTime(1);

        }
       @Then("I should be able to click on the outbox button")
  public void i_should_be_able_to_click_on_the_outbox_button() {
           page.clickElement(page.outboxButton);
           page.waitTime(1);

        }
       @Then("I need to click on the hamburger menu4")
  public void i_need_to_click_on_the_hamburger_menu4() {
           page.clickElement(page.hamburgerMenu);
           page.waitTime(1);

        }
      @Then("I should be able to click on the Messaging4")
  public void i_should_be_able_to_click_on_the_messaging4() {
          page.clickElement(page.messagingLink);
          page.waitTime(1);

        }
      @Then("I should be able to click on the trash button")
  public void i_should_be_able_to_click_on_the_trash_button() {
          page.clickElement(page.trashButton);
          page.waitTime(1);

  }
}
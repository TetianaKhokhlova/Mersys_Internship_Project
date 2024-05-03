package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages._06_MessagingPage;

public class _06_MessagingStepDefinition {
    _06_MessagingPage page = new _06_MessagingPage();
    @Then("I press on hamburger menu, choose Messaging and go to Outbox link")
    public void i_press_on_hamburger_menu_choose_messaging_and_go_to_outbox_link() {
        page.waitUntilClickable(page.hamburgerMenu);
        page.clickMethod(page.hamburgerMenu);
        page.clickElement(page.messagingLink);
        page.waitTime(2);
        page.actionClick(page.outBoxLink);
    }

    @Then("I press on garbage box icon to delete message and see the confirmation message of deleting")
    public void i_press_on_garbage_box_icon_to_delete_message_and_see_the_confirmation_message_of_deleting() {
        page.actionClick(page.trashIcon);
        page.clickJSExecutor(page.confirmationOfDeleting);

    }

    @Then("I should see the message about deleting")
    public void iShouldSeeTheMessageAboutDeleting() {
        page.waitUntilVisible(page.messageSuccessfullyDeleted);
        Assert.assertTrue(page.messageSuccessfullyDeleted.isDisplayed());
    }
}


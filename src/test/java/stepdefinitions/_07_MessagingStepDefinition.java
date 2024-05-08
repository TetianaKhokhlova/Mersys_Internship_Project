package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages._06_MessagingPage;

public class _07_MessagingStepDefinition {
    _06_MessagingPage page = new _06_MessagingPage();
    @Then("I press on hamburger menu, choose Messaging and go to Trash link")
    public void i_press_on_hamburger_menu_choose_messaging_and_go_to_trash_link() {

        page.actionClick(page.hamburgerMenu);
        page.clickElement(page.messagingLink);
        page.waitTime(1);
        page.actionClick(page.trashLink);

    }

    @Then("I should see a the trash bin icon and click on it , but don't confirm deleting")
    public void i_should_see_a_the_trash_bin_icon_and_click_on_it_but_don_t_confirm_deleting() {
        page.waitUntilClickable(page.trashBinSecond);
        page.actionClick(page.trashBinSecond);
        page.waitTime(3);
        page.clickMethod(page.cancellationOfDeleting);
    }

    @Then("I should click on  the restore icon to get a deleted message back and receive that the message was successfully taken back")
    public void i_should_click_on_the_restore_icon_to_get_a_deleted_message_back_and_receive_that_the_message_was_successfully_taken_back() {
        page.clickElement(page.restoreItem);
        page.waitUntilVisible(page.restoreMessage);
        Assert.assertTrue(page.restoreMessage.isDisplayed());
    }
}


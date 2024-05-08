package stepdefinitions;

import com.beust.jcommander.IDefaultProvider;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages._05_SendMessagePage;
import utilities.CommonMethods;
import utilities.DriverClass;

import java.sql.Driver;
import java.time.Duration;


public class _05_SendMessageStepDefinition {

    private final _05_SendMessagePage page = new _05_SendMessagePage();

    @Given("I need to click on the Hamburger menu")
    public void i_need_to_click_on_the_hamburger_menu() {
        page.clickElement(page.hamburgerMenu);
        CommonMethods.waitTime(1);
    }
    @Given("I should be able to click on the messaging")
    public void i_should_be_able_to_click_on_the_messaging() {
        page.clickElement(page.messagingLink);
        CommonMethods.waitTime(1);
    }
    @Given("I should be able to click on the new message")
    public void i_should_be_able_to_click_on_the_new_message() {
        page.clickElement(page.newMessageButton);
        CommonMethods.waitTime(1);
    }
    @Then("I need to click on Add Receiver icon")
    public void i_need_to_click_on_add_receiver_icon() {
        page.clickElement(page.receiverIcon);
        CommonMethods.waitTime(1);
    }
    @Then("I need to write user name {string}")
    public void i_need_to_write_user_name(String name) {
        page.sendKeys(page.studentNameTextBox,name);
        CommonMethods.waitTime(1);

    }
    @Then("I should be able to choose two student")
    public void i_should_be_able_to_choose_two_student() {
        CommonMethods.waitTime(2);
        page.clickElement(page.chooseStudent);

    }

    @Then("I choose another student")
    public void iChooseAnotherStudent() {
        CommonMethods.waitTime(2);
       page.clickElement(page.chooseStudent2);
    }
    @Then("I need to click on Add button")
    public void i_need_to_click_on_add_button() {
        CommonMethods.waitTime(1);
        page.clickElement(page.addButton);

    }
    @And("I should delete word {string}")
   public void iShouldDeleteWord(String name) {
        CommonMethods.waitTime(1);
        String currentText = page.studentNameTextBox.getText();
        String modifiedText = currentText.replace(name, "");
        page.studentNameTextBox.clear();
        page.studentNameTextBox.sendKeys(modifiedText);
        Assert.assertFalse(page.studentNameTextBox.getText().contains(name),
                "The word '" + name + "' was not deleted.");
   }

   @Then("I should be able to write user name {string}")
    public void i_should_be_able_to_write_user_name(String name) {
        page.sendKeys(page.teacherNameTextBox,name);
        CommonMethods.waitTime(1);
    }
    @Then("I should be able to choose one teacher")
    public void i_should_be_able_to_choose_one_teacher() {
        CommonMethods.waitTime(2);
        page.clickElement(page.chooseTeacher);

    }
    @Then("I need to click on Add & Close button")
    public void i_need_to_click_on_add_close_button() {
        CommonMethods.waitTime(1);
        page.clickElement(page.addCloseButton);
    }
    @Then("I need to write a subject {string}")
    public void i_need_to_write_a_subject(String subject) {
        page.sendKeys(page.subjectTextBox,subject);
        CommonMethods.waitTime(1);
    }

    @Then("I need write text message {string}")
    public void i_need_write_text_message(String message) {
       DriverClass.getDriver().switchTo().frame(0);
        CommonMethods.waitTime(1);
      page.sendKeys(page.messageTextBox,message);
        DriverClass.getDriver().switchTo().defaultContent();
    }

   @Then("I need to add Attach File")
    public void i_need_to_add_attach_file() {
       CommonMethods.waitTime(1);
       page.clickElement(page.attachFile);

   }

    @Then("I need to choose From local laptop")
    public void i_need_to_choose_from_local_laptop() {
        CommonMethods.waitTime(1);
        page.clickElement(page.fromLocal);
    }
    @Then("I upload a file")
    public void iUploadAFile() {
        CommonMethods.waitTime(1);
        page.uploadFileWithRobot("C:\\Users\\Admin\\Downloads\\selenium-java-4.16.1 (1).zip");
    }

   @Then("I need to choose file")
   public void i_need_to_choose_file() {
        CommonMethods.waitTime(1);
        page.uploadFileWithRobot("MySQLL");

    }
    @Then("I upload a file {string}")
    public void iUploadAFile(String filePath) {
        page.clickFileUploadInput();
        page.uploadFileWithRobot(filePath);
    }

    @Then("I need to click on send button")
    public void i_need_to_click_on_send_button() {
        CommonMethods.waitTime(1);
        page.clickElement(page.sendButton);

    }
    @Then("Navigate to click on the messaging")
    public void navigate_to_click_on_the_messaging() {
        CommonMethods.waitTime(2);
        page.clickElement(page.messaging);

    }
    @Then("I need to click on Outbox button")
    public void i_need_to_click_on_outbox_button() {
        CommonMethods.waitTime(1);
        page.clickElement(page.outboxButton);
    }



}

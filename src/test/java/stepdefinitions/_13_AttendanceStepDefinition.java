package stepdefinitions;

import io.cucumber.java.en.*;
import pages._13_AttendancePage;


public class _13_AttendanceStepDefinition {

    _13_AttendancePage attendancePage = new _13_AttendancePage();

    @Given("I click on Attendance menu")
    public void i_click_on_attendance_menu() {
       attendancePage.waitTime(3);
        attendancePage.clickMethod(attendancePage.attendanceMenu);
    }

    @Given("I click on Attendance excuse page")
    public void i_click_on_attendance_excuse_page() {
        attendancePage.waitTime(3);
        attendancePage.clickJSExecutor(attendancePage.attendanceExcusesPage);
    }

    @Given("I click on add Attendance excuse button")
    public void i_click_on_add_attendance_excuse_button() {
        attendancePage.clickElement(attendancePage.addAttendanceExcuseBtn);
    }

    @Given("I enter my excuse message in the message textbox")
    public void i_enter_my_excuse_message_in_the_message_textbox() {
        attendancePage.waitTime(3);
        attendancePage.sendKeys(attendancePage.attendanceExcuseTextBox, "I can not join today");
    }

    @Given("I click on Attach Files button")
    public void i_click_on_attach_files_button() {
        attendancePage.clickElement(attendancePage.attachAttendanceExcuseFileBtn);
    }

    @Given("I click on From My Files button")
    public void i_click_on_from_my_files_button() {
        attendancePage.clickElement(attendancePage.addAttendanceExcuseFromMyFilesBtn);
    }

    @Given("I click on a File")
    public void i_click_on_a_file() {
        attendancePage.waitTime(3);
        attendancePage.clickElement(attendancePage.addAttendanceExcuseFileCheckBox);
    }

    @Given("I click on Select button")
    public void i_click_on_select_button() {
       attendancePage.clickElement(attendancePage.selectAddFileBtn);
    }

    @Given("I click on Send button")
    public void i_click_on_send_button() {
       attendancePage.clickElement(attendancePage.sendAttendanceExcuseBtn);
    }

    @Then("I should verify the popup message")
    public void i_should_verify_the_popup_message() {
        attendancePage.isWebElementDisplayed(attendancePage.successfullySendAttendanceExcuseMessage);
    }



}

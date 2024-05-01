package stepdefinitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import pages.US_003;

import static utilities.DriverClass.getDriver;

public class _03_OpenStepByStep {
    US_003 step =  new US_003();
    @Then("I should see the following main menu items at the top of the home page:")
    public void i_should_see_the_following_main_menu_items_at_the_top_of_the_home_page(DataTable dataTable) {
         step.clickJSExecutor(step.CoursesClick);
         step.waitTime(1);
         step.clickJSExecutor(step.CalendarClick);
         step.waitTime(1);
        step.clickJSExecutor(step.MessageYearClick);
        step.waitTime(1);
        step.clickJSExecutor(step.weeklyCoursePlanClick);
        step.waitTime(1);
        step.clickJSExecutor(step.AttendanceClick);
        step.waitTime(1);
        step.clickJSExecutor(step.academicYearClick);
        step.waitTime(1);
        step.clickJSExecutor(step.weeklyClick);
        step.waitTime(1);
        step.clickJSExecutor(step.attendanceExcusesClick);
        step.waitTime(1);
        step.clickJSExecutor(step.AssignmentsClick);
        step.waitTime(1);
        step.clickJSExecutor(step.GradingClick);
        step.waitTime(1);
        step.clickJSExecutor(step.courseGradeClick);
        step.waitTime(1);
        step.clickJSExecutor(step.studentTranscriptClick);
        step.waitTime(1);
        step.clickJSExecutor(step.transcriptBySubjectClick);
        step.waitTime(1);
        step.clickJSExecutor(step.HamburgerMenuClick);
    }
    @Then("I should see the following Message items:")
    public void i_should_see_the_following_message_items(io.cucumber.datatable.DataTable dataTable) {
         step.clickJSExecutor(step.NewMessageClick);
        step.waitTime(1);
        step.clickJSExecutor(step.messagingClick);
        step.waitTime(1);
        step.clickJSExecutor(step.HamburgerMenuClick);
        step.waitTime(1);
        step.clickJSExecutor(step.NewMessageClick);
        step.waitTime(1);
        step.clickJSExecutor(step.inboxClick);
        step.waitTime(1);
        step.clickJSExecutor(step.HamburgerMenuClick);
        step.waitTime(1);
        step.clickJSExecutor(step.NewMessageClick);
        step.waitTime(1);
        step.clickJSExecutor(step.outboxClick);
        step.waitTime(1);
        step.clickJSExecutor(step.HamburgerMenuClick);
        step.waitTime(1);
        step.clickJSExecutor(step.NewMessageClick);
        step.waitTime(3);
        step.clickJSExecutor(step.trashClick);
        getDriver().navigate().refresh();
        step.waitTime(1);
        step.clickJSExecutor(step.HamburgerMenuClick);
        step.waitTime(1);
        step.clickJSExecutor(step.financeClick);
        step.waitTime(5);
        step.clickJSExecutor(step.myFinanceClick);
        step.waitTime(5);
        step.clickJSExecutor(step.HamburgerMenuClick);
        step.waitTime(1);
        step.clickJSExecutor(step.educationClick);
        step.waitTime(1);
        step.clickJSExecutor(step.attendanceClick);
        step.waitTime(1);
        step.clickJSExecutor(step.attendanceExcusesParentsClick);
        step.waitTime(1);
        step.clickJSExecutor(step.HamburgerMenuClick);
        step.waitTime(1);
        step.clickJSExecutor(step.videoConferenceClick);
        step.waitTime(2);
        step.clickJSExecutor(step.videoMeetingClick);
        step.waitTime(2);
        step.clickJSExecutor(step.HamburgerMenuClick);
        step.waitTime(1);
        step.clickJSExecutor(step.surveysClick);
        step.waitTime(1);
        step.clickJSExecutor(step.mySurveysClick);
   }
    @Then("I should see the following File in the dropdown menu:")
    public void i_should_see_the_following_file_in_the_dropdown_menu(io.cucumber.datatable.DataTable dataTable) {
        step.clickJSExecutor(step.chatClick);
        step.waitTime(1);
        step.clickJSExecutor(step.closeChatClick);
        step.waitTime(1);
        step.clickJSExecutor(step.newMessageIconClick);
        step.waitTime(1);
        step.clickJSExecutor(step.closeMessageClick);
        step.waitTime(1);
        step.clickJSExecutor(step.profileSettingClick);
        step.waitTime(1);
        step.clickJSExecutor(step.myCertificatesClick);
        getDriver().navigate().refresh();
        step.waitTime(1);
        step.clickJSExecutor(step.profileSettingClick);
        step.waitTime(2);
        step.clickJSExecutor(step.myProfileClick);
        step.waitTime(3);
        step.clickJSExecutor(step.closeMyProfileClick);
        step.waitTime(1);
        getDriver().navigate().refresh();
        step.clickJSExecutor(step.profileSettingClick);
        step.waitTime(1);
        step.clickJSExecutor(step.changePasswordClick);
        step.waitTime(1);
        step.clickJSExecutor(step.closeChangePasswordClick);
        step.waitTime(1);
        getDriver().navigate().refresh();
        step.clickJSExecutor(step.profileSettingClick);
        step.waitTime(1);
        step.clickJSExecutor(step.SettingClick);
        step.waitTime(1);
        step.clickJSExecutor(step.closeSettingClick);
    }
    @Then("I should see Sign Out")
    public void i_should_see_sign_out() {
        getDriver().navigate().refresh();
        step.clickJSExecutor(step.profileSettingClick);
        step.waitTime(1);
        step.clickJSExecutor(step.singOutClick);
    }
}

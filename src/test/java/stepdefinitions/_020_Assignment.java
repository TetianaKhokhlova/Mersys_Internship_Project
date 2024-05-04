package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US_020;

public class _020_Assignment {
    US_020 step = new US_020();
    @Then("I am logged in as a student on the homework list page")
    public void i_am_logged_in_as_a_student_on_the_homework_list_page() {
    step.clickJSExecutor(step.AssignmentsClick);
    step.clickJSExecutor(step.chooseCourseClick);
    step.clickJSExecutor(step.selectAll);
    step.clickJSExecutor(step.selectStatusPublished);
    step.clickJSExecutor(step.publishedClick);
    step.clickJSExecutor(step.publishedClick);
    step.clickJSExecutor(step.selectSemesterClick);
    step.clickJSExecutor(step.allSelectSemesterClick);
//    step.clickJSExecutor(step.dueDate);
//    step.waitTime(1);
//    step.clickJSExecutor(step.thisYearClick);
//    step.waitTime(1);
//    step.clickJSExecutor(step.searchButtonClick);
//    step.waitTime(1);

    }
    @When("I click on a homework item area outside of its icons")
    public void i_click_on_a_homework_item_area_outside_of_its_icons() {
        step.clickJSExecutor(step.StatisticsOne);
        step.waitTime(3);
        step.clickJSExecutor(step.goBackAStatisticsOne);
        step.waitTime(1);
        step.clickJSExecutor(step.starAStatisticsOne);
        step.waitTime(3);
        step.clickJSExecutor(step.starAStatisticsOne);
        step.waitTime(1);
        step.clickJSExecutor(step.AGeometry);
        step.waitTime(2);
        step.clickJSExecutor(step.discussionAGeometry);
        step.waitTime(3);
        step.clickJSExecutor(step.contactAGeometryClick);
        step.waitTime(3);
        step.clickJSExecutor(step.closeDiscussionAGeometry);
        step.waitTime(1);
        step.clickJSExecutor(step.goBackAGeometryAGeometry);
        step.waitTime(1);
        step.clickJSExecutor(step.submitAGeometry);
        step.waitTime(4);
        step.clickJSExecutor(step.closeSubmitAGeometry);
        step.waitTime(1);
        step.clickJSExecutor(step.starAGeometryClick);
        step.waitTime(4);
        step.clickJSExecutor(step.starAGeometryClick);
        step.waitTime(4);
        step.clickJSExecutor(step.aStatisticsTwo);
        step.waitTime(1);
        step.clickJSExecutor(step.discussionStatisticsTwos);
        step.waitTime(1);
        step.clickJSExecutor(step.contactDiscussionStatisticsTwo);
        step.waitTime(1);
        step.clickJSExecutor(step.closeDiscussionStatisticsTwo);
        step.waitTime(1);
        step.clickJSExecutor(step.goBackStatisticsTwo);
        step.waitTime(1);
        step.clickJSExecutor(step.submitAStatisticsTwo);
        step.waitTime(4);
        step.clickJSExecutor(step.closeSubmitAStatisticsTwo);
        step.waitTime(1);
        step.clickJSExecutor(step.onstarAStatisticsTwo);
        step.waitTime(2);
        step.clickJSExecutor(step.offStarSubmitAStatisticsTwo);
        step.waitTime(1);
        step.clickJSExecutor(step.MathematicsClick);
        step.waitTime(4);
        step.clickJSExecutor(step.discussionMathematicsClick);
        step.waitTime(1);
        step.clickJSExecutor(step.contactMathematicsClick);
        step.waitTime(2);
        step.clickJSExecutor(step.closeContactMathematicsClick);
        step.waitTime(1);
        step.clickJSExecutor(step.goBackMathematicsClick);
        step.waitTime(1);
        step.clickJSExecutor(step.submitMathematicsClick);
        step.waitTime(4);
        step.clickJSExecutor(step.closeSubmitMathematicsClick);
        step.waitTime(1);
        step.scrollToElement(step.onStarSubmitMathematicsClick);
        step.clickJSExecutor(step.onStarSubmitMathematicsClick);
        step.waitTime(4);
        step.clickJSExecutor(step.onStarSubmitMathematicsClick);
    }
    @Then("I should see the details page and icons for information, submission, favorites, and discussions if available")
    public void i_should_see_the_details_page_and_icons_for_information_submission_favorites_and_discussions_if_available() {
        step.clickJSExecutor(step.MathematicsTwoClick);
        step.waitTime(1);
        step.clickJSExecutor(step.discussingMathematicsTwoClick);
        step.waitTime(1);
        step.clickJSExecutor(step.contactDiscussingMathematicsTwoClick);
        step.waitTime(1);
        step.clickJSExecutor(step.closeDiscussingMathematicsTwoClick);
        step.waitTime(1);
        step.clickJSExecutor(step.goBackDiscussingMathematicsTwoClick);
        step.waitTime(1);
        step.clickJSExecutor(step.submitMathematicsTwoClick);
        step.waitTime(1);
        step.clickJSExecutor(step.closeSubmitMathematicsTwoClick);
        step.waitTime(1);
        step.clickJSExecutor(step.starMathematicsTwoClick);
        step.waitTime(3);
        step.clickJSExecutor(step.starMathematicsTwoClick);
        step.waitTime(1);
        step.clickJSExecutor(step.Spanish);
        step.waitTime(1);
        step.clickJSExecutor(step.discussionSpanish);
        step.waitTime(1);
        step.clickJSExecutor(step.contactDiscussionSpanish);
        step.waitTime(1);
        step.clickJSExecutor(step.closeDiscussionSpanish);
        step.waitTime(1);
        step.clickJSExecutor(step.goBackDiscussionSpanish);
        step.waitTime(1);
        step.clickJSExecutor(step.openSubmitSpanish);
        step.waitTime(1);
        step.clickJSExecutor(step.closeSubmitSpanish);
        step.waitTime(1);
        step.clickJSExecutor(step.openDiscussionSpanish);
        step.waitTime(1);
        step.clickJSExecutor(step.contactFromFrontDiscussionSpanish);
        step.waitTime(1);
        step.clickJSExecutor(step.closeFrontFrontDiscussionSpanish);
        step.waitTime(1);
        step.clickJSExecutor(step.starDiscussionSpanish);
    }


}

package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US_022AssignmentsFeaturePage;

import static utilities.DriverClass.getDriver;

public class US_022_AssignmentsFeatureOpenStepByStep {
    US_022AssignmentsFeaturePage step = new US_022AssignmentsFeaturePage();
    @When("the student clicks the search button")
    public void the_student_clicks_the_search_button() {
        step.clickJSExecutor(step.AssignmentsClick);
        step.clickJSExecutor(step.chooseCourseClick);
        step.clickJSExecutor(step.selectAll);
        step.waitTime(1);
        step.clickJSExecutor(step.chooseCourseClick);
        step.waitTime(2);
        step.clickJSExecutor(step.courseABiology);
        step.waitTime(1);
        step.clickJSExecutor(step.chooseCourseClick);
        step.waitTime(2);
        step.clickJSExecutor(step.courseChemistry);
        step.waitTime(1);
        step.clickJSExecutor(step.chooseCourseClick);
        step.waitTime(2);
        step.clickJSExecutor(step.courseGeometry);
        step.waitTime(1);
        step.clickJSExecutor(step.chooseCourseClick);
        step.waitTime(2);
        step.clickJSExecutor(step.courseDutch);
        step.waitTime(1);
        step.clickJSExecutor(step.chooseCourseClick);
        step.waitTime(2);
        step.clickJSExecutor(step.courseMathematics);
        step.waitTime(1);
        step.clickJSExecutor(step.chooseCourseClick);
        step.waitTime(2);
        step.clickJSExecutor(step.coursePhysical);
        step.waitTime(1);
        step.clickJSExecutor(step.chooseCourseClick);
        step.waitTime(2);
        step.clickJSExecutor(step.courseSpanish);
        step.waitTime(1);
        step.clickJSExecutor(step.chooseCourseClick);
        step.waitTime(2);
        step.clickJSExecutor(step.courseStatistics);
        step.waitTime(1);
        step.clickJSExecutor(step.chooseCourseClick);
        step.waitTime(2);
//
        step.clickJSExecutor(step.selectStatusPublished);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.waitTime(1);
        step.clickJSExecutor(step.resultPublishedClick);

        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.allSelectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.oneSelectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.twoSelectSemesterClick);
        step.waitTime(1);

        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.allSelectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.oneSelectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.twoSelectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.searchButtonClick);

        //   day due
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.todayClick);
        step.waitTime(1);
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.lastSevenDaysClick);
        step.waitTime(2);
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.thisWeekClick);
        step.waitTime(1);
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.thisMonthClick);
        step.waitTime(1);
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.thisYearClick);
        step.waitTime(1);
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.lastWeekClick);
        step.waitTime(1);
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.lastMonthClick);
        step.waitTime(1);
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.lastYearClick);
        step.waitTime(1);

        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.previousBackOneMonthClick);
        step.waitTime(1);
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.previousBackOneYearClick);
        step.waitTime(1);
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.todayDayIsClick);
        step.waitTime(1);
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.nextOneMonthFeatureClick);
        step.waitTime(1);
        step.clickJSExecutor(step.dueDate);
        step.waitTime(2);
        step.clickJSExecutor(step.nextOneYearFeatureClick);
        step.waitTime(1);
        //
        step.clickJSExecutor(step.ShowOnlyMarked);
    }
    @Then("all assigned tasks should be listed")
    public void all_assigned_tasks_should_be_listed() {

        step.clickJSExecutor(step.chooseCourseClick);
        step.clickJSExecutor(step.selectAll);
        step.waitTime(1);
        step.clickJSExecutor(step.chooseCourseClick);
        step.waitTime(2);
        step.clickJSExecutor(step.courseABiology);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.waitTime(1);
        step.clickJSExecutor(step.resultPublishedClick);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.allSelectSemesterClick);
        step.waitTime(1);
//        //--------
        step.clickJSExecutor(step.chooseCourseClick);
        step.clickJSExecutor(step.courseChemistry);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.waitTime(1);
        step.clickJSExecutor(step.resultPublishedClick);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.allSelectSemesterClick);
        step.waitTime(1);
        //--------
        step.clickJSExecutor(step.chooseCourseClick);
        step.clickJSExecutor(step.courseChemistry);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.waitTime(1);
        step.clickJSExecutor(step.resultPublishedClick);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.allSelectSemesterClick);
        step.waitTime(1);
        //--------
        step.clickJSExecutor(step.chooseCourseClick);
        step.clickJSExecutor(step.courseGeometry);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.waitTime(1);
        step.clickJSExecutor(step.resultPublishedClick);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.allSelectSemesterClick);
        step.waitTime(1);
        //--------
        step.clickJSExecutor(step.chooseCourseClick);
        step.clickJSExecutor(step.courseDutch);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.waitTime(1);
        step.clickJSExecutor(step.resultPublishedClick);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.allSelectSemesterClick);
        step.waitTime(1);
        //--------
        step.clickJSExecutor(step.chooseCourseClick);
        step.clickJSExecutor(step.courseMathematics);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.waitTime(1);
        step.clickJSExecutor(step.resultPublishedClick);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.allSelectSemesterClick);
        step.waitTime(1);
//        //--------
        step.clickJSExecutor(step.chooseCourseClick);
        step.clickJSExecutor(step.coursePhysical);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.waitTime(1);
        step.clickJSExecutor(step.resultPublishedClick);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.allSelectSemesterClick);
        step.waitTime(1);
        //--------
        step.clickJSExecutor(step.chooseCourseClick);
        step.clickJSExecutor(step.courseSpanish);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.waitTime(1);
        step.clickJSExecutor(step.resultPublishedClick);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.allSelectSemesterClick);
        step.waitTime(1);
        //--------
        step.clickJSExecutor(step.chooseCourseClick);
        step.clickJSExecutor(step.courseStatistics);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.publishedClick);
        step.waitTime(1);
        step.clickJSExecutor(step.selectStatusPublished);
        step.waitTime(1);
        step.clickJSExecutor(step.resultPublishedClick);
        step.clickJSExecutor(step.selectSemesterClick);
        step.waitTime(1);
        step.clickJSExecutor(step.allSelectSemesterClick);
        step.waitTime(1);
    }
    @When("the student filters by {string} {string} {string} and {string}")
    public void the_student_filters_by_and(String string, String string2, String string3, String string4) {

    }
    @Then("the filtered tasks should be displayed")
    public void the_filtered_tasks_should_be_displayed() {

    }
    @When("the student clicks {string}")
    public void the_student_clicks(String string) {
        //default View
        step.clickJSExecutor(step.defaultView);
        step.waitTime(1);
        step.clickJSExecutor(step.defaultViewClick);
        step.waitTime(1);
        step.clickJSExecutor(step.defaultView);
        step.waitTime(1);
        step.clickJSExecutor(step.showsByCourseDefaultViewClick);
        step.waitTime(1);
        step.clickJSExecutor(step.defaultView);
        step.waitTime(1);
        step.clickJSExecutor(step.showsByTypeDefaultViewClick);
        step.waitTime(1);
        step.clickJSExecutor(step.defaultView);
        step.waitTime(1);
        step.clickJSExecutor(step.showsByDateDefaultViewClick);
        step.waitTime(1);
        step.clickJSExecutor(step.defaultView);
        step.waitTime(1);
        step.clickJSExecutor(step.showsByChartDefaultViewClick);
    }
    @Then("the results should be listed and sorted by {string} {string} {string} or {string}")
    public void the_results_should_be_listed_and_sorted_by_or(String string, String string2, String string3, String string4) {
        getDriver().navigate().refresh();
        step.clickJSExecutor(step.profileSettingClick);
        step.waitTime(1);
        step.clickJSExecutor(step.singOutClick);
    }
}

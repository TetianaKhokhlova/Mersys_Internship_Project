package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class US_003 extends CommonMethods {
    @FindBy(xpath = "//span[@class='mat-badge mat-badge-primary mat-badge-above mat-badge-after mat-badge-small mat-badge-hidden']")
    public WebElement CoursesClick;
    @FindBy(xpath = "//ms-layout-menu-button[@icon='calendar-week']//span[@class='mat-mdc-focus-indicator']")
    public WebElement CalendarClick;
    @FindBy(xpath = "//div[@id='mat-tab-label-0-1']//span[@class='mdc-tab__content']")
    public WebElement MessageYearClick;
    @FindBy(xpath = "//div[@id='mat-tab-label-0-0']//span[@class='mdc-tab__content']")
    public WebElement weeklyCoursePlanClick;
    @FindBy(xpath = "//ms-layout-menu-button[@icon='users-class']//span[@class='mat-mdc-focus-indicator']")
    public WebElement AttendanceClick;
    @FindBy(xpath = "//div[@id='mat-tab-label-1-0']//span[@class='mdc-tab__content']")
    public WebElement academicYearClick;
    @FindBy(xpath = "//div[@id='mat-tab-label-1-0']//span[@class='mdc-tab__content']")
    public WebElement weeklyClick;
    @FindBy(xpath = "//span[contains(text(),'ATTENDANCE EXCUSES')]")
    public WebElement attendanceExcusesClick;
    @FindBy(xpath = "(//span[@class='mat-badge mat-badge-accent mat-badge-above mat-badge-after mat-badge-small'])[1]")
    public WebElement AssignmentsClick;
    @FindBy(xpath = "//ms-layout-menu-button[@icon='analytics']//span[@class='mat-mdc-focus-indicator']")
    public WebElement GradingClick;
    @FindBy(xpath = "//div[@id='mat-tab-label-2-0']//span[@class='mdc-tab__content']")
    public WebElement courseGradeClick;
    @FindBy(xpath = "//span[contains(text(),'Student Transcript')]")
    public WebElement studentTranscriptClick;
    @FindBy(xpath = "//span[contains(text(),'Transcript By Subject')]")
    public WebElement transcriptBySubjectClick;
    @FindBy(xpath = "//div[@class='ng-star-inserted']//div[@fxlayout='row']//span[@class='ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement HamburgerMenuClick;
  //
    @FindBy(xpath = "//span[contains(text(),'Messaging')]")
    public WebElement NewMessageClick;
    @FindBy(xpath = "//span[contains(text(),'New Message')]")
    public WebElement messagingClick;
    @FindBy(xpath = "//span[contains(text(),'Inbox')]")
    public WebElement inboxClick;
    @FindBy(xpath = "//span[contains(text(),'Outbox')]")
    public WebElement outboxClick;
    @FindBy(xpath = "//span[contains(text(),'Trash')]")
    public WebElement trashClick;
    @FindBy(xpath = "//span[contains(text(),'Finance')]")
    public WebElement financeClick;
    @FindBy(xpath = "//span[contains(text(),'My Finance')]")
    public WebElement myFinanceClick;
    @FindBy(xpath = "//span[contains(text(),'Education')]")
    public WebElement educationClick;
    @FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']//span[contains(text(),'Attendance')]")
    public WebElement attendanceClick;
    @FindBy(xpath = "//span[contains(text(),'Attendance Excuses (Parents)')]")
    public WebElement attendanceExcusesParentsClick;
    @FindBy(xpath = "//span[contains(text(),'Video Conference')]")
    public WebElement videoConferenceClick;
    @FindBy(xpath = "//span[contains(text(),'Video Meetings')]")
    public WebElement videoMeetingClick;
    @FindBy(xpath = "(//span[contains(text(),'Surveys')])[1]")
    public WebElement surveysClick;
    @FindBy(xpath = "//span[contains(text(),'My Surveys')]")
    public WebElement mySurveysClick;
    //
    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[7]")
    public WebElement chatClick;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeChatClick;
    @FindBy(xpath = "//button[@class='mat-mdc-tooltip-trigger mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']//span[@class='mat-mdc-focus-indicator']")
    public WebElement newMessageIconClick;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeMessageClick;
    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger user-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement profileSettingClick;
    @FindBy(xpath = "//span[contains(text(),'My Certificates')]")
    public WebElement myCertificatesClick;
    @FindBy(xpath = "//span[contains(text(),'My Files')]")
    public WebElement myProfileClick;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeMyProfileClick;
    @FindBy(xpath = "//span[contains(text(),'Change Password')]")
    public WebElement changePasswordClick;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeChangePasswordClick;
    @FindBy(xpath = "//span[contains(text(),'Settings')]")
    public WebElement SettingClick;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeSettingClick;
    @FindBy(xpath = "//span[contains(text(),'Sign Out')]")
    public WebElement singOutClick;

}


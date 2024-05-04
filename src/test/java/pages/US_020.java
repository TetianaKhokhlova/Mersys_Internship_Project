package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class US_020 extends CommonMethods {
    @FindBy(xpath = "(//span[@class='mat-badge mat-badge-accent mat-badge-above mat-badge-after mat-badge-small'])[1]")
    public WebElement AssignmentsClick;
    @FindBy(xpath = "//div[@id='mat-select-value-1']")
    public WebElement chooseCourseClick;
    @FindBy(xpath = "//span[@class='mdc-list-item__primary-text'][normalize-space()='Show All']")
    public WebElement selectAll;
    @FindBy(xpath = "//div[@id='mat-select-value-3']")
    public WebElement selectStatusPublished;
    @FindBy(xpath = "//mat-option[@id='mat-option-1']")
    public WebElement publishedClick;
    @FindBy(xpath = "//div[@id='mat-select-value-5']")
    public WebElement selectSemesterClick;
    @FindBy(xpath = "//mat-option[@id='mat-option-11']")
    public WebElement allSelectSemesterClick;
    @FindBy(xpath = "//button[@aria-label='Open calendar']//span[@class='mat-mdc-focus-indicator']")
    public WebElement dueDate;
    @FindBy(xpath = "//span[normalize-space()='This year']")
    public WebElement thisYearClick;
    @FindBy(xpath = "//span[contains(text(),'Search')]")
    public WebElement searchButtonClick;
    @FindBy(xpath = "//div[@class='ng-star-inserted']//div[2]//div[1]//div[1]//div[1]//div[2]//span[1]//strong[1]")
    public WebElement StatisticsOne;
    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']//span[@class='mat-mdc-focus-indicator']")
    public WebElement goBackAStatisticsOne;
    @FindBy(xpath = "//div[@class='ng-star-inserted']//div[2]//div[1]//div[1]//div[2]//ms-icon-button[2]//button[1]//span[2]")
    public WebElement starAStatisticsOne;
    @FindBy(xpath = "//strong[normalize-space()='11A- Geometry']")
    public WebElement AGeometry;
    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']//span[@class='mat-mdc-focus-indicator']")
    public WebElement goBackAGeometryAGeometry;
    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[2]//ms-icon-button[2]//button[1]//span[2]")
    public WebElement submitAGeometry;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeSubmitAGeometry;
    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[27]")
    public WebElement starAGeometryClick;
    @FindBy(xpath = "//user-chat-bell[@class='mat-mdc-tooltip-trigger ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement discussionAGeometry;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeDiscussionAGeometry;
    @FindBy(xpath = "//ms-standard-button[@icon='users']//span[@class='mat-mdc-focus-indicator']")
    public WebElement contactAGeometryClick;
    @FindBy(xpath = "//body[1]/app[1]/student-layout[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/ms-assignment-panel-student[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/span[1]/strong[1]")
    public WebElement aStatisticsTwo;
    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']//span[@class='mat-mdc-focus-indicator']")
    public WebElement goBackStatisticsTwo;
    @FindBy(xpath = "//user-chat-bell[@class='mat-mdc-tooltip-trigger ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement discussionStatisticsTwos;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeDiscussionStatisticsTwo;
    @FindBy(xpath = "//ms-standard-button[@icon='users']//span[@class='mat-mdc-focus-indicator']")
    public WebElement contactDiscussionStatisticsTwo;
    @FindBy(xpath = "(//button[@matbadgeoverlap='false'])[8]")
    public WebElement submitAStatisticsTwo;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeSubmitAStatisticsTwo;
    @FindBy(xpath = "(//button[@matbadgeoverlap='false'])[9]")
    public WebElement onstarAStatisticsTwo;
    @FindBy(xpath = "(//button[@matbadgeoverlap='false'])[9]")
    public WebElement offStarSubmitAStatisticsTwo;
    @FindBy(xpath = "(//strong[contains(text(),'11A-Mathematics')])[1]")
    public WebElement MathematicsClick;
    @FindBy(xpath = "//user-chat-bell[@class='mat-mdc-tooltip-trigger ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement discussionMathematicsClick;
    @FindBy(xpath = "//ms-standard-button[@icon='users']//span[@class='mat-mdc-focus-indicator']")
    public WebElement contactMathematicsClick;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeContactMathematicsClick;
    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']//span[@class='mat-mdc-focus-indicator']")
    public WebElement goBackMathematicsClick;
    @FindBy(xpath = "//button[@class='mat-mdc-tooltip-trigger mat-badge mat-accent mdc-icon-button mat-mdc-icon-button mat-badge-accent mat-basic mat-mdc-button-base mat-badge-above mat-badge-after mat-badge-small ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement submitMathematicsClick;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeSubmitMathematicsClick;
    @FindBy(xpath = "//body[1]/app[1]/student-layout[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/ms-assignment-panel-student[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/ms-icon-button[3]/button[1]/span[2]")
    public WebElement onStarSubmitMathematicsClick;
    //
    @FindBy(xpath = "//body[1]/app[1]/student-layout[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/ms-assignment-panel-student[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/span[1]/strong[1]")
    public WebElement MathematicsTwoClick;
    @FindBy(xpath = "//user-chat-bell[@class='mat-mdc-tooltip-trigger ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement discussingMathematicsTwoClick;
    @FindBy(xpath = "//ms-standard-button[@icon='users']//span[@class='mat-mdc-focus-indicator']")
    public WebElement contactDiscussingMathematicsTwoClick;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeDiscussingMathematicsTwoClick;
    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']//span[@class='mat-mdc-focus-indicator']")
    public WebElement goBackDiscussingMathematicsTwoClick;
    @FindBy(xpath = "//body[1]/app[1]/student-layout[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/ms-assignment-panel-student[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/ms-icon-button[2]/button[1]/span[2]")
    public WebElement submitMathematicsTwoClick;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeSubmitMathematicsTwoClick;
    @FindBy(xpath = "//body[1]/app[1]/student-layout[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/ms-assignment-panel-student[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/div[2]/ms-icon-button[3]/button[1]/span[2]")
    public WebElement starMathematicsTwoClick;
    //
    @FindBy(xpath = "//strong[normalize-space()='11A-Spanish']")
    public WebElement Spanish;
    @FindBy(xpath = "//user-chat-bell[@class='mat-mdc-tooltip-trigger ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement discussionSpanish;
    @FindBy(xpath = "//ms-standard-button[@icon='users']//span[@class='mat-mdc-focus-indicator']")
    public WebElement contactDiscussionSpanish;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeDiscussionSpanish;
    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']//span[@class='mat-mdc-focus-indicator']")
    public WebElement goBackDiscussionSpanish;
    @FindBy(xpath = "//body[1]/app[1]/student-layout[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/ms-assignment-panel-student[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/ms-icon-button[2]/button[1]/span[2]")
    public WebElement openSubmitSpanish;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeSubmitSpanish;
    @FindBy(xpath = "//ms-icon-button[@icon='comments-alt']//span[@class='mat-mdc-focus-indicator']")
    public WebElement openDiscussionSpanish;
    @FindBy(xpath = "//ms-standard-button[@icon='users']//span[@class='mat-mdc-focus-indicator']")
    public WebElement contactFromFrontDiscussionSpanish;
    @FindBy(xpath = "//button[@aria-label='Close dialog']//span[@class='mat-mdc-focus-indicator']")
    public WebElement closeFrontFrontDiscussionSpanish;
    @FindBy(xpath = "//body[1]/app[1]/student-layout[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[2]/ms-assignment-panel-student[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/div[2]/ms-icon-button[4]/button[1]/span[2]")
    public WebElement starDiscussionSpanish;

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class US_022AssignmentsFeaturePage extends CommonMethods {
    @FindBy(xpath = "(//span[@class='mat-badge mat-badge-accent mat-badge-above mat-badge-after mat-badge-small'])[1]")
    public WebElement AssignmentsClick;
    @FindBy(xpath = "//div[@id='mat-select-value-1']")
    public WebElement chooseCourseClick;
    @FindBy(xpath = "//span[@class='mdc-list-item__primary-text'][normalize-space()='Show All']")
    public WebElement selectAll;
    @FindBy(xpath = "//mat-option[@id='mat-option-3']")
    public WebElement courseABiology;
    @FindBy(xpath = "//mat-option[@id='mat-option-4']")
    public WebElement courseChemistry;
    @FindBy(xpath = "//mat-option[@id='mat-option-5']")
    public WebElement courseGeometry;
    @FindBy(xpath = "//mat-option[@id='mat-option-6']")
    public WebElement courseDutch;
    @FindBy(xpath = "//mat-option[@id='mat-option-7']")
    public WebElement courseMathematics;
    @FindBy(xpath = "//mat-option[@id='mat-option-8']")
    public WebElement coursePhysical;
    @FindBy(xpath = "//mat-option[@id='mat-option-9']")
    public WebElement courseSpanish;
    @FindBy(xpath = "//mat-option[@id='mat-option-10']")
    public WebElement courseStatistics;
    //Status
    @FindBy(xpath = "//div[@id='mat-select-value-3']")
    public WebElement selectStatusPublished;
    @FindBy(xpath = "//mat-option[@id='mat-option-1']")
    public WebElement publishedClick;
    @FindBy(xpath = "//mat-option[@id='mat-option-2']")
    public WebElement resultPublishedClick;
//Semester
    @FindBy(xpath = "//div[@id='mat-select-value-5']")
    public WebElement selectSemesterClick;
    @FindBy(xpath = "//mat-option[@id='mat-option-11']")
    public WebElement allSelectSemesterClick;
    @FindBy(xpath = "//mat-option[@id='mat-option-12']")
    public WebElement oneSelectSemesterClick;
    @FindBy(xpath = "//mat-option[@id='mat-option-13']")
    public WebElement twoSelectSemesterClick;
    // year
    @FindBy(xpath = "//button[@aria-label='Open calendar']//span[@class='mat-mdc-focus-indicator']")
    public WebElement dueDate;
    @FindBy(xpath = "//span[normalize-space()='Today']")
    public WebElement todayClick;
    @FindBy(xpath = "//span[normalize-space()='Last 7 days']")
    public WebElement lastSevenDaysClick;
    @FindBy(xpath = "//span[normalize-space()='This week']")
    public WebElement thisWeekClick;
    @FindBy(xpath = "//span[normalize-space()='This month']")
    public WebElement thisMonthClick;
    @FindBy(xpath = "//span[normalize-space()='This year']")
    public WebElement thisYearClick;
    @FindBy(xpath = "//span[normalize-space()='Last week']")
    public WebElement lastWeekClick;
    @FindBy(xpath = "//span[normalize-space()='Last month']")
    public WebElement lastMonthClick;
    @FindBy(xpath = "//span[normalize-space()='Last year']")
    public WebElement lastYearClick;


    @FindBy(xpath = "//div[@class='example-header']//button[2]")
    public WebElement previousBackOneMonthClick;
    @FindBy(xpath = "//div[@class='example-header']//button[1]//span[2]")
    public WebElement previousBackOneYearClick;
    @FindBy(xpath = "//span[normalize-space()='Today']")
    public WebElement todayDayIsClick;
    @FindBy(xpath = "//div[@class='example-header']//button[4]")
    public WebElement nextOneMonthFeatureClick;
    @FindBy(xpath = "//div[@class='example-header']//button[5]")
    public WebElement nextOneYearFeatureClick;
// default View
@FindBy(xpath = "//span[@class='iso']")
public WebElement defaultView;
    @FindBy(xpath = "//span[@fxlayout='row']//span[@class='iso'][normalize-space()='Default View']")
    public WebElement defaultViewClick;
    @FindBy(xpath = "//span[contains(text(),'Show by Course')]")
    public WebElement showsByCourseDefaultViewClick;
    @FindBy(xpath = "//span[contains(text(),'Show by Type')]")
    public WebElement showsByTypeDefaultViewClick;
    @FindBy(xpath = "//span[contains(text(),'Show by Date')]")
    public WebElement showsByDateDefaultViewClick;
    @FindBy(xpath = "//span[contains(text(),'Show by Chart')]")
    public WebElement showsByChartDefaultViewClick;
//
    @FindBy(xpath = "//label[normalize-space()='Show Only Marked']")
    public WebElement ShowOnlyMarked;
    //
    @FindBy(xpath = "//span[contains(text(),'Search')]")
    public WebElement searchButtonClick;
    // sing out
    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger user-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement profileSettingClick;
    @FindBy(xpath = "//span[contains(text(),'Sign Out')]")
    public WebElement singOutClick;
}

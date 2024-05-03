package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class _13_AttendancePage extends CommonMethods {

    // Attendance excuse menu
    @FindBy(xpath = "//ms-layout-menu-button[@page='ATTENDANCE']")
    public WebElement attendanceMenu;

    @FindBy(xpath = "//span[contains(text(),'ATTENDANCE EXCUSES')]")
    public WebElement attendanceExcusesPage;

    @FindBy(xpath = "(//button)[20]")
    public WebElement addAttendanceExcuseBtn;

    @FindBy(xpath = "(//textarea[@id='ms-textarea-field-0'])[1]")
    public WebElement attendanceExcuseTextBox;

    @FindBy(xpath = "//span[@class='mat-mdc-menu-item-text']")
    public WebElement attachAttendanceExcuseFileBtn;

    @FindBy(xpath = "//ms-standard-button[@icon='files']//span[@class='mat-mdc-menu-item-text']")
    public WebElement addAttendanceExcuseFromMyFilesBtn;

    @FindBy(xpath = "(//div[@class='mdc-form-field mat-internal-form-field'])[4]")
    public WebElement addAttendanceExcuseFileCheckBox;

    @FindBy(xpath = "//span[contains(text(),'Select')]")
    public WebElement selectAddFileBtn;

    @FindBy(xpath = "//span[contains(text(),'Send')]")
    public WebElement sendAttendanceExcuseBtn;

    @FindBy(xpath = "//div[text()='Attendance Excuse successfully sent']")
    public WebElement successfullySendAttendanceExcuseMessage;

}

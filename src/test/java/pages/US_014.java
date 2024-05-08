package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class US_014 extends CommonMethods {
    @FindBy(xpath = "//img[@class='profile-image avatar huge ng-star-inserted']")
    public WebElement imageClick;
    @FindBy(xpath = "//span[normalize-space()='Upload']")
    public WebElement downloadImageClick;
    @FindBy(xpath = "//span[contains(text(),'Save')]")
    public WebElement safeImageClick;
    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger user-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement profileSettingClick;
@FindBy(xpath = "//span[contains(text(),'Settings')]")
public WebElement SettingClick;
    @FindBy(xpath = "//span[contains(text(),'Sign Out')]")
    public WebElement singOutClick;

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;
public class _010_HamburgerMenuPage  extends CommonMethods{

    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger mat-button-wrapper mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base']//fa-icon[@class='ng-fa-icon mat-mdc-tooltip-trigger']//*[name()='svg']")
    public WebElement  HamburgerMenu ;

    @FindBy(xpath = "//span[contains(text(),'Finance')]")
    public WebElement   Finance ;

    @FindBy(xpath = "//span[contains(text(),'My Finance')]")
    public WebElement MyFinance ;

    @FindBy(xpath = "  //button[@class='mat-mdc-tooltip-trigger mat-badge mdc-icon-button mat-mdc-icon-button mat-badge-accent mat-#3f51b5 mat-mdc-button-base mat-badge-below mat-badge-after mat-badge-small mat-badge-hidden ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement  SelectsViewIcon;

    @FindBy(xpath = "//input[@id='mat-radio-8-input']")
    public WebElement  SelectsStripeAsThePaymentMethod ;



}

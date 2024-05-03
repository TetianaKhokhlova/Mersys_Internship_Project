package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class _06_MessagingPage extends CommonMethods {
    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger mat-button-wrapper mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base']//fa-icon[@class='ng-fa-icon mat-mdc-tooltip-trigger']//*[name()='svg']")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//span[@class='mat-mdc-menu-item-text'][1]")
    public WebElement messagingLink;
    //span[@class='mat-mdc-menu-item-text'][1]
    @FindBy(xpath = "//span[@class='ng-tns-c1923052698-12 ng-star-inserted'][3]")
    public WebElement outBoxLink;


    @FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/ms-confirm-button[1]/button[1]/span[2]")
    public WebElement trashIcon;


    @FindBy(xpath = "//button[@type='submit']//span[@class='mat-mdc-focus-indicator']")
    public WebElement confirmationOfDeleting;

    @FindBy(xpath = "//div[contains(text(),'Message successfully moved to trash!')] ")
    public WebElement messageSuccessfullyDeleted;

    // _07_MessagingRestore


    @FindBy(xpath = "//span[@class='ng-tns-c1923052698-12 ng-star-inserted'][4]")
    public WebElement trashLink;

    @FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/ms-delete-button[1]/button[1]/span[2]")
    public WebElement trashBinSecond;

    @FindBy(xpath = "(//span[normalize-space()='Cancel'])[1]")
    public WebElement cancellationOfDeleting;


    @FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/ms-standard-button[2]/button[1]/span[2]")
    public WebElement restoreItem;

    @FindBy(xpath = " //div[contains(text(),'Message successfully restored from trash')]")
    public WebElement restoreMessage ;

}


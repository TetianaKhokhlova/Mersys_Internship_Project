package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class _06_MessagingPage extends CommonMethods {

    @FindBy(xpath = "//div[@class='ng-star-inserted']//div[@fxlayout='row']//span[@class='ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
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
    public WebElement restoreMessage;

    //_09_Finance

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeLink;

    @FindBy(xpath = "(//span[contains(text(),'My Finance')])[1]")
    public WebElement financeButton;

    //button[@class='mat-mdc-menu-item mat-mdc-focus-indicator ng-star-inserted']
  @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[18]")
   public WebElement viewFinance;

  @FindBy(xpath ="(//span[@class='mdc-tab__content'])[2] ")
  public WebElement balanceDetail;

@FindBy(xpath = "(//div[contains(text(),'Installment')])[1]")
    public WebElement installmentTable;

}


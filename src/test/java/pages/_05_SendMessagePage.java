package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class _05_SendMessagePage extends CommonMethods {

    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon mat-mdc-tooltip-trigger'])[6]")
    public WebElement hamburgerMenu;


    @FindBy(xpath = "//span[contains(text(),'Messaging')]")
    public WebElement messagingLink;

    @FindBy(xpath = "//span[contains(text(),'New Message')]")
    public WebElement newMessageButton;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[17]")
    public WebElement receiverIcon;

    @FindBy(xpath = "//input[@id='mat-input-3']")
    public WebElement studentNameTextBox;

    @FindBy(xpath = "//tbody/tr[2]/td[1]")
    public WebElement chooseStudent;

    @FindBy(xpath = "//tbody/tr[5]/td[2]")
    public WebElement chooseStudent2;

    @FindBy(xpath = "//span[@class='ng-star-inserted'][normalize-space()='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//input[@id='mat-input-3']")
    public WebElement teacherNameTextBox;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement chooseTeacher;

    @FindBy(xpath = "//span[contains(text(),'Add & Close')]")
    public WebElement addCloseButton;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    public WebElement subjectTextBox;

    @FindBy(tagName = "p")
   public WebElement messageTextBox;

    @FindBy(xpath = "//div[@fxlayoutalign='end start']")
    public WebElement attachFile;

    @FindBy(xpath = "//ms-standard-button[@icon='hdd']//button[@role='menuitem']")
    public WebElement fromLocal;

    //@FindBy(xpath = "//input[@type='file']")
    //public WebElement fileUploadInput;
    public WebElement fileUploadInput;

    public void clickFileUploadInput() {

        fileUploadInput.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Send')]")
    public WebElement sendButton;

    @FindBy(xpath = "//span[contains(text(),'Messaging')]")
    public WebElement messaging;

    @FindBy(xpath = "//span[contains(text(),'Outbox')]")
    public WebElement outboxButton;



}






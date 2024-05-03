package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;


public class _04_MessagingPage extends CommonMethods {

    @FindBy(xpath= "(//fa-icon[@class='ng-fa-icon mat-mdc-tooltip-trigger'])[6]")
    public WebElement hamburgerMenu;


    @FindBy(xpath = "//div[@class='ng-star-inserted']//div[@fxlayout='row']//span[@class='ng-star-inserted']//span[@class='mat-mdc-focus-indicator']")
    public WebElement messagingLink;
    //(*[name()='polygon'])[1]
    @FindBy(xpath = "//span[contains(text(),'New Message')]")
    public WebElement newMessageButton;

    @FindBy(xpath = "//span[contains(text(),'Inbox')]")
    public WebElement inboxButton;

    @FindBy(xpath = "//span[contains(text(),'Outbox')]")
    public WebElement outboxButton;

    @FindBy(xpath = "//span[4]//span[1]//button[1]//span[1]//fa-icon[1]//*[name()='svg']")
    public WebElement trashButton;



}




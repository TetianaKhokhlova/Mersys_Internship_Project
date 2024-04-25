package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class _01_LoginPage extends CommonMethods {

   @FindBy(xpath = "//input[@id='mat-input-0']")
   public WebElement usernameTextBox;

   @FindBy(xpath = "//input[@id='mat-input-1']")
    public WebElement passwordTextBox;

   @FindBy(xpath = "//span[@class='mdc-button__label']")
    public WebElement loginButton;
}

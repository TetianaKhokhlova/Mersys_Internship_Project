package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class _11_HamburgerMenuPage extends CommonMethods {

    @FindBy(xpath = "(//*[name()='svg'][@role='img'])[6]")
    public WebElement clickBurgerMenu;

    @FindBy(xpath = "(//span[contains(text(),'Finance')])[1]")
    public WebElement clickFinance;

    @FindBy(xpath = "(//span[contains(text(),'My Finance')])[1]")
    public WebElement clickMyFinance;

    @FindBy(xpath = "(//div[@style='text-align: left;'])[2]")
    public WebElement clickStudent_10;

    @FindBy(xpath = "(//input[@id='mat-radio-8-input'])[1]")
    public WebElement selectStripeButton;











}

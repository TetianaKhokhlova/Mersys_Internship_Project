package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;
public class _010_HamburgerMenuPage  extends CommonMethods{

    @FindBy(xpath = "(//*[name()='svg'][@role='img'])[6]")
    public WebElement  HamburgerMenu ;

    @FindBy(xpath = "(//span[contains(text(),'Finance')])[1]")
    public WebElement   Finance ;

    @FindBy(xpath = "(//span[contains(text(),'My Finance')])[1]")
    public WebElement MyFinance ;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[18]")
    public WebElement  SelectsViewIcon;

    @FindBy(xpath = "(//input[@id='mat-radio-10-input'])[1]")
    public WebElement  SelectsStripeAsThePaymentMethod ;



}

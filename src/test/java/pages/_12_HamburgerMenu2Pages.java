package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class _12_HamburgerMenu2Pages extends CommonMethods {
    @FindBy(xpath = "(//*[name()='svg'][@role='img'])[6]")
    public WebElement clickBurgerMenu;

    @FindBy(xpath = "(//span[contains(text(),'Finance')])[1]")
    public WebElement clickFinance;

    @FindBy(xpath = "(//span[contains(text(),'My Finance')])[1]")
    public WebElement clickMyFinance;

    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[20]")
    public WebElement threePointDropDownMenu;

    @FindBy(xpath = "(//span[normalize-space()='Excel Export'])[1]")
    public WebElement selectExcelOption;

    @FindBy(xpath = "(//span[normalize-space()='Pdf Export'])[1]")
    public WebElement selectPdfOption;





}

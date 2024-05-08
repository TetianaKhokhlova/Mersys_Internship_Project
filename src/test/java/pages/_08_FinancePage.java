package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.CommonMethods;

public class _08_FinancePage extends CommonMethods {

    // Finance Menu
    @FindBy(xpath = "(//fa-icon[@class='ng-fa-icon mat-mdc-tooltip-trigger'])[6]")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeMenu;

    @FindBy(xpath = "//span[contains(text(),'My Finance')]")
    public WebElement myFinanceMenu;

}

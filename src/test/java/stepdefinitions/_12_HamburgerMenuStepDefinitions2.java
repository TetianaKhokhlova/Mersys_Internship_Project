package stepdefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages._12_HamburgerMenu2Pages;
import utilities.CommonMethods;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

public class _12_HamburgerMenuStepDefinitions2  {

    _12_HamburgerMenu2Pages hamburgerMenu2Pages =new _12_HamburgerMenu2Pages();


    @When("the student navigates to the payment page via Hamburger Menu > Finance > My Finance")
    public void the_student_navigates_to_the_payment_page_via_hamburger_menu_finance_my_finance() {
        hamburgerMenu2Pages.clickElement(hamburgerMenu2Pages.clickBurgerMenu);
        hamburgerMenu2Pages.waitTime(2);
        hamburgerMenu2Pages.clickElement(hamburgerMenu2Pages.clickFinance);
        hamburgerMenu2Pages.waitTime(2);
        hamburgerMenu2Pages.clickElement(hamburgerMenu2Pages.clickMyFinance);
        hamburgerMenu2Pages.waitTime(2);
    }
    @When("clicks on the three-point drop-down menu button for report options")
    public void clicks_on_the_three_point_drop_down_menu_button_for_report_options() {
        hamburgerMenu2Pages.clickElement(hamburgerMenu2Pages.threePointDropDownMenu);
        hamburgerMenu2Pages.waitTime(2);
    }
    @Then("the student opens the downloaded Excel file and verifies the content")
    public void the_student_opens_the_downloaded_excel_file_and_verifies_the_content() throws AWTException {
        hamburgerMenu2Pages.clickElement(hamburgerMenu2Pages.selectExcelOption);
        hamburgerMenu2Pages.waitTime(2);
        // Use Robot class to handle the file download
        Robot robot = new Robot();
        // Press Enter key to confirm the download
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        hamburgerMenu2Pages.waitTime(2);

        String fileLocation = "C:\\Users\\Sarılar\\Downloads";
        hamburgerMenu2Pages.waitTime(10);

        File downloadedFile = new File(fileLocation);
        if (downloadedFile.exists() && !downloadedFile.isDirectory()) {
            // File has been successfully downloaded
            System.out.println("File downloaded successfully!");
        } else {
            // File download failed or file does not exist
            System.out.println("File download failed or file does not exist.");
        }
  }

    @Then("the student opens the downloaded PDF file and verifies the content")
    public void the_student_opens_the_downloaded_pdf_file_and_verifies_the_content() throws AWTException {
        hamburgerMenu2Pages.clickElement(hamburgerMenu2Pages.selectPdfOption);
        hamburgerMenu2Pages.waitTime(2);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }


}




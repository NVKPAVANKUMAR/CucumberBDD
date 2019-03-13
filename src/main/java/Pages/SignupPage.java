package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utility.Reporter.logger;


public class SignupPage {

    private final WebDriver driver;
    @FindBy(id = "payment_plan_id")
    private WebElement planTypeDropdown;
    @FindBy(name = "first_name")
    private WebElement firstNameTxtInput;
    @FindBy(name = "surname")
    private WebElement lastNameTxtInput;
    @FindBy(name = "email")
    private WebElement emailTxtInput;
    @FindBy(name = "email_confirm")
    private WebElement confirmEmailTxtInput;
    @FindBy(name = "username")
    private WebElement userNameTxtInput;
    @FindBy(name = "password")
    private WebElement passwordTxtInput;
    @FindBy(name = "passwordconfirm")
    private WebElement confirmPasswordTxtInput;
    @FindBy(name = "agreeTerms")
    private WebElement agreeTermsCheckbox;
    @FindBy(id = "submitButton")
    private WebElement submitButton;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    private void waitForElementToClick(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }

    public void selectPaymentType(String arg1) {
        Select select = new Select(planTypeDropdown);
        select.selectByVisibleText(arg1);
        logger.info("Payment Type Selected");
    }

    public void enterFirstName(String arg2) {
        firstNameTxtInput.sendKeys(arg2);
        logger.info("Firstname text entered");
    }

    public void enterLastName(String arg3) {
        lastNameTxtInput.sendKeys(arg3);
        logger.info("Lastname text enetered");
    }

    public void enterEmail(String arg4) {
        emailTxtInput.sendKeys(arg4);
        logger.info("Email text enetred");
    }

    public void confirmEmail(String arg5) {
        confirmEmailTxtInput.sendKeys(arg5);
        logger.info("Email id confirmed");
    }

    public void enterPassword(String arg6) {
        passwordTxtInput.sendKeys(arg6);
        logger.info("Password text enetered");
    }

    public void enterConfirmPassword(String arg7) {
        confirmEmailTxtInput.sendKeys(arg7);
        logger.info("Password confirmed");
    }

    public void clickOnCheckbox() {
        agreeTermsCheckbox.click();
        logger.info("Agree terms checkbox selected");
    }

    public void clickOnSubmit() {
        waitForElementToClick(submitButton);
        submitButton.click();
        logger.info("Submit button clicked");
    }
}

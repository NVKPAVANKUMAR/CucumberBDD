package Pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utility.Reporter.logger;

public class LoginPage {

    private final WebDriver driver;
    @FindBy(xpath = "//a[.='Sign Up']")
    private WebElement sighUpLink;
    @FindBy(name = "username")
    private WebElement userNameInput;
    @FindBy(name = "password")
    private WebElement passwordInput;
    @FindBy(xpath = "//*[@type='submit']")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private void waitForElement(WebElement ele) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(ele));
        logger.info("SingUp Link Available To Click");
    }

    public void clickSignupLink() {
        // waitForElement(sighUpLink);
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        sighUpLink.click();
        logger.info("Clicked on Signup link");
    }

    public void inputUsername(String usn) {
        waitForElement(userNameInput);
        userNameInput.clear();
        userNameInput.sendKeys(usn);
        logger.info("username text enetered");
    }

    public void inputPassword(String pwd) {
        waitForElement(passwordInput);
        passwordInput.clear();
        passwordInput.sendKeys(pwd);
        logger.info("password text enetered");
    }

    public void clickLoginBtn() throws InterruptedException {
        // waitForElement(loginBtn);
        Thread.sleep(10000);
        loginBtn.click();
        logger.info("Login button clicked");
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}

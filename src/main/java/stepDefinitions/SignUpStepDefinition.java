package stepDefinitions;

import Pages.LoginPage;
import Pages.SignupPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static utility.Reporter.logger;
import static utility.Reporter.reports;

public class SignUpStepDefinition {

    private WebDriver driver;
    private LoginPage login;

    @Given("^user is on Login Page$")
    public void user_on_login_page() {
        logger = reports.createTest(getClass().getName());
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://classic.crmpro.com/index.html?e=1");
    }

    @When("^title of login page is FreeCRM$")
    public void title_of_login_page_is_freeCRM() {
        String title = driver.getTitle();
        Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
    }

    @Then("^user clicks on signUp button$")
    public void user_clicks_on_signUp_button() throws InterruptedException {
        login = PageFactory.initElements(driver, LoginPage.class);
        login.clickSignupLink();
    }

    @Then("^browser navigated to Registration Page$")
    public void browser_navigated_to_Registration_Page() {
        String currentUrl = login.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://classic.crmpro.com/register/");
    }

    @Then("^User enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and_and_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7) {
        SignupPage signup = PageFactory.initElements(driver, SignupPage.class);
        signup.selectPaymentType(arg1);
        signup.enterFirstName(arg2);
        signup.enterLastName(arg3);
        signup.enterEmail(arg4);
        signup.confirmEmail(arg4);
        signup.enterUserNameTxt(arg5);
        signup.enterPassword(arg6);
        signup.enterConfirmPassword(arg7);
        signup.clickOnCheckbox();
        signup.clickOnSubmit();
        logger.pass("PASSED");
    }

    @Then("^close the browser instance$")
    public void close_the_browser_instance() {
        driver.quit();
    }
}

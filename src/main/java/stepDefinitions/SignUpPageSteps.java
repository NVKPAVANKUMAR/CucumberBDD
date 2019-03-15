package stepDefinitions;

import Pages.LoginPage;
import Pages.SignupPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProviders.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import managers.FileReaderManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import testDataTypes.Customer;

import static utility.Reporter.logger;
import static utility.Reporter.reports;

public class SignUpPageSteps {

    private WebDriver driver;
    private LoginPage login;
    private ConfigFileReader configFileReader = new ConfigFileReader();


    @Given("^user is on Loginup Page$")
    public void user_is_on_Loginup_Page() {
        logger = reports.createTest(getClass().getName());
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(configFileReader.getApplicationUrl());
    }

    @When("^user assert title of login page is FreeCRM$")
    public void user_assert_title_of_login_page_is_FreeCRM() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(configFileReader.getHomePageTitle(), actualTitle);
    }

    @Then("^user clicks on signUp link$")
    public void user_clicks_on_signUp_link() {
        login = PageFactory.initElements(driver, LoginPage.class);
        login.clickSignupLink();
    }

    @Then("^browser navigated to signUp Page$")
    public void browser_navigated_to_signUp_Page() {
        String currentUrl = login.getCurrentUrl();
        Assert.assertEquals(currentUrl, configFileReader.getSignUpPageUrl());
    }

    @Then("^enter \"([^\"]*)\" personal details on checkout page$")
    public void enter_personal_details_on_checkout_page(String arg1) {
        Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(arg1);
        SignupPage signUp = PageFactory.initElements(driver, SignupPage.class);
        signUp.fill_PersonalDetails(customer);
    }

    @Then("^quit the browser instance$")
    public void quit_the_browser_instance() {
        driver.quit();
    }
}

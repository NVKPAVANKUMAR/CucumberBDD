package stepDefinitions;

import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static utility.Reporter.logger;
import static utility.Reporter.reports;

public class LoginStepDefinition {

    private WebDriver driver;
    private LoginPage login;


    @Given("^user is already on Login Page$")
    public void user_already_on_login_page() {
        logger = reports.createTest(getClass().getName());
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://classic.crmpro.com/index.html?e=1");
    }


    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_free_CRM() {
        String title = driver.getTitle();
        // System.out.println(title);
        Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
    }


    //Reg Exp:
    //1. \"([^\"]*)\"
    //2. \"(.*)\"

    @Then("^user enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_username_and_password(String username, String password) {
        login = PageFactory.initElements(driver, LoginPage.class);
        login.inputUsername(username);
        login.inputPassword(password);
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() throws InterruptedException {
//        WebElement loginBtn =
//                driver.findElement(By.xpath("//input[@type='submit']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", loginBtn);
        login.clickLoginBtn();
    }


    @Then("^user is on home page$")
    public void user_is_on_hopme_page() {
        String title = driver.getTitle();
        // System.out.println("Home Page title ::" + title);
        Assert.assertTrue(title.contains("CRMPRO"));
    }

    @Then("^user moves to new contact page$")
    public void user_moves_to_new_contact_page() {
        driver.switchTo().frame("mainpanel");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
        driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
    }


    @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void user_enters_contacts_details(String firstname, String lastname, String position) {
        driver.findElement(By.id("first_name")).sendKeys(firstname);
        driver.findElement(By.id("surname")).sendKeys(lastname);
        driver.findElement(By.id("company_position")).sendKeys(position);
        driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
        logger.pass("PASSED");
    }

    @Then("^Close the browser$")
    public void Close_the_browser() {
        driver.quit();
        //reports.flush();
    }
}

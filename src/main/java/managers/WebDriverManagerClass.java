package managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class WebDriverManagerClass {

    public static void launchBrowser(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
           WebDriverManager.chromedriver().setup();
        }else if(browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
        } else if(browserName.equalsIgnoreCase("IE")){
            WebDriverManager.iedriver().setup();
        }

    }
}

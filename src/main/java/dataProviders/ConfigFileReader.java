package dataProviders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private Properties properties;

    public ConfigFileReader() {
        String propertyFilePath = "configuration/Configuration.properties";
        try (BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath))) {
            properties = new Properties();
            try {
                properties.load(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            throw new RuntimeException("Properties file not found at path : " + propertyFilePath);
        }
    }

    public long getImplicitWait() {
        String implicitlyWait = properties.getProperty("implicitlyWait");
        if (implicitlyWait != null) {
            try {
                return Long.parseLong(implicitlyWait);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Not able to parse value : \" + implicitlyWait + \" in to Long");
            }
        }
        return 30;
    }

    public String getApplicationUrl() {
        String url = properties.getProperty("url");
        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("Application Url not specified in the Configuration.properties file for the Key:url");
        }
    }

    public String getBrowser() {
        String browserName = properties.getProperty("browser");
        if (browserName != null) {
            return browserName;
        } else {
            throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
        }
    }

    public Boolean getBrowserWindowSize() {
        String windowSize = properties.getProperty("windowMaximize");
        if (windowSize != null) return Boolean.valueOf(windowSize);
        return true;
    }

    public String getTestDataResourcePath() {
        String testDataResourcePath = properties.getProperty("testDataResourcePath");
        if (testDataResourcePath != null) return testDataResourcePath;
        else
            throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");
    }

    public String getHomePageTitle() {
        String testDataResourcePath = properties.getProperty("homepageTitle");
        if (testDataResourcePath != null) return testDataResourcePath;
        else
            throw new RuntimeException("HomePage Title not specified in the Configuration.properties file for the Key:homepageTitle");
    }

    public String getSignUpPageUrl() {
        String testDataResourcePath = properties.getProperty("signUpUrl");
        if (testDataResourcePath != null) return testDataResourcePath;
        else
            throw new RuntimeException("SignUpPage Url not specified in the Configuration.properties file for the Key:signUpUrl");
    }


}

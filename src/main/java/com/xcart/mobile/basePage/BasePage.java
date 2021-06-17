package com.xcart.mobile.basePage;

import com.xcart.mobile.propertyreader.PropertyReader;
import com.xcart.mobile.propertyreader.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
    String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    String projectPath = System.getProperty("user.dir");
    int implicitlyWait = Integer.parseInt(PropertyReader.getInstance().getProperty("implicitlyWait"));


    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", projectPath + "/drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicitlyWait, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }


    }
}
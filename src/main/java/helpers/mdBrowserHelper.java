package helpers;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import parser.mdParser;

/**
 * Created by maninderdhanju on 4/5/15.
 */

public class mdBrowserHelper {
    public static WebDriver driver;

    String myBrowser = mdParser.getBrowser();
    String myUrl = mdParser.getUrl();

    @Before
    public void launchBrowser() throws Exception {
        System.out.println("**** Launching Browser ****");
        setDriver(myBrowser, myUrl);
    }

    @After
    public void quitBrowser() throws Exception {
        System.out.println("**** Closing Browser ****");
        driver.quit();
    }

    public void setDriver(String myBrowser, String myUrl) {

        if (myBrowser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (myBrowser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();
        }
        driver.get(myUrl);
    }
}
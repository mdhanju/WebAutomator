package helpers;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import parser.mdConfigParser;
import cucumber.api.Scenario;
import parser.mdWebComponentParser;
import stepHelpers.mdWait;

import java.io.IOException;

/**
 * Created by maninderdhanju on 4/5/15.
 */

public class mdBrowserHelper {
    public static WebDriver driver;
    public static String fileName;
    public static String myUrl;

    String myBrowser = mdConfigParser.getBrowser();

    @Before
    public void before(Scenario scenario) throws IOException, ParseException {
        String scenarioName = scenario.getName();
        System.out.println("Scenario Name = " + scenarioName);
        fileName = mdWebComponentParser.getNameOfWebComp(scenarioName);
        myUrl = mdWebComponentParser.getUrl(fileName);
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
        mdWait.waitFor(2);
    }
}
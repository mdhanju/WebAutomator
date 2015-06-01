package helpers;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import parser.mdConfigParser;
import parser.mdWebElementParser;

import java.io.IOException;

/**
 * Created by maninderdhanju on 4/5/15.
 */

public class mdBrowserHelper {
    public static WebDriver driver;
    public static String fileName;
    public static String dataFileName;
    public static String myUrl;

    String myBrowser = mdConfigParser.getBrowser();

    @Before
    public void before(Scenario scenario) throws IOException, ParseException {
        String scenarioName = scenario.getName();
        setFileName(scenarioName);
        setDataFileName(scenarioName);
        fileName = mdWebElementParser.getNameOfWebComp(scenarioName);
        myUrl = mdWebElementParser.getUrl(fileName);
        System.out.println("SCENARIO NAME     --> " + scenarioName);
        System.out.println("DATA FILE NAME    --> " + dataFileName);
        System.out.println("URL               --> " + myUrl);
        System.out.println("DEFAULT WAIT TIME --> " + mdConfigParser.getwaitTime());
        System.out.println("**** LAUNCHING " + myBrowser.toUpperCase() + " BROWSER ****");
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

        } else if (myBrowser.equals("ie")) {
            driver = new InternetExplorerDriver();

        } else if (myBrowser.equals("safari")) {
            driver = new SafariDriver();

        } else if (myBrowser.equals("phantom")) {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "driver/phantomjs");
            driver = new PhantomJSDriver(caps);

        } else {
            driver = new ChromeDriver();

        }

//        driver.manage().window().maximize();
        driver.get(myUrl);



    }

    public String getPageTitle() {
        String myTitle = driver.getTitle();
        return myTitle;
    }


    public static String getFileName() {
        return fileName;
    }

    public static void setFileName(String name) {
        fileName = name;
    }


    public static String getDataFileName() {
        return dataFileName;
    }

    public static void setDataFileName(String name) {
        String[] myArray = name.split(" ");
        for (int i = 0; i < myArray.length; i++) {
            if (i == 0) dataFileName = myArray[i].substring(0, 1).toLowerCase() + myArray[i].substring(1);
            else dataFileName = dataFileName + myArray[i].substring(0, 1).toUpperCase() + myArray[i].substring(1);
        }
    }

}
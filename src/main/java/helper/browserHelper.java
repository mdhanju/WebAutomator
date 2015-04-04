package helper;

/**
 * Created by maninderdhanju on 4/4/15.
 */
import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserHelper {
    private static WebDriver driver;

    @Before
    public void launchBrowser() throws Exception {
        System.out.println("**** Launching Browser ****");
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }

    @After
    public void quitBrowser() throws Exception {
        System.out.println("**** Closing Browser ****");
        driver.quit();
    }
}

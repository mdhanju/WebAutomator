package steps;

import cucumber.api.java.en.Given;
import helpers.mdBrowserHelper;
import mdRouter.mdMainRouter;

/**
 * Created by maninderdhanju on 4/7/15.
 */
public class mdSteps {

    @Given("^I am on googleSearchPage$")
    public void i_am_on_googleSearchPage() throws Throwable {
        String myFileName = mdBrowserHelper.fileName;
        System.out.println(" Web Component File Name in step === " + myFileName);
    }

    @Given("^I click \"(.*?)\"$")
    public void i_click(String arg1) throws Throwable {
        String myFileName = mdBrowserHelper.fileName;
        System.out.println(" Web Component File Name in step === " + myFileName);
    }

    @Given("^I am on gmailPage$")
    public void i_am_on_gmailPage() throws Throwable {
        String myFileName = mdBrowserHelper.fileName;
        System.out.println(" Web Component File Name in step === " + myFileName);
    }

    @Given("^I see \"(.*?)\"$")
    public void i_see(String arg1) throws Throwable {
        String myFileName = mdBrowserHelper.fileName;
        System.out.println(" Web Component File Name in step === " + myFileName);
    }
}

package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.mdBrowserHelper;
import mdRouter.mdActionRouter;
import mdRouter.mdAssertRouter;

/**
 * Created by maninderdhanju on 4/7/15.
 */
public class mdSteps {

    @Given("^I am on \"(.*?)\"$")
    public void i_am_on(String arg1) throws Throwable {
        String myFileName = mdBrowserHelper.fileName;
        mdAssertRouter assertRouter = new mdAssertRouter(myFileName);
        assertRouter.assertPages(arg1);
    }

    @Given("^I see \"(.*?)\"$")
    public void i_see(String arg1) throws Throwable {
        String myFileName = mdBrowserHelper.fileName;
        mdAssertRouter assertRouter = new mdAssertRouter(myFileName);
        assertRouter.assertElements(arg1);
    }

    @Given("^I click \"(.*?)\"$")
    public void i_click(String arg1) throws Throwable {
        String myFileName = mdBrowserHelper.fileName;
        mdActionRouter actionRouter = new mdActionRouter(myFileName);
        actionRouter.clickElement(arg1);
    }

    @Then("^I input \"(.*?)\" in \"(.*?)\"$")
    public void i_input_in(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        String myFileName = mdBrowserHelper.fileName;
        mdActionRouter actionRouter = new mdActionRouter(myFileName);
        actionRouter.inputTextInElement(arg2, arg1);
    }

}

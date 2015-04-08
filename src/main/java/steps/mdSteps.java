package steps;

import cucumber.api.java.en.Given;
import mdRouter.mdMainRouter;

/**
 * Created by maninderdhanju on 4/7/15.
 */
public class mdSteps {
    @Given("^I \"(.*?)\" \"(.*?)\"$")
    public void i(String arg1, String arg2) throws Throwable {
        mdMainRouter mainRouter = new mdMainRouter(arg1, arg2);
    }
}

package steps; /**
 * Created by maninderdhanju on 4/4/15.
 */
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepHelpers.clickElement;
import stepHelpers.getInnerHTML;
import stepHelpers.mdWait;

import static stepHelpers.clickElement.*;

public class logIn {

    @Given("^I am on Log In page$")
    public void i_am_on_Log_In_page() throws Throwable {

//        mdWait.waitFor(1);
        String onee = getInnerHTML.findByClass("gb_l");
        clickElement.clickByClass("gb_l");
        System.out.println("---- onee---- " + onee);
//        mdWait.waitFor(1);
        System.out.println("---- Log  In Page ----");

    }

    @Then("^I see User Id input field$")
    public void i_see_User_Id_input_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.out.println("User Id");
    }

    @Then("^I see password field$")
    public void i_see_password_field() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.out.println("Password");
    }

    @Then("^I see copyright message$")
    public void i_see_copyright_message() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }
}

package steps; /**
 * Created by maninderdhanju on 4/4/15.
 */
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import stepHelpers.mdClickElement;
import stepHelpers.mdGetInnerHTML;
import stepHelpers.mdWait;

public class logIn {

    @Given("^I am on Log In page$")
    public void i_am_on_Log_In_page() throws Throwable {

//        mdWait.waitFor(1);
        String onee = mdGetInnerHTML.findByClass("gb_l");
        mdClickElement.clickByClass("gb_l");
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
        System.out.println("Step -- I see copyright message");
    }

    @Given("^I am on Log In page for gmail$")
    public void i_am_on_Log_In_page_for_gmail() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.out.println("Step -- I am on Log In page for gmail");
    }


    @Given("^I am on google search page$")
    public void i_am_on_google_search_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();

        mdClickElement.findByLinkText("+You");
//        mdWait.waitFor(5);
        System.out.println("Step -- I am on google search page");
    }

    @Given("^I see \"(.*?)\"$")
    public void i_see(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        System.out.println("Step -- I see" + arg1);
    }
}

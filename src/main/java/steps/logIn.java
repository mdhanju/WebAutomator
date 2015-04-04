package steps; /**
 * Created by maninderdhanju on 4/4/15.
 */
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logIn {


    @Given("^I am on Log In page$")
    public void i_am_on_Log_In_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();


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
}

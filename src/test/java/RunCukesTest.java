/**
 * Created by maninderdhanju on 4/4/15.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        features = "src/test/features/logIn.feature"
)
public class RunCukesTest {
}


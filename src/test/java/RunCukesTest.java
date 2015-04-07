/**
 * Created by maninderdhanju on 4/4/15.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/googleSearchPage.feature",
        glue = "steps",
        monochrome = true,
        format = {
                "pretty",
                "html:target/cucumber",
                "json:target_json/result.json"
        }
)
public class RunCukesTest {
}


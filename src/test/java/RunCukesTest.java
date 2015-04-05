/**
 * Created by maninderdhanju on 4/4/15.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/logIn.feature", dryRun = false,
        strict = true,
        //glue = "com.sample",
        //tags = { "~@wip", "@executeThis" },
        monochrome = true,
        format = {
                "pretty",
                "html:target/cucumber",
                "json:target_json/result.json"
        }
)
public class RunCukesTest {
}


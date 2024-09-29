package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Workspace\\Cucumber-SimpleArtifactId\\features\\Friday.feature",
                 glue = {"Steps"}, plugin= {"pretty", "html:target/cucumber-reports/cucumber.html",
        		 "json:target/cucumber-reports/cucumber.json"}
                 )
public class FridayRunner {

}

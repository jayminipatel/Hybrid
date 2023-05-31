package StepDefination;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

      //   features ="C:\\Users\\ptpat\\IdeaProjects\\HybridFramework\\src\\test\\resources\\Features\\Login.feature",
        features = "C:\\Users\\ptpat\\IdeaProjects\\HybridFramework\\src\\test\\resources\\Features\\Register.feature",
        format = {"pretty","html:html","json:json/cucumber.json","junit:junit/cucumber.xml"},
        dryRun = false


)

public class RunTest {
}

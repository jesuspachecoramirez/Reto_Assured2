package co.com.sofka.covidtracking.runners.servicesValidation;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        publish = true,
        features = {"src/test/resources/features/"},
        glue = {"co.com.sofka.covidtracking.stepdefinitions.serviceValidation"}

)


public class serviceValidationTest {
}

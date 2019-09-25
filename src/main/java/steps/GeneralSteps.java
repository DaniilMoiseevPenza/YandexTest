package steps;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selenide.open;


public class GeneralSteps {


    @Given("^open start page$")
    public void openStartPage() throws Throwable {
        open(Configuration.baseUrl);
    }
}

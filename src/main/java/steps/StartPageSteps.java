package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static helpers.LoggerCommands.loggerWarn;
import static helpers.LoggerCommands.writeToConsole;
import static org.junit.jupiter.api.Assertions.fail;
import static pages.StartPage.*;
import static utils.ActionsUtils.setTextToElement;
import static utils.SelenideElementsUtils.returnElementsCollections;

public class StartPageSteps {
    private static final String CLASS_NAME = StartPageSteps.class.getName();


    @When("^type to input text \"([^\"]*)\" in text search field$")
    public void typeToInputTextInTextSearchField(String searchText) throws Throwable {
        setTextToElement(searchField, searchText);
        $(By.xpath(X_PATH_SEARCH_TEXT + "//*[contains(text(),'" + searchText.toLowerCase() + "')]")).waitUntil(visible, 5000);
    }


    @Then("^parse <(\\d+)> line from result search and output it in console$")
    public void parseLineFromResultSearchAndOutputItInConsole(int lineNumber) {
        try {
            writeToConsole(returnElementsCollections(X_PATH_SEARCH_TEXT).get(lineNumber - 1).getText());
        } catch (ArrayIndexOutOfBoundsException e) {
            loggerWarn(CLASS_NAME, "You have not search results with index 0", e);
            fail();
        }
    }
}

package ru.litecart;

import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertAll;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/searchFieldTest.feature"},
        glue = "steps"
)

public class TestExec {

    @BeforeClass
    public static void init() {
        // browser = System.getProperty("browsertype");  // ex. -Dbrowsertype=chrome
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;
        Configuration.baseUrl = "http://yandex.ru/";//System.getProperty("url");
        Configuration.browser = "chrome";
        Configuration.fastSetValue = true;
    }

}





package utils;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class SelenideElementsUtils {

    public static ElementsCollection returnElementsCollections(String xPath) {
        return $$(By.xpath(xPath));
    }
}

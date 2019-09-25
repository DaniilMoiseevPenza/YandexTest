package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StartPage {

    //Текстовое поле поиска
    public static final SelenideElement searchField = $(By.id("text"));
    //Результаты поиска в поисковой строке
    public static final String X_PATH_SEARCH_TEXT = "//li/span/b/..";
}

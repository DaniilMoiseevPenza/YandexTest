package utils;

import com.codeborne.selenide.SelenideElement;

public class ActionsUtils {

    public static void setTextToElement(SelenideElement element, String text) {
        element.click();
        element.clear();
        element.setValue(text);
    }
}

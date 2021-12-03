package ru.yandex.scooter.po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.visible;

public class YandexMainPage {

    //Локатор логотипа "Яндекс"
    @FindBy(xpath = "//div[@class='home-logo__default']")
    private SelenideElement yandexDefaultLogo;

    //Проверяем виден ли логотип
    public void visibleYandexDefaultLogo(){
        yandexDefaultLogo.shouldBe(visible);
    }

}

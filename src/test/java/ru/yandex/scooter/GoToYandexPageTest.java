package ru.yandex.scooter;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.scooter.po.MainPage;
import ru.yandex.scooter.po.YandexMainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class GoToYandexPageTest {

    @Before
    public void launchWithoutFrontend() {
        Configuration.headless = true;
    }

    @Test
    public void goToYandexPageTest() {
        MainPage mainPage = open(MainPage.main_url, MainPage.class);
        YandexMainPage yandexMainPage = mainPage.clickYandexLogoLink();
        switchTo().window(1);
        yandexMainPage.visibleYandexDefaultLogo();
    }
}

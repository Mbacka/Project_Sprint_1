package ru.yandex.scooter;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.scooter.po.MainPage;
import ru.yandex.scooter.po.ViewOrderPage;

import static com.codeborne.selenide.Selenide.open;

public class CheckOrderStatusTest {

    @Before
    public void launchWithoutFrontend() {
        Configuration.headless = true;
    }

    @Test
    public void checkOrderStatusTest() {
        MainPage mainPage = open(MainPage.main_url, MainPage.class).clickCookiesYesButton();
        mainPage.clickOrderStatusButton();
        mainPage.setOrderStatusInputField("222716");
        ViewOrderPage viewOrderPage = mainPage.clickOrderStatusGoButton();
        viewOrderPage.visibleCancelOrderButton();
    }

    @Test
    public void checkNotExistOrderStatusTest() {
        MainPage mainPage = open(MainPage.main_url, MainPage.class).clickCookiesYesButton();
        mainPage.clickOrderStatusButton();
        ViewOrderPage viewOrderPage = mainPage.clickOrderStatusGoButton();
        viewOrderPage.visibleViewOrderButton();

    }

}

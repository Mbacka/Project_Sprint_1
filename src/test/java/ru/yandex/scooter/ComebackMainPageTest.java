package ru.yandex.scooter;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.scooter.po.MainPage;
import ru.yandex.scooter.po.OrderPage;
import ru.yandex.scooter.po.ViewOrderPage;

import static com.codeborne.selenide.Selenide.open;

public class ComebackMainPageTest {

    @Before
    public void launchWithoutFrontend() {
        Configuration.headless = true;
    }

    @Test
    public void comebackMainPageTest() {
        MainPage mainPage = open(MainPage.main_url, MainPage.class).clickCookiesYesButton();
        OrderPage orderPage = mainPage.clickCreateOrderUpperButton();
        orderPage.clickScooterLogoImgLink();
        mainPage.visibleHomeHeaderText();
        mainPage.clickOrderStatusButton();
        ViewOrderPage viewOrderPage = mainPage.clickOrderStatusGoButton();
        viewOrderPage.clickScooterLogoImgLink();
        mainPage.visibleHomeHeaderText();


    }
}

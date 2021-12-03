package ru.yandex.scooter;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.scooter.po.ConfirmationPage;
import ru.yandex.scooter.po.LeaseDetailsPage;
import ru.yandex.scooter.po.MainPage;
import ru.yandex.scooter.po.OrderPage;

import static com.codeborne.selenide.Selenide.open;

public class SuccessfulScooterOrderTest {

    @Before
    public void launchWithoutFrontend() {
        Configuration.headless = true;
    }

    @Test
    public void successfulFirstScooterOrderTest() {
        MainPage mainPage = open(MainPage.main_url, MainPage.class).clickCookiesYesButton();

        OrderPage orderPage = mainPage.clickCreateOrderUpperButton();
        orderPage.setRegistrationFields("Семен", "Семенов", "Киевская 2А", "Белорусская", "79991112233");
        LeaseDetailsPage leaseDetailsPage = orderPage.clickNextButton();
        leaseDetailsPage.setFields("15.11.2021", "двое суток", "grey", "Спасибо!");
        ConfirmationPage confirmationPage = leaseDetailsPage.clickBookButton();
        confirmationPage.clickYesButton();
        confirmationPage.orderIsProcessedHasText("Заказ оформлен");
    }

    @Test
    public void successfulSecondScooterOrderTest() {
        MainPage mainPage = open(MainPage.main_url, MainPage.class).clickCookiesYesButton();

        OrderPage orderPage = mainPage.clickCreateOrderLowerButton();
        orderPage.setRegistrationFields("Иван", "Иванов", "Советская д3", "Сокольники", "76665553344");
        LeaseDetailsPage leaseDetailsPage = orderPage.clickNextButton();
        leaseDetailsPage.setFields("25.12.2021", "трое суток", "black", "в 7");
        ConfirmationPage confirmationPage = leaseDetailsPage.clickBookButton();
        confirmationPage.clickYesButton();
        confirmationPage.orderIsProcessedHasText("Заказ оформлен");
    }
}

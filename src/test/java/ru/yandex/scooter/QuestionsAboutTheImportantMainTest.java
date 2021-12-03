package ru.yandex.scooter;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.scooter.po.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class QuestionsAboutTheImportantMainTest {

    @Before
    public void launchWithoutFrontend() {
        Configuration.headless = true;
    }


    @Test
    public void questionsAboutTheImportantMainTest() {
        MainPage mainPage = open(MainPage.main_url, MainPage.class);
        //Подтверждаем куки
        mainPage.clickCookiesYesButton();
        //Кликаем на каждое выпадающее меню и проверяем полученный текст.
        mainPage.viewListQuestionsAboutTheImportantFirstTextButton(
                "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
                "Да, обязательно. Всем самокатов! И Москве, и Московской области.");
    }


}

package ru.yandex.scooter.po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class ViewOrderPage {

    //Локатор кнопки "Отменить заказ"
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']")
    private SelenideElement cancelOrderButton;

    //Локатор для логотипа Самокат с сылкой на главную страницу "Яндекс.Самокат"
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement scooterLogoLink;

    //Локатор кнопки "Посмотреть заказ"
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement viewOrderButton;

    //Проверяем видимость кнопки "Отменить заказ"
    public void visibleCancelOrderButton() {
        cancelOrderButton.shouldBe(visible);
    }

    //Проверяем видимость кнопки "Отменить заказ"
    public void visibleViewOrderButton() {
        viewOrderButton.shouldBe(visible);
    }

    public MainPage clickScooterLogoImgLink() {
        scooterLogoLink.click();
        return page(MainPage.class);
    }


}

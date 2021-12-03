package ru.yandex.scooter.po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.ownText;

public class ConfirmationPage {

    //Локатор кнопки "Да"
    @FindBy(how = How.XPATH,using = "//div[@class='Order_Buttons__1xGrp']//button[@class='Button_Button__ra12g Button_Middle__1CSJM'][text()='Да']")
    private SelenideElement yesButton;

    //Локатор кнопки "Нет"
    @FindBy(how = How.XPATH,using = "//div[@class='Order_Buttons__1xGrp']//button[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i'][text()='Нет']")
    private SelenideElement noButton;

    //Локатор текста "Заказ оформлен"
    @FindBy(how = How.XPATH, using = "//div[@class='Order_ModalHeader__3FDaJ' and contains(text(), 'Заказ оформлен')]")
    private SelenideElement orderIsProcessedText;

    //Нажимаем кнопку "Да"
    public void clickYesButton(){
        yesButton.click();
    }
    //Нажимаем кнопку "Нет"
    public void clickNoButton(){
        noButton.click();
    }

    //Проверяем оформлен ли заказ.
    public void orderIsProcessedHasText(String text){
        orderIsProcessedText.shouldHave(ownText(text));
    }

}

package ru.yandex.scooter.po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class OrderPage {

    //Локатор поля "Имя"
    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Имя']")
    private SelenideElement inputNameField;

    //Локатор поля "Фамилия"
    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Фамилия']")
    private SelenideElement inputLastNameField;

    //Локатор поля "Адрес"
    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement inputAddressField;

    //Локатор поля "Метро"
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Станция метро']")
    private SelenideElement inputMetroStationField;

    //Локатор поля "Телефон"
    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN' and @placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement inputMobilePhoneField;

    //Локатор кнопки "Далее" на странице регистрация
    @FindBy(how = How.CSS, using = ".Button_Button__ra12g.Button_Middle__1CSJM")
    private SelenideElement nextButton;

    //Локатор для логотипа Самокат с сылкой на главную страницу "Яндекс.Самокат"
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement scooterLogoLink;

    //Метод заполнения первичной регистрации "Для кого самокат"
    public void setRegistrationFields(String name, String lastName, String address, String metroStation, String mobilePhone){
        inputNameField.setValue(name);
        inputLastNameField.setValue(lastName);
        inputAddressField.setValue(address);
        inputMetroStationField.setValue(metroStation).sendKeys(Keys.DOWN, Keys.ENTER);
        inputMobilePhoneField.setValue(mobilePhone);
    }

    //Метод клика на кнопку "Далее"
    public LeaseDetailsPage clickNextButton() {
        nextButton.click();
        return page(LeaseDetailsPage.class);
    }

    //Метод клика на лого "Самокат"
    public MainPage clickScooterLogoImgLink(){
        scooterLogoLink.click();
        return page(MainPage.class);
    }

}

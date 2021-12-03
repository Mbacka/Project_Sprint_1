package ru.yandex.scooter.po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LeaseDetailsPage {

    //Локатор чекбокса "Черный жемчуг"
    @FindBy(how = How.ID, using = "black")
    private SelenideElement blackColorScooterCheckBox;

    //Локатор чекбокса "Серая безысходность"
    @FindBy(how = How.ID, using = "grey")
    private SelenideElement greyColorScooterCheckBox;

    //Локатор поля "Дата"
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement dateFields;

    //Локатор поля "Срок аренды"
    @FindBy(how = How.XPATH, using = ".//div[@class='Dropdown-control']//div[@class='Dropdown-placeholder']")
    private SelenideElement durationFields;

    //Локатор выпадающего списка "Срок аренды"
    private SelenideElement dropdownFields;

    //Локатор поля "Комментарий"
    @FindBy(how = How.XPATH, using = "//div[@class='Input_InputContainer__3NykH']//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']")
    private SelenideElement commentFields;

    //Локатор кнопки "Назад"
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Buttons__1xGrp']//button[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']")
    private SelenideElement backButton;

    //Локатор кнопки "Заказать" в центральной части экрана.
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Buttons__1xGrp']//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement bookButton;

    public ConfirmationPage clickBookButton() {
        bookButton.click();
        return page(ConfirmationPage.class);
    }

    //Метод выбора скрока аренды в выпадающем списке
    public void setDropdownFieldsElementByText(String text) {
        dropdownFields = $(By.xpath("//div[@class='Dropdown-menu']//div[@class='Dropdown-option' and text()='" + text + "']"));
        dropdownFields.click();
    }

    //Метод заполнения формы деталей аренды "Про аренду"
    public void setFields(String date, String rentDuration, String color, String comment) {
        dateFields.setValue(date).sendKeys(Keys.ENTER);
        durationFields.click();
        setDropdownFieldsElementByText(rentDuration);

        if ("black".equals(color)) {
            blackColorScooterCheckBox.click();
        } else if ("grey".equals(color)) {
            greyColorScooterCheckBox.click();
        }
        commentFields.setValue(comment);
    }
}

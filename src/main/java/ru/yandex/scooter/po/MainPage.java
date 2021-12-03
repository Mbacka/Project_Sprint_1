package ru.yandex.scooter.po;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    public static String main_url = "https://qa-scooter.praktikum-services.ru/";

    //Локатор для кнопки "Заказать"
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement createOrderUpperButton;

    //Локатор нижней кнопки заказать
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement createOrderLowerButton;

    //Локатор для кнопки "Статус заказа"
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement orderStatusButton;

    //Локатор для поля "Ввода заказа"
    @FindBy(how = How.CSS, using = ".Input_Input__1iN_Z.Header_Input__xIoUq")
    private SelenideElement orderStatusInputField;

    //Локатор кнопки "Go"
    @FindBy(how = How.CSS, using = ".Button_Button__ra12g.Header_Button__28dPO")
    private SelenideElement orderStatusGoButton;

    //Локатор для логотипа Яндекс с ссылкой на главную страницу "yandex.ru"
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement yandexLogoLink;

    //Локатор для логотипа Самокат с сылкой на главную страницу "Яндекс.Самокат"
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoScooter__3lsAR")
    private SelenideElement scooterLogoLink;

    //Локатор заголовка страницы
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Header__iJKdX'][text()='Самокат ']")
    private SelenideElement homeHeaderText;

    //Локатор подзаголовка страницы
    @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E'][text()='Привезём его прямо к вашей двери,']")
    private SelenideElement subHomeHeaderText;

    //Локатор подзаголовка страницы "Вариант 2"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_SubHeader__zwi_E'][text()='Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']")
    private SelenideElement subVariationHomeHeaderText;

    //Локатор описания "Как это работает"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_ThirdPart__LSTEE']//div[@class='Home_SubHeader__zwi_E'][text()='Как это работает']")
    private SelenideElement scooterInfoText;

    //Локатор описания круг перый "Первый этап заказа"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='1']")
    private SelenideElement scooterFirstStatusCircle;

    //Локатор описания круг второй "Второй этап заказа"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='2']")
    private SelenideElement scooterSecondStatusCircle;

    //Локатор описания круг третий "Третий этап заказа"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp'][text()='3']")
    private SelenideElement scooterThirdStatusCircle;

    //Локатор описания последний круг "Последний этап заказ"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusCircle__3_aTp Home_Lineless__2-Rxp'][text()='4']")
    private SelenideElement scooterLastStatusCircle;

    //Локатор "Первый этап заказа"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Заказываете самокат']")
    private SelenideElement scooterFirstStatusText;

    //Локатор "Второй этап заказа"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Курьер привозит самокат']")
    private SelenideElement scooterSecondStatusText;

    //Локатор "Третий этап заказа"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Катаетесь']")
    private SelenideElement scooterThirdStatusText;

    //Локатор "Последний этап заказа"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH'][text()='Курьер забирает самокат']")
    private SelenideElement scooterLastStatusText;

    //Локатор чертежа самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Scooter__3YdJy']//img[@alt='Scooter blueprint']")
    private SelenideElement homeBluePrintImg;

    //Локатор кнопки "Да" в окне Cookies
    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
    private SelenideElement cookiesYesButton;


    //Локатор на первую строчку выпадающего меню
    @FindBy(how = How.CSS, using = "div[id='accordion__heading-0']")
    private SelenideElement questionsAboutTheImportantFirstTextButton;
    //Локатор на вторую строчку выпадающего меню
    @FindBy(how = How.CSS, using = "div[id='accordion__heading-1']")
    private SelenideElement questionsAboutTheImportantSecondTextButton;
    //Локатор на третью строчку выпадающего меню
    @FindBy(how = How.CSS, using = "div[id='accordion__heading-2']")
    private SelenideElement questionsAboutTheImportantThirdTextButton;
    //Локатор на четвертую строчку выпадающего меню
    @FindBy(how = How.CSS, using = "div[id='accordion__heading-3']")
    private SelenideElement questionsAboutTheImportantFourthTextButton;
    //Локатор на пятую строчку выпадающего меню
    @FindBy(how = How.CSS, using = "div[id='accordion__heading-4']")
    private SelenideElement questionsAboutTheImportantFifthTextButton;
    //Локатор на шестую строчку выпадающего меню
    @FindBy(how = How.CSS, using = "div[id='accordion__heading-5']")
    private SelenideElement questionsAboutTheImportantSixthTextButton;
    //Локатор на седьмую строчку выпадающего меню
    @FindBy(how = How.CSS, using = "div[id='accordion__heading-6']")
    private SelenideElement questionsAboutTheImportantSeventhTextButton;
    //Локатор на восьмую строчку выпадающего меню
    @FindBy(how = How.CSS, using = "div[id='accordion__heading-7']")
    private SelenideElement questionsAboutTheImportantEighthTextButton;

    //Локатор внутреннего текста первого выпадающего меню
    @FindBy(how = How.CSS, using = "#accordion__panel-0")
    private SelenideElement questionsAboutTheImportantFirstPanelText;
    //Локатор внутреннего текста  второго выпадающего меню
    @FindBy(how = How.CSS, using = "#accordion__panel-1")
    private SelenideElement questionsAboutTheImportantSecondPanelText;
    //Локатор внутреннего текста третьего выпадающего меню
    @FindBy(how = How.CSS, using = "#accordion__panel-2")
    private SelenideElement questionsAboutTheImportantThirdPanelText;
    //Локатор внутреннего текста  четвертого выпадающего меню
    @FindBy(how = How.CSS, using = "#accordion__panel-3")
    private SelenideElement questionsAboutTheImportantFourthPanelText;
    //Локатор внутреннего текста пятого выпадающего меню
    @FindBy(how = How.CSS, using = "#accordion__panel-4")
    private SelenideElement questionsAboutTheImportantFifthPanelText;
    //Локатор внутреннего текста шестого выпадающего меню
    @FindBy(how = How.CSS, using = "#accordion__panel-5")
    private SelenideElement questionsAboutTheImportantSixthPanelText;
    //Локатор внутреннего текста седьмого выпадающего меню
    @FindBy(how = How.CSS, using = "#accordion__panel-6")
    private SelenideElement questionsAboutTheImportantSeventhPanelText;
    //Локатор внутреннего текста  восьмого выпадающего меню
    @FindBy(how = How.CSS, using = "#accordion__panel-7")
    private SelenideElement questionsAboutTheImportantEighthPanelText;

    //Медод соглашения с куки
    public MainPage clickCookiesYesButton() {
        if (cookiesYesButton.isDisplayed()) {
            cookiesYesButton.click();
        }
        return page(MainPage.class);
    }

    //Метод нажатия на первую текстовую кнопку в выпадающем списке
    public MainPage clickQuestionsAboutTheImportantFirstTextButton() {
        questionsAboutTheImportantFirstTextButton.click();
        return page(MainPage.class);
    }

    //Метод нажатия на вторую текстовую кнопку в выпадающем списке
    public MainPage clickQuestionsAboutTheImportantSecondTextButton() {
        questionsAboutTheImportantSecondTextButton.click();
        return page(MainPage.class);
    }

    //Метод нажатия на третью текстовую кнопку в выпадающем списке
    public MainPage clickQuestionsAboutTheImportantThirdTextButton() {
        questionsAboutTheImportantThirdTextButton.click();
        return page(MainPage.class);
    }

    //Метод нажатия на четвертую текстовую кнопку в выпадающем списке
    public MainPage clickQuestionsAboutTheImportantFourthTextButton() {
        questionsAboutTheImportantFourthTextButton.click();
        return page(MainPage.class);
    }

    //Метод нажатия на пятую текстовую кнопку в выпадающем списке
    public MainPage clickQuestionsAboutTheImportantFifthTextButton() {
        questionsAboutTheImportantFifthTextButton.click();
        return page(MainPage.class);
    }

    //Метод нажатия на шестую текстовую кнопку в выпадающем списке
    public MainPage clickQuestionsAboutTheImportantSixthTextButton() {
        questionsAboutTheImportantSixthTextButton.click();
        return page(MainPage.class);
    }

    //Метод нажатия на седьмую текстовую кнопку в выпадающем списке
    public MainPage clickQuestionsAboutTheImportantSeventhTextButton() {
        questionsAboutTheImportantSeventhTextButton.click();
        return page(MainPage.class);
    }

    //Метод нажатия на восьмую текстовую кнопку в выпадающем списке
    public MainPage clickQuestionsAboutTheImportantEighthTextButton() {
        questionsAboutTheImportantEighthTextButton.click();
        return page(MainPage.class);
    }

    //Перебираем выпадающий список "Вопросы о важном" и проверям совпадения по тексту.
    public void viewListQuestionsAboutTheImportantFirstTextButton(String oneText, String secondText, String thirdText, String fourthText, String fifthText, String sixthText, String seventhText, String eighthText) {
        questionsAboutTheImportantFirstTextButton.click();
        questionsAboutTheImportantFirstPanelText.shouldHave(exactText(oneText));
        questionsAboutTheImportantSecondTextButton.click();
        questionsAboutTheImportantSecondPanelText.shouldHave(exactText(secondText));
        questionsAboutTheImportantThirdTextButton.click();
        questionsAboutTheImportantThirdPanelText.shouldHave(exactText(thirdText));
        questionsAboutTheImportantFourthTextButton.click();
        questionsAboutTheImportantFourthPanelText.shouldHave(exactText(fourthText));
        questionsAboutTheImportantFifthTextButton.click();
        questionsAboutTheImportantFifthPanelText.shouldHave(exactText(fifthText));
        questionsAboutTheImportantSixthTextButton.click();
        questionsAboutTheImportantSixthPanelText.shouldHave(exactText(sixthText));
        questionsAboutTheImportantSeventhTextButton.click();
        questionsAboutTheImportantSeventhPanelText.shouldHave(exactText(seventhText));
        questionsAboutTheImportantEighthTextButton.click();
        questionsAboutTheImportantEighthPanelText.shouldHave(exactText(eighthText));
    }

    //Метод нажатия на кнопку "Заказать" в верхней правой части экрана
    public OrderPage clickCreateOrderUpperButton() {
        createOrderUpperButton.click();
        return page(OrderPage.class);
    }

    //Метод нажатия на кнопку "Заказать" в верхней правой части экрана
    public OrderPage clickCreateOrderLowerButton() {
        createOrderLowerButton.click();
        return page(OrderPage.class);
    }

    //Метод нажатия на кнопку "Статус заказа" в верхней правой части экрана
    public MainPage clickOrderStatusButton() {
        orderStatusButton.click();
        return page(MainPage.class);
    }

    //Метод ввода номера в поле проверки заказа
    public void setOrderStatusInputField(String number) {
        orderStatusInputField.setValue(number);
    }

    //Метод нажатия на кнопку "Go"
    public ViewOrderPage clickOrderStatusGoButton() {
        orderStatusGoButton.click();
        return page(ViewOrderPage.class);
    }

    public YandexMainPage clickYandexLogoLink(){
        yandexLogoLink.click();
        return page(YandexMainPage.class);
    }

    //Метод проверки видимости заголовка страницы
    public void visibleHomeHeaderText(){
        homeHeaderText.shouldBe(visible);
    }

}

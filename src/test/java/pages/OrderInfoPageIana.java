package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class OrderInfoPageIana {

    public OrderInfoPageIana( ){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(text(), 'Order info' )]")
    public WebElement textOrderInfo;


    @FindBy(id = "titleDoc")
    public WebElement titleDoc;

    @FindBy(xpath = "//i[@class='fas fa-plus']")
    public WebElement plusButton;

    @FindBy(xpath = "//i[@class='fas fa-minus']")
    public WebElement minusButton;


    @FindBy(id = "documentOnline")
    public WebElement uploadBotton;

    public void uploadBottonMethod()  {
        uploadBotton.sendKeys( "/Users/ianagrytsenko/Downloads/DuoNotaryCucumber/DIP.pdf");

    }


    @FindBy(id = "defaultUnchecked")
    public WebElement checkbox;

    public void checkboxMethod(){

        if(! checkbox.isSelected() ){
            BrowserUtilities.jsClick(checkbox);
        }}



    @FindBy(xpath = "//button[contains(text(), 'Next' )]")
    public WebElement nextButton;

    @FindBy(xpath = "//button[contains (text(), 'Booked')]")
    public WebElement booked;


    @FindBy(xpath = "//button[contains(text(), 'Back' )]")
    public WebElement backButton;

    @FindBy(xpath = "//a[@href='/online']//h4")
    public WebElement enterRemoteNotarization;

    @FindBy(xpath = "//div[@style='background: url(\"/assets/img/remote-notarization.png\") center center no-repeat;']")
    public WebElement NotarizationNow;

    @FindBy(xpath = "//div[@style='background: url(\"/assets/img/traveling-notarization.png\") center center no-repeat;']")
    public WebElement Notarization_Schedule;


    @FindBy(xpath = "//i[@class='fas fa-plus']") /// can do click 10 times test
    public WebElement count_amount;

    public void titleDocMethod(){
        titleDoc.sendKeys("test title"); }

    public void count_amountMethod(){
        count_amount.click();
    }

    public void Enter_RemoteNotarizationPage(){
        enterRemoteNotarization.click(); }

    public void enterNotorization_Now() {
        NotarizationNow.click(); }

    public void enterNotorization_Scheduled() {
        Notarization_Schedule.click(); }



}

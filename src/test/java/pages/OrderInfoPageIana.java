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
        uploadBotton.sendKeys( "DIP.pdf");
       // System.getProperty(“user.dir” + IdeaProjects/DUON-B4-CucumberBDD/DIP.pdf)
    }


    @FindBy(id = "defaultUnchecked")
    public WebElement checkbox;

    public void checkboxMethod(){

        if(! checkbox.isSelected() ){
            BrowserUtilities.jsClick(checkbox);
        }}



    @FindBy(xpath = "//button[contains(text(), 'Next' )]")
    public WebElement nextButton;

    @FindBy(xpath = "//button[contains(text(), 'Back' )]")
    public WebElement backButton;



}

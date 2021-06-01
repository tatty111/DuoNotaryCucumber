package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RemoteNotarizationPage {


    public RemoteNotarizationPage( ){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@href='/online']//h4")
    public WebElement remoteNotarizationlink;


    @FindBy(xpath = "//a[@href='/inPerson']//h4")
    public WebElement travellingNotarizationlink;

    @FindBy(xpath = "//div[contains(text(), 'Location for an appointment' )]")
    public WebElement textLocationforanappointment;


    @FindBy(xpath = "//div[contains(text(), 'Select our service' )]")
    public WebElement textSelectourservice;



    @FindBy(id = "zip-code-input")
    public WebElement zipCodeInput;

    @FindBy(xpath = " //ul[@class='p-0 mt-3 list-unstyled']")
    public WebElement getAdress;


    @FindBy(xpath = "//button[contains(text(), 'Next' )]")
    public WebElement nextButton;

    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement errormessege;

    @FindBy(xpath = "//button[contains(text(), 'Close' )]")
    public WebElement closeButton;


    @FindBy(xpath = "//div[@style='background: url(\"/assets/img/traveling-notarization.png\") center center no-repeat;']")
    public WebElement scheduleLink;

    @FindBy(xpath = "//div[@style='background: url(\"/assets/img/remote-notarization.png\") center center no-repeat;']")
    public WebElement nowLink;

}

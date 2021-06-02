package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class CreateAccountPage {

    public CreateAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement userFirstName;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement userLastName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement userEmail;

    @FindBy(xpath = "//input[@name='phoneNumber']")
    public WebElement userPhoneNum;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement userPassword;

    @FindBy(xpath = "//input[@name='prePassword']")
    public WebElement userPasswordReapet;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement singInButton;


    @FindBy(xpath = "//div[@class='labelBlockModal rightControl']")
    public WebElement usercheckbox;

    @FindBy(xpath = "//span[@class='align-self-center alert-body']")
    public WebElement CongratulationsMessage;

    @FindBy(xpath = "//button[@class='ok-button align-self-end']")
    public WebElement ButtonOk;

    @FindBy(id = "5gr9b76cmd")
    public WebElement alertMsg;



}
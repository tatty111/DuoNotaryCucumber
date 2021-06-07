package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BrowserUtilities;
import utilities.ConfigReader;
import utilities.Driver;

public class Data_TimePage extends RemoteNotarizationPage  {


    public Data_TimePage(){
        PageFactory.initElements(Driver.getDriver(),this );
    }


    public void dateAndTimeSelector(int numOfDay)  {


          WebElement date = Driver.getDriver().findElement(By.xpath
                    ("//div[@class='date-col-disable times text-dark col-md-2']["+numOfDay+"]"));
          System.out.println(date.getText());

            if(! date.isSelected()){
                date.click(); }

        WebElement time = Driver.getDriver().findElement(By.xpath
                ("//div[@class='date-col-disable dates']["+numOfDay+"]"));
        System.out.println(time.getText());

            if(! time.isSelected()){
                time.click();}
    }


    @FindBy(xpath = " //div[contains(text(), 'Select Date' )]")
    public WebElement text_DataTime;


    @FindBy(xpath = "//a [contains(text(), 'Sign in' )]")
    public WebElement SignInButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='borRad']")
    public WebElement buttonNext;

    public void login(){
        SignInButton.click();
        userName.sendKeys(ConfigReader.getProperty("username"));
        password.sendKeys(ConfigReader.getProperty("password"));
        buttonNext.click();

    }








}




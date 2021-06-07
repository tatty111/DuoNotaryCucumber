package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this );
    }

    @FindBy(xpath = "//button [contains(text(), 'Accept')]")
    public WebElement popUpWindow;

    @FindBy(xpath = "//div[@class='services']//div")
    public List<WebElement> actualListOfWebelements;

    @FindBy(xpath = "//div[@class='left_wrapper']//div[contains(text(), '' )]//div")
    public List<WebElement> actualListOfWebelementsWhychooseDuoNotary;

    @FindBy(xpath = "//div[contains(text(), 'Why choose DuoNotary' )]")
    public WebElement textWhychooseDuoNotary;



    public void clickOnLink(String link){

        WebElement element = Driver.getDriver().findElement(By.xpath("//div[contains(text(),'" + link + "' )] "));
        BrowserUtilities.jsClick(element);
    }


    public void clickOnProduct(String service){
        String bb = "//div[contains(text(), '"+service+"'] )]" ;
        Driver.getDriver().findElement(By.xpath(bb)).click();

    }




}

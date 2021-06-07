package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtilities;
import utilities.Driver;

public class ChanelBagsPage {

    public ChanelBagsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//button[@type='button']//span[contains(text(), 'Search' )]")
    public WebElement searchbar;

    @FindBy(xpath = "//div[@class='products-wrapper col-s-24 col-m-24 col-l-16']")
    public WebElement moreproduct;




    @FindBy(id = "searchInput")
    public WebElement searchbarInput;

    @FindBy(id = "//span[@class='heading product-details__title ']")
    public WebElement productName;

    @FindBy(id = "//span[@class='product-details__description']")
    public WebElement productModel;

    @FindBy(id = "//span[@class='product-details__description product-details__color']")
    public WebElement productColor;

    @FindBy(id = "//div[@class='product-details__price-block']")
    public WebElement productPrice;

    @FindBy(xpath = "//span[@class='search-nav__title is-6']")
    public WebElement productInformation;








    public void InfoaboutProduct(int num){
        WebElement element = Driver.getDriver().findElement(By.xpath("//div[@class='products-wrapper col-s-24 col-m-24 col-l-16']//div[@class='product-list-inline'][" + num + "]"));
        System.out.println(element.getText());
    }

    public String priceExecutor(int num){

        WebElement element = Driver.getDriver().findElement(By.xpath
                ("//div[@class='products-wrapper col-s-24 col-m-24 col-l-16']//div[@class='product-list-inline']["
                        + num + "]//p[@class='  is-price']"));
        System.out.println(element.getText());
        return element.getText();
    }



    public String nameExecutor(int num){

        WebElement element = Driver.getDriver().findElement(By.xpath
                ("//div[@class='products-wrapper col-s-24 col-m-24 col-l-16']//div[@class='product-list-inline']["+num+"]//p[@class='product-item__description is-cropped false']//span"));
        System.out.println(element.getText());
        return element.getText();
    }

    public String productExecutor(int num){

        WebElement element = Driver.getDriver().findElement(By.xpath
                ("//div[@class='products-wrapper col-s-24 col-m-24 col-l-16']//div[@class='product-list-inline']["+num+"]" +
                        "//h4[@class='product-item__title heading is-7 is-cropped false']//span"));
        System.out.println(element.getText());
        return element.getText();
    }

    public void searchItem(String input){
        BrowserUtilities.jsClick(searchbar);
        searchbarInput.sendKeys(input + Keys.ENTER);
        BrowserUtilities.waitFor(2);
    }




}

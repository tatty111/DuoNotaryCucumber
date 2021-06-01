package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PricePageIana extends OrderInfoPageIana {

    public PricePageIana( ){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='price']")
    public WebElement price;

    @FindBy(xpath = "//div[@class='count']")
    public WebElement count;

    public void extracted(int amountOfDocs) {



        for (int i = 0; i <= amountOfDocs; i++){
            plusButton.click();
            System.out.println("Price for " + count.getText() + " doc(s) is " + price.getText());

            String actualPriceUI = price.getText().replace("$", "");

//            Integer result = Integer.parseInt(actualPriceUI);
//            System.out.println(result + 5);

//            if((Double) (Integer.parseInt(actualPriceUI) + 5.00) == Double.valueOf(actualPriceUI)){
//                System.out.print(actualPriceUI + " correct");
//            }else{
//                System.out.println("doublevalue " + Double.valueOf(actualPriceUI));
//            }


        }



    }

}

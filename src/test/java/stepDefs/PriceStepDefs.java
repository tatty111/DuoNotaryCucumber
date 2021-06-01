package stepDefs;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.OrderInfoPageIana;
import pages.PricePageIana;

public class PriceStepDefs {



    @Then("The user can clicks on plus button to get {int} quantity of a document")
    public void the_user_can_clicks_on_plus_button_to_get_quantity_of_a_document(Integer quantity) {

        new OrderInfoPageIana().plusButton.click();
        PricePageIana pricePage = new PricePageIana();
        System.out.println(pricePage.count.getText() + " doc = " + pricePage.price.getText());

    }

    @Then("The price of the product should be ${double}")
    public void the_price_of_the_product_should_be_$(Double price) {
        PricePageIana pricePage = new PricePageIana();
        System.out.println(price);
        String actual = pricePage.price.getText().replace("$", "");
        Assert.assertEquals(price, Double.valueOf(actual));

        // verify the correct price increment
        pricePage.extracted(20);


    }


}

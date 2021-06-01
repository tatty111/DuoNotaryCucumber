package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomepageTablesStepDefs {

    @Then("The following products should be displayed")
    public void the_following_products_should_be_displayed(List<String> expectedListOfProducts) {

        HomePage homePage = new HomePage();

        List<String> actualListOfProducts = BrowserUtilities.getElementsText(homePage.actualListOfWebelements);

        List<String> modifiableExpectedListOfProducts = new ArrayList<>(expectedListOfProducts);

        Collections.sort(modifiableExpectedListOfProducts);
        Collections.sort(actualListOfProducts);
        Assert.assertEquals(modifiableExpectedListOfProducts, actualListOfProducts);
    }

    @Then("The page title should be {string}")
    public void the_page_title_should_be(String title) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(title));
    }



    @Then("The following products should be displayed as")
    public void the_following_products_should_be_displayed_as(List<String> expectedListOfProducts) {
        HomePage homePage = new HomePage();

        List<String> actualListOfProducts = BrowserUtilities.getElementsText(homePage.actualListOfWebelementsWhychooseDuoNotary);

        List<String> modifiableExpectedListOfProducts = new ArrayList<>(expectedListOfProducts);

        Collections.sort(modifiableExpectedListOfProducts);
        Collections.sort(actualListOfProducts);
        Assert.assertEquals(modifiableExpectedListOfProducts, actualListOfProducts);
    }


    @Then("The page should contain text {string}")
    public void the_page_should_contain_text(String string) {
        HomePage hp = new HomePage();
        Assert.assertTrue(hp.textWhychooseDuoNotary.getText().contains("Why choose DuoNotary"));
    }



    @When("The user clicks on {string}")
    public void the_user_clicks_on(String service) {
        new HomePage().clickOnLink(service);
    }

    @Then("The link contain the relavent text of the {string}")
    public void the_link_contain_the_relavent_text_of_the(String link) {
        HomePage home = new HomePage();

        boolean contains = home.actualListOfWebelements.contains(link);
        System.out.println(contains);
        System.out.println(Driver.getDriver().getTitle());

    }


}

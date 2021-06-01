package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RemoteNotarizationPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class TravellingNotarizStepDefs {

    @When("The user navigates and clicking on TRAVELLING NOTARIZATION window")
    public void the_user_navigates_and_clicking_on_travelling_notarization_window() {
        new RemoteNotarizationPage().travellingNotarizationlink.click();
        System.out.println(Driver.getDriver().getTitle());


    }

    @Then("The user should see text {string}")
    public void the_user_should_see_text(String string) {
        RemoteNotarizationPage pageForTravelling = new RemoteNotarizationPage();
        Assert.assertTrue(pageForTravelling.textLocationforanappointment.getText().contains("Location for an appointment"));
    }

    @Then("The user can fill the {string} and click on next button")
    public void the_user_can_fill_the_and_click_on_next_button(String string) throws InterruptedException {
        RemoteNotarizationPage pageForTravelling = new RemoteNotarizationPage();
        pageForTravelling.zipCodeInput.sendKeys("11341 Crescent Dr, Fairfax, VA 22030, USA");
        pageForTravelling.getAdress.click();

        BrowserUtilities.jsClick(pageForTravelling.nextButton);
        Thread.sleep(5000);
        System.out.println(pageForTravelling.textSelectourservice.getText());
        Assert.assertTrue(pageForTravelling.textSelectourservice.getText().contains("Select our service"));
    }


}

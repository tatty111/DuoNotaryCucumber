package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.RemoteNotarizationPage;
import utilities.BrowserUtilities;
import utilities.ConfigReader;
import utilities.Driver;

public class ScheduleStepDefs {

    @Given("The user is on the homepage")
    public void the_user_is_on_the_homepage() {
        HomePage home = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        BrowserUtilities.jsClick(home.popUpWindow);
    }

    @When("The user navigates and clicking on REMOTE NOTARIZATION window")
    public void the_user_navigates_and_clicking_on_remote_notarization_window() throws InterruptedException {
        //logger.info("Verifying Title");
        RemoteNotarizationPage rn = new RemoteNotarizationPage();
        rn.remoteNotarizationlink.click();

        // verify the transfer to the page
        WebElement actualtext = Driver.getDriver().findElement(By.xpath("//div[contains(text(), 'Schedule online notary services' )] "));
        String expectedText = "Schedule online notary services";
        Assert.assertTrue( actualtext.getText().contains(expectedText));
        System.out.println("We are at the -> " + actualtext.getText());
    }

    @Then("The user should land on Schedule online notary services page")
    public void the_user_should_land_on_schedule_online_notary_services_page() {
        RemoteNotarizationPage rn = new RemoteNotarizationPage();

        if(rn.scheduleLink.isDisplayed()){
            System.out.println("-> We are at the schedule link");
        }else{
            System.out.println("Schedule is Failed");
        }

        rn.scheduleLink.click();
        System.out.println(Driver.getDriver().getTitle());
    }


    @Then("The user should land on Now online notary services page")
    public void the_user_should_land_on_now_online_notary_services_page() {
        RemoteNotarizationPage rn = new RemoteNotarizationPage();

        if(rn.nowLink.isDisplayed()){
            System.out.println("We are at the Now link");
        }else{
            System.out.println("Now link is Failed");
        }

        rn.nowLink.click();
        System.out.println(Driver.getDriver().getTitle());
    }
}

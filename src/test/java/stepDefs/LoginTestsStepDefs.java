package stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class LoginTestsStepDefs {

    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.internet().safeEmailAddress());


      //  faker.address().fullAddress()

        //
    }

    @When("The user navigates and clicking on menu button -> to be trasnfered to SING IN page")
    public void the_user_navigates_and_clicking_on_menu_button_to_be_trasnfered_to_sing_in_page() {
        LoginPage logpage = new LoginPage();
        logpage.menuButton.click();
        Assert.assertTrue(logpage.textSign.getText().contains("SIGN IN"));
    }


    @Then("The user should login successfully into his account and see the Main page with Upcoming orders")
    public void the_user_should_login_successfully_into_his_account_and_see_the_main_page_with_upcoming_orders() {
        LoginPage logpage = new LoginPage();
        logpage.login();
        BrowserUtilities.waitFor( 5);
        BrowserUtilities.jsClick(Driver.getDriver().findElement(By.xpath("//button [contains(text(), 'Accept')]")));
        Assert.assertTrue(logpage.LogOutButton.getText().contains("Log Out")); }


    // Data Provider:

    @Then("The user should fails by putting the wrong credentials {string}, {string}")
    public void the_user_should_fails_by_putting_the_wrong_credentials(String username, String password) {


    }



}

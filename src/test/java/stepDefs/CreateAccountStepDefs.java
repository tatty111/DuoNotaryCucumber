package stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CreateAccountPage;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;

import java.util.List;
import java.util.Map;

public class CreateAccountStepDefs {



    @Then("The user should click on creation of an account button")
    public void the_user_should_click_on_creation_of_an_account_button() {
        new LoginPage().createAccountButton.click();
    }

    @Then("The user should fill his data info and click sign in button")
    public void the_user_should_fill_his_data_info_and_click_sign_in_button() throws InterruptedException {
        CreateAccountPage createAccount = new CreateAccountPage();
        Faker fakeData = new Faker();
        String fakepassword = fakeData.internet().password(8,
                10,true, false,true);
        System.out.println(fakepassword);
        createAccount.userFirstName.sendKeys(fakeData.name().firstName());
        createAccount.userLastName.sendKeys(fakeData.name().lastName());
        createAccount.userEmail.sendKeys(fakeData.internet().emailAddress());
        createAccount.userPhoneNum.sendKeys(fakeData.phoneNumber().phoneNumber());
        createAccount.userPassword.sendKeys(fakepassword);
        createAccount.userPasswordReapet.sendKeys(fakepassword);

        createAccount.usercheckbox.click();
        BrowserUtilities.jsClick(createAccount.singInButton);
        Thread.sleep(2000);
    }


    @Then("The Congradulation msg should apear {string}")
    public void the_congradulation_msg_should_apear(String Msg) {
        CreateAccountPage createAccount = new CreateAccountPage();
        System.out.println(createAccount.CongratulationsMessage.getText());
        Assert.assertTrue(createAccount.CongratulationsMessage.getText().contains(Msg));
        BrowserUtilities.jsClick(createAccount.ButtonOk);
    }



    @Then("The user should pass following info and click sign in button")
    public void the_user_should_pass_following_info_and_click_sign_in_button(List<Map<String,String>> dataTable) throws InterruptedException {

        CreateAccountPage createAccount = new CreateAccountPage();

        Map<String, String> userInfo = dataTable.get(0);

        createAccount.userFirstName.sendKeys(userInfo.get("first_name"));
        createAccount.userLastName.sendKeys(userInfo.get("last_name"));
        createAccount.userEmail.sendKeys(userInfo.get("email address"));
        createAccount.userPhoneNum.sendKeys(userInfo.get("phone"));
        createAccount.userPassword.sendKeys(userInfo.get("password"));
        createAccount.userPasswordReapet.sendKeys(userInfo.get("password"));

        createAccount.usercheckbox.click();
        BrowserUtilities.jsClick(createAccount.singInButton);
        Thread.sleep(2000);
    }



    @Then("The user passes the information and the name should be correct")
    public void the_user_passes_the_information_and_the_name_should_be_correct() throws InterruptedException {
        ExcelUtils file = new ExcelUtils("MOCK_DATA.xlsx", "data");
        List<Map<String, String>> listOfMaps = file.getDataAsMap();
        System.out.println(listOfMaps);

        for (int i = 0; i < listOfMaps.size() ; i++) {

            Thread.sleep(1000);
            LoginPage logpage = new LoginPage();
            logpage.menuButton.click();
            logpage.createAccountButton.click();

            Map<String, String> map = listOfMaps.get(i);

            CreateAccountPage createAccount = new CreateAccountPage();

            createAccount.userFirstName.sendKeys(map.get("first_name"));
            createAccount.userLastName.sendKeys(map.get("last_name"));
            //createAccount.userEmail.sendKeys(map.get("email address"));
            createAccount.userEmail.sendKeys(new Faker().internet().emailAddress());
            createAccount.userPhoneNum.sendKeys(new Faker().phoneNumber().phoneNumber());

            createAccount.userPassword.sendKeys(map.get("password"));
            createAccount.userPasswordReapet.sendKeys(map.get("password"));

            createAccount.usercheckbox.click();
            BrowserUtilities.jsClick(createAccount.singInButton);

            Thread.sleep(2000);
           // System.out.println(createAccount.CongratulationsMessage.getText());
            Assert.assertTrue(createAccount.CongratulationsMessage.getText().contains("Congratulations! Your registration is almost complete, please verify your email by clicking the link we emailed you."));
            BrowserUtilities.jsClick(createAccount.ButtonOk);

        }
        }
}

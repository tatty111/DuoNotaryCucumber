package stepDefs;


import com.github.javafaker.Faker;
import com.mysql.cj.log.Log;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.internal.instrumentation.Logger;
import org.junit.Assert;
import pages.*;
import utilities.BrowserUtilities;
import utilities.Driver;

import static stepDefs.Hooks.*;

public class OrderInfoIanaStepDefs {


    @When("The user is able to click on Schedule link")
    public void the_user_is_able_to_click_on_schedule_link() {
        RemoteNotarizationPage rn = new RemoteNotarizationPage();
        rn.remoteNotarizationlink.click();

        if(rn.scheduleLink.isDisplayed()){
            System.out.println("-> We are at the schedule link");
        }else{
            System.out.println("Schedule is Failed");
        }

        rn.scheduleLink.click();
        System.out.println(Driver.getDriver().getTitle());

    }

    @Then("The user should be able to fill the Order info section and move to next section")
    public void the_user_should_be_able_to_fill_the_order_info_section_and_move_to_next_section() throws InterruptedException {
        OrderInfoPageIana orderInfo = new OrderInfoPageIana();
        if(orderInfo.textOrderInfo.isEnabled()){
            System.out.println(orderInfo.textOrderInfo.getText());
            orderInfo.titleDoc.sendKeys("test");
            orderInfo.plusButton.click();

            orderInfo.uploadBottonMethod();
            Thread.sleep(5000);
            orderInfo.checkboxMethod();
            Thread.sleep(2000);
            orderInfo.nextButton.click();
            Thread.sleep(2000);

            System.out.println(Driver.getDriver().getCurrentUrl() + " " + Driver.getDriver().getTitle());

        }else{
            System.out.println("Schedule -> Order info is Failed");
        }

    }


    @Then("Verify the Data and Time Section Day {string}")
    public void verify_the_data_and_time_section_day(String two) throws InterruptedException {


        Data_TimePage date = new Data_TimePage();
        System.out.println(date.text_DataTime.getText());
        date.dateAndTimeSelector(2);


        Thread.sleep(1000);
        new OrderInfoPage().nextButton.click();
        Thread.sleep(1000);
    }

    @Then("Verify User info section using Faker class")
    public void verify_user_info_section_using_faker_class() throws InterruptedException {
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

        createAccount.checkbox3.click();
        BrowserUtilities.jsClick(new OrderInfoPage().nextButton);

        Thread.sleep(1000);
        System.out.println(Driver.getDriver().getTitle());
//        Assert.assertTrue(new OrderInfoPage().nextButton.getText().contains("Booked"));

    }

}

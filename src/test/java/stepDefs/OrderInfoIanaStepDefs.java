package stepDefs;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OrderInfoPageIana;
import pages.RemoteNotarizationPage;
import utilities.Driver;

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

}

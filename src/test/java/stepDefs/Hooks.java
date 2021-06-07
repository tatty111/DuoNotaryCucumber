package stepDefs;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import pages.HomepagePage;
import pages.OrderInfoPage;
import utilities.BrowserUtilities;
import utilities.ConfigReader;
import utilities.Driver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Hooks {

    public WebDriver driver;



    protected static ExtentReports reporter;
    protected static ExtentSparkReporter htmlReporter;
    protected static ExtentTest logger;
    protected static int count = 1;

    @BeforeSuite(alwaysRun = true)
    public void setupSuite(){
        reporter = new ExtentReports();
        String path = System.getProperty("user.dir") + "/test-output/extentReports/index.html";
        htmlReporter = new ExtentSparkReporter(path);
        htmlReporter.config().setReportName("WEB ORDERS AUTOMATION TESTS");
        reporter.attachReporter(htmlReporter);
    }

    @Before
    public void setupScenario(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();

//        logger = reporter.createTest("TESTCASE " + count);
//        count++;

    }



//    @Before ("@db")  // this before hook will run only before the scenarios that are tagged with @db
//    public void setupDB(){
//        System.out.println("Setting up the DB");
//
//    }


    @After
    public void tearDownScenario(Scenario scenario){

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "failed_scenario");
        }

        Driver.quitDriver();
    }



}

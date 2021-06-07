package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ChanelBagsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Map;


public class ChanelBagsStepDefs {

    @Given("The user is on chanel page")
    public void the_user_is_on_chanel_page()  {
        Driver.getDriver().get(ConfigReader.getProperty("url2"));

    }



    @Then("The product details should match the info in an excel file {string} and sheet {string}")
    public void the_product_details_should_match_the_info_in_an_excel_file_and_sheet(String file, String sheet) throws Throwable {

        boolean exceptionThrown = false;
        Throwable e = null;

        ExcelUtils excelUtils = new ExcelUtils(file, sheet);

        List<Map<String, String>> dataAsMap = excelUtils.getDataAsMap();

        System.out.println(dataAsMap);



        for (int i = 0; i < dataAsMap.size(); i++) {

            System.out.println(dataAsMap.size());

            Map<String, String> row = dataAsMap.get(i);
            System.out.println(row);


            if (row.get("Execute").equalsIgnoreCase("Y")) {

                String expectedName = row.get("Model");
                String expectedPrice = row.get("Price");
                String expectedProduct = row.get("Products");

                ChanelBagsPage chanelpage = new ChanelBagsPage();
                chanelpage.searchItem("Mini Flap Bag with Handle");

                String actualPrice = chanelpage.priceExecutor(i + 1);
                String actualName = chanelpage.nameExecutor(i + 1);
                String actualProduct = chanelpage.productExecutor(i + 1);

                try {
                    assertEquals(expectedPrice, actualPrice);
                    assertEquals(expectedName, actualName);
                    assertEquals(expectedProduct, actualProduct);

                } catch (Throwable ex) {
                    e = ex;
                    exceptionThrown = true;
                    e.printStackTrace();
                    // Write FAIL to the excel file if an exception is thrown
                    excelUtils.setCellData("FAIL", "Status", i + 1);
                }

                excelUtils.setCellData("Pass", "Status", i + 1);

                Driver.getDriver().navigate().back();
                Driver.getDriver().get(ConfigReader.getProperty("url2"));
            } else { excelUtils.setCellData("Skip", "Status", i + 1); }
        }
             if(exceptionThrown){   // Manual creation of softAssert
            throw  e;}
    }
    }





Feature: Verify the Login test functions


  Background:
#    Given The user is on the homepage


  Scenario: Verify the positive Login test
    When The user navigates and clicking on menu button -> to be trasnfered to SING IN page
    Then The user should login successfully into his account and see the Main page with Upcoming orders



  Scenario: Verify the negative Login test
    When The user navigates and clicking on menu button -> to be trasnfered to SING IN page
    Then The user should fails by putting the wrong credentials "username", "password"

#     @Test (dataProvider =  "getData")
#    public void placeOrder(String name, String address, String city, String state, String zipcode,
#                            String cardNo, String expiry){
#        int random = (int) (1+ (Math.random() * 99));
#        String str = String.valueOf(random);
#        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(Keys.BACK_SPACE);
#        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(str);
#
#        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(name);
#        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(address);
#        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(city);
#        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(state);
#        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zipcode);
#        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
#        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys( cardNo);
#        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys(expiry);
#        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
#        Assert.assertTrue(driver.getPageSource().contains("New order has been successfully added"));
#    }
#
#
#    @DataProvider
#    public Object[][] getData(){
#
#        return new Object[][]{
#                {"Fatih", "8607 Westwood Center Dr", "Vienna", "VA", "22152", "34215453241544235", "09/23"},
#                {"Fuad", "123 Main st", "Chantilly", "VA", "22356", "4352144525141221", "10/20"},
#                {"Isa", "1600 Pennsylvania Ave", "Washington", "DC", "20000", "5813921898318213", "10/30"},
#                {"Derya", "Yenibosna", "Bahçelievler", "Istanbul", "54281", "7826183678623871", "10/50"},
#        };
#    }







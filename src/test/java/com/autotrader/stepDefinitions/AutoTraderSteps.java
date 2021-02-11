package com.autotrader.stepDefinitions;

import com.autotrader.Pages.AdvancedSearchPage;
import com.autotrader.Pages.AutoTraderPage;
import com.autotrader.Pages.BasePage;
import com.autotrader.utilities.MyDriver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;
//import org.testng.annotations.Test;   right click tetsng.xml doc and test ng deneme run as testng suit

public class AutoTraderSteps {
    //in order to reach objects in AutoTraderPage and AdvancedSearchPage
    //We created those pages object
    //or we can also extend those pages but this is a better practice
    AutoTraderPage autoTraderPage=new AutoTraderPage();
    AdvancedSearchPage advancedSearchPage=new AdvancedSearchPage();


// @Test
    @Given("User is in landing page")
    public void user_is_in_landing_page() {
        System.out.println("Landing Page");
        String actualTitle= MyDriver.get().getTitle();
        String expectedTitle="Used and New Car Sales, Review - Autotrader";

       try {
           Assert.assertEquals(expectedTitle,actualTitle);   //testNG de actual,expected
       }
       catch (Exception e){
           System.out.println("Title verification failed");
       }



    }

    @Then("Verify that {string} are present")
    public void verify_that_are_present(String expected) {
        autoTraderPage.verification(expected);


    }

    @Then("verify that search button is present.")
    public void verify_that_search_button_is_present() {
        autoTraderPage.searchButton();

    }

    @Then("verify that {string} and {string} is visible")
    public void verify_that_and_is_visible(String make, String model) {
autoTraderPage.verifyMakeAndModel(make,model);
    }


    //second scenario starts
    @Given("User click Advance Search link on the home page")
    public void user_click_Advance_Search_link_on_the_home_page() {
        BasePage.clearCookiees();
        advancedSearchPage.advancedSearchClick();
       BasePage.wait2();

    }

    @Then("User enter {string} in the zip code text box")
    public void user_enter_in_the_zip_code_text_box(String zipcode) {

        advancedSearchPage.zipcode(zipcode);
    }

    @Then("User select {string} check box under {string}")
    public void user_select_check_box_under(String string, String string2) {
advancedSearchPage.verifyClickCertifiedAndConvertable(string2);

    }

    @Then("user update Year {string} to {string}")
    public void user_update_Year_to(String from, String to) {
        advancedSearchPage.updateYear(from,to);

    }

    @Then("user select {string} car from Make,Model and Trim section")
    public void user_select_car_from_Make_Model_and_Trim_section(String vehicle) {
     advancedSearchPage.selectVehicle(vehicle);
    }

    @Then("User clicks Search button")
    public void user_clicks_Search_button() {
advancedSearchPage.clickSearch();
    }

    @Then("User verifies that he is in result page")
    public void user_verifies_that_he_is_in_result_page() {

    }

    @Then("User verifies that he sees only {string} cars in listing")
    public void user_verifies_that_he_sees_only_cars_in_listing(String car) {
       advancedSearchPage.VerifyThereIsOnlySelectedVehicle(car);

    }

    @Then("Display in console, the number of cars listed in result page")
    public void display_in_console_the_number_of_cars_listed_in_result_page() {
        advancedSearchPage.verifyNumberOfBMW();
    }

    @Given("choose make as {string}")
    public void choose_make_as(String make) {

        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        autoTraderPage.multiplechoice(make);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}

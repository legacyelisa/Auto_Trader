package com.autotrader.Pages;

import com.autotrader.utilities.MyDriver;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AdvancedSearchPage extends BasePage {

    @FindBy(xpath = "//a[normalize-space()='Advanced Search']")
    public WebElement clickAdvancedSearch;
    @FindBy(xpath = "//input[@id='zip54245187']")
    public WebElement enterZipcode;
    @FindBy(xpath = "//div[contains(text(),'Certified')]")
    public WebElement selectCertified;
    @FindBy(xpath = "//div[normalize-space()='Convertible']")
    public WebElement selectConvertable;
    @FindBy(xpath = "//select[@id='4101482096']")
    public WebElement selectFrom;
    @FindBy(xpath = "//select[@id='258002540']")
    public WebElement selectTo;
    @FindBy(xpath = "//select[contains(@name,'makeFilter0')]")
    public WebElement selectBMW;
    @FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-block')]")
    public WebElement clickSearchButton;

    @FindBy(xpath = "//title[contains(text(),'Certified BMW Convertibles for Sale')]")
    public WebElement userInPage;

    @FindBy(xpath = "//h2[contains(@data-cmp,'subheading')]")
    public WebElement onlyBMW;

    @FindBy(xpath = "//div[contains(@data-cmp,'inventoryListing')]")
    public WebElement numberOfBMW;

    public void advancedSearchClick() {
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickAdvancedSearch.click();
        BasePage.wait2();

    }

    public void zipcode(String zip) {
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        enterZipcode.sendKeys("3004");
        BasePage.wait2();

    }

    public void verifyClickCertifiedAndConvertable(String a) {

        if (a.equals(selectCertified.getText())) {
            selectCertified.click();
            BasePage.wait2();
        } else {
            WebElement link = selectConvertable;
            scrollDown(link);
            selectConvertable.click();
            BasePage.wait2();


        }

    }

    public void updateYear(String from, String to) {
        MyDriver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select select = new Select(selectFrom);
        select.selectByValue(from);
        Select select1 = new Select(selectTo);
        select1.selectByValue(to);
        BasePage.wait2();


    }

    public void selectVehicle(String vehicle) {
        Select select = new Select(selectBMW);
        select.selectByValue(vehicle);
        BasePage.wait2();
    }

    public void clickSearch() {
        WebElement link = clickSearchButton;
        scrollDown(link);
        clickSearchButton.click();
        BasePage.wait2();


    }
/*

After search button
 */

    /**
     * After clicking search button
     * We are verifying that result is correct
     */

    //Verifying the title that we are in result page.
    public void VerifyUsersInPage() {

        userInPage.getText();
    }

    //Verifying that in result page there is no other car results come.
    public void VerifyThereIsOnlySelectedVehicle(String car) {
        //Storing all the results in List and comparing all the results not contains BMW
        List<WebElement> list = MyDriver.get().findElements(By.xpath("//h2[contains(@data-cmp,'subheading')]"));
        int count = 0;
        int NonBMWcount = 0;
        for (WebElement each : list) {
            if (!each.getText().contains(car)) {
                System.out.println("We found non BMW listing " + NonBMWcount);
            }
            count++;
        }
        System.out.println("We found " + count + " BMW listing and There is no non BMW listing");
    }


    //Counting how many listing result displayed.
    public void verifyNumberOfBMW() {

        List<WebElement> list = MyDriver.get().findElements(By.xpath("//div[contains(@data-cmp,'inventoryListing')]"));

        System.out.println("Number of BMW listed in result page is :" + list.size());

        int actual = list.size();
        String expected = MyDriver.get().findElement(By.xpath("//div[@class='results-text-container text-size-200']")).getText();
        System.out.println(expected);

        String[] arr = expected.split(" ");
        //System.out.println(arr[2]);
        int expectedResult = Integer.parseInt(arr[2]);
        Assert.assertEquals("Assertion failed", expectedResult, actual);
    }


}

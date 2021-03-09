package com.autotrader.Pages;

import com.autotrader.utilities.MyDriver;

import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class AutoTraderPage {

    /**
 * Locators           -=-
 */
@FindBy(xpath = "//button[contains(@title,'Browse by Make')]")
public WebElement browseByMake;

    @FindBy(xpath = "//button[contains(@title,'Browse by Style')]")
    public WebElement browseByStyle;

    @FindBy(xpath = "//a[contains(text(),'Advanced Search')]")
    public WebElement advanceSearch;

    @FindBy(xpath = "//button[@id='search']")
    public WebElement searchButton;


    @FindBy(xpath = "//select[@id='makeCode65900']")
    public WebElement makeElement;

    @FindBy(xpath = "//select[@id='ModelCode']']")
    public WebElement modelElement;
//find by kullanmak icin PageFactory kullanmamiz lazim

//constructor icinde yazmaliyiz
    //tum page sayfalarinda kullanilmali ki findby kullanilabilsin
    //for initialize the @FindBy annotations
    public AutoTraderPage(){
        PageFactory.initElements(MyDriver.get(),this);    // base page e eklersek,her page classda initialize etmemize gerek kalmayacak

    }


    //Verifying the make,style and advance search elements visibility.
    public void verification(String expected) {


        if (expected.equals(browseByMake.getText())) {
            String actual = browseByMake.getText();
            Assert.assertEquals(expected, actual);

        } else if (expected.equals(browseByStyle.getText())) {
            String actual = browseByStyle.getText();
            Assert.assertEquals(expected, actual);

        } else {
            String actual = advanceSearch.getText();
            Assert.assertEquals(expected, actual);

        }

    }

    //Verifying the search button
    public void searchButton(){


        Assert.assertTrue(searchButton.isEnabled());

    }



    //Verifying the Make and Model dropdowns  are visible

    public void verifyMakeAndModel(String make,String model ){
        Assert.assertTrue(makeElement.isDisplayed());
        Assert.assertTrue(modelElement.isDisplayed());



    }
    public void multiplechoice(String model){

        makeElement.sendKeys(model);
    }




}


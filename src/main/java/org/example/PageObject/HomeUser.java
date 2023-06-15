package org.example.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeUser {

    public static WebDriver driver;
    public HomeUser(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//h1[.='Service NSW makes it easier to find government information and services']")
    private WebElement verifyHomePage;

    public String setVerifyHomePage(){
        return verifyHomePage.getText();
    }

    @FindBy(xpath = "//a[.='Order special number plates']")
    private WebElement verifySearchPage;

    public String setVerifySearchPage(){
        return verifySearchPage.getText();
    }

    @FindBy(xpath = "//section[@class='personalised-content']/div[@class='region']/div[1]//input[@name='q']")
    private WebElement fieldSearch;

    public void setFieldSearch(String search){
        fieldSearch.click();
        fieldSearch.sendKeys(search);
    }


    @FindBy(xpath = "//section[@class='personalised-content']/div[@class='region']/div[1]//button[@class='button button--primary']")
    private  WebElement buttonSearch;

    public void setButtonSearch(){
        buttonSearch.click();
    }

    @FindBy(xpath = "//ul[@class='MainNav__list-peZtddYtxn']/li[.='Find locations']")
    private  WebElement buttonMenuLocation;

    public void setButtonMenuLocation(){
        buttonMenuLocation.click();
    }


    @FindBy(xpath = "//input[@id='locatorTextSearch']")
    private  WebElement getFieldSearchLocation;

    public void setGetFieldSearchLocation(String location){
        getFieldSearchLocation.clear();
        getFieldSearchLocation.sendKeys(location);
    }

    @FindBy(css = ".button--primary")
    private  WebElement getButtonSearchLocation;

    public void setButtonSearchLocation(){
        getButtonSearchLocation.click();

    }
}

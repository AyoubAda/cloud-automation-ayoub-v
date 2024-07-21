package com.cloud_automation.pages;

import com.cloud_automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChChProfile_Page {

    public ChChProfile_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='avatardiv avatardiv-shown']")
    public WebElement profileIcon;

    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement settings;

    @FindBy(xpath = "//span[.='Personal info']")
    public WebElement personalInfo;

    @FindBy(xpath = "//span[@title='Employee1']")
    public WebElement userName;

    @FindBy(id = "displayname")
    public WebElement fullName;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputBox;

    @FindBy(id = "languageinput")
    public WebElement languageInputBox;


}

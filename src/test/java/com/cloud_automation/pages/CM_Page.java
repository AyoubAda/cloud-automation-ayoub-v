package com.cloud_automation.pages;

import com.cloud_automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CM_Page {

    public CM_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@aria-label='Actions'][1]")
    public WebElement actionsButton;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']")
    public WebElement dayButton;

    @FindBy(xpath = "//a[@class='fc-col-header-cell-cushion ']")
    public WebElement dayHeaderDate;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-week']")
    public WebElement weekButton;

    @FindBy(xpath = "//span[.='Week']")
    public WebElement weekHeaderDate;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-module']")
    public WebElement monthButton;

    @FindBy(xpath = "//span[.='Month']")
    public WebElement monthHeaderDate;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEventButton;

    @FindBy(xpath = "//div[@class='fc-event-title fc-sticky']")
    public WebElement eventTitle;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='fc-event-title fc-sticky']")
    public WebElement eventTestTitle;




}

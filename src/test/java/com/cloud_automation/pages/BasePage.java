package com.cloud_automation.pages;


import com.cloud_automation.utilities.BrowserUtils;
import com.cloud_automation.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li[@data-id='dashboard'])[1]")
    public WebElement dashboard;

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    public WebElement files;

    @FindBy(xpath = "(//a[@aria-label='Photos'])[1]")
    public WebElement photos;

    @FindBy(xpath = "(//a[@aria-label='Activity'])[1]")
    public WebElement activity;

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talk;

    @FindBy(xpath = "(//a[@aria-label='Contacts'])[1]")
    public WebElement contacts;

    @FindBy(xpath = "(//a[@aria-label='Circles'])[1]")
    public WebElement circles;

    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement calendar;



 

    @FindBy(xpath = "(//a[@aria-label='Deck'])[1]")
    public WebElement deck;


    @FindBy(xpath = "//span[@aria-label='Magnify icon']")
    public WebElement searchIcon;

    @FindBy(xpath = "//div[@aria-label='Notifications']")
    public WebElement notification;

    @FindBy(xpath = "//div[@id='contactsmenu']")
    public WebElement searchContacts;

    @FindBy(xpath = "//div[@id='expand']")
    public WebElement userIcon;



    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */
    public void navigateToModule(String tab, String module) {
        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";

        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.getDriver().findElement(By.xpath(tabLocator));
            new Actions(Driver.getDriver()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  5);
        }
    }



}

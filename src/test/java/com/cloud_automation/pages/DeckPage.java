package com.cloud_automation.pages;

import com.cloud_automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckPage extends BasePage{

    public DeckPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@title='Add board']")
    public WebElement addBoard;

    @FindBy(xpath = "//input[@placeholder='Board name']")
    public WebElement boardNameInputBox;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement arrowSubmitButton;

    @FindBy(xpath = "//span[@title='hello']")
    public WebElement newBoardDisplayed;

    @FindBy(xpath = "//div[@id='stack-add']")
    public WebElement addPlusButton;

    @FindBy(xpath = "(//input[@placeholder='List name'])[1]")
    public WebElement listNameInputBox;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement listNameArrowSubmitButton;

    @FindBy(css = "h3.stack__title.has-tooltip")
    public WebElement listDisplayed;

    @FindBy(xpath = "(//button[@rel='noreferrer noopener'])[4]")
    public WebElement plusAddCardButton;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardNameInputBox;

    @FindBy(xpath = "//input[@placeholder='Card name']")
    public WebElement cardNameArrowSubmitButton;

    @FindBy(xpath = "//div[@class='card-upper']")
    public WebElement cardDisplayed;


    @FindBy(xpath = "//a[@id='details']")
    public WebElement detailsOfTheCard;

    @FindBy(xpath = "//button[@aria-controls='menu-xnpkc']")
    public WebElement threeDotsMenu;

    @FindBy(xpath = "//ul[@id='menu-xnpkc']")
    public WebElement dropdownOfgThreeDotsMenu;

    @FindBy(xpath = "//span[.='Assign to me']")
    public WebElement assignToMeOption;

    @FindBy(xpath = "//div[@class='avatar-list']")
    public WebElement userProfileIcon;


}

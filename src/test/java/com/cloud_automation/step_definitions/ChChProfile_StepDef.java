package com.cloud_automation.step_definitions;

import com.cloud_automation.pages.ChChProfile_Page;
import com.cloud_automation.utilities.BrowserUtils;
import com.cloud_automation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ChChProfile_StepDef {

    ChChProfile_Page chChProfilePage = new ChChProfile_Page();

    @Given("user clicks on the profile icon")
    public void user_clicks_on_the_profile_icon() {

        BrowserUtils.waitForClickablility(chChProfilePage.profileIcon,10);
        chChProfilePage.profileIcon.click();

    }
    @Then("user clicks on the settings button")
    public void user_clicks_on_the_settings_button() {

        BrowserUtils.waitForClickablility(chChProfilePage.settings,10);
        chChProfilePage.settings.click();

    }
    @Then("personal info should be displayed")
    public void personal_info_should_be_displayed() {

        BrowserUtils.waitForVisibility(chChProfilePage.personalInfo,10);
        chChProfilePage.personalInfo.isDisplayed();
    }
    @Then("the full name should be the same with the {string}")
    public void the_full_name_should_be_the_same_with_the_user_name(String expectedUserName) {


        String fullName = chChProfilePage.fullName.getAttribute("value");

        Assert.assertEquals(expectedUserName, fullName);

    }

    @And("user should be able to enter a proper e-mail to Email input box")
    public void userShouldBeAbleToEnterAProperEMailToEmailInputBox() {

        chChProfilePage.emailInputBox.sendKeys("abc@gmail.com");
    }

    @And("user clicks on the language dropDownList")
    public void userClicksOnTheLanguageDropDownList() {

        chChProfilePage.languageInputBox.click();
    }

    @And("user should be able to select a language from the dropDownList")
    public void userShouldBeAbleToSelectALanguageFromTheDropDownList() {

        Select select = new Select(chChProfilePage.languageInputBox);
        select.selectByValue("en");
    }
}

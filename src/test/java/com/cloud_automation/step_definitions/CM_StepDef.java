package com.cloud_automation.step_definitions;


import com.cloud_automation.pages.BasePage;
import com.cloud_automation.pages.CM_Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CM_StepDef {

    BasePage basePage = new BasePage() {};
    CM_Page cmPage = new CM_Page();

    @Given("the user clicks on calender module")
    public void the_user_clicks_on_calender_module() {

        basePage.calendar.click();
    }

    @Then("the user clicks on the actions button")
    public void theUserClicksOnTheActionsButton() {

        cmPage.actionsButton.click();
    }

    @Then("the user clicks on the daily calender view")
    public void the_user_clicks_on_the_daily_calender_view() {

        cmPage.dayButton.click();

    }

    @Then("the user should see the daily calender view displayed")
    public void the_user_should_see_the_daily_calender_view_displayed() {

        cmPage.dayHeaderDate.isDisplayed();

    }


    @Then("the user clicks on the weekly calender view")
    public void theUserClicksOnTheWeeklyCalenderView() {

        cmPage.weekButton.click();

    }

    @And("the user should see the weekly calender view displayed")
    public void theUserShouldSeeTheWeeklyCalenderViewDisplayed() {


        cmPage.weekHeaderDate.isDisplayed();

    }

    @Then("the user clicks on the monthly calender view")
    public void theUserClicksOnTheMonthlyCalenderView() {

        cmPage.monthButton.click();

    }

    @And("the user should see the monthly calender view displayed")
    public void theUserShouldSeeTheMonthlyCalenderViewDisplayed() {

        cmPage.monthHeaderDate.isDisplayed();

    }

    @Given("user clicks on new event button")
    public void userClicksOnNewEventButton() {


        cmPage.newEventButton.click();
    }

    @Then("user should see event detail icon pops-up having \\(Event Title,date from-to, All day check box, more&save buttons)")
    public void userShouldSeeEventDetailIconPopsUpHavingEventTitleDateFromToAllDayCheckBoxMoreSaveButtons() {


        cmPage.eventTitle.isDisplayed();

    }

    @Then("user should be able to fill out the event detail and click on the save button")
    public void userShouldBeAbleToFillOutTheEventDetailAndClickOnTheSaveButton() {

        cmPage.saveButton.click();
    }

    @And("user should see an event created on the related day through the Monthly Calendar view")
    public void userShouldSeeAnEventCreatedOnTheRelatedDayThroughTheMonthlyCalendarView() {

        cmPage.eventTestTitle.isDisplayed();


    }


}

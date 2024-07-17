package com.cloud_automation.step_definitions;


import com.cloud_automation.pages.LoginPage;
import com.cloud_automation.utilities.ConfigurationReader;
import com.cloud_automation.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.getDriver().get("http://qa2.trycloud.net/");
    }

    @Given("user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {

        loginPage.login(username, password);

    }
}

package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_accountbutton
{

    Homepage homepage = new Homepage();

    @Given("^user is on the argos homepage$")
    public void user_is_on_the_argos_homepage() throws Throwable {
        homepage.getHomePageURL();
    }

    @When("^user clicks on account button$")
    public void user_clicks_on_account_button() throws Throwable {
        homepage.ClickButton();
    }

    @Then("^user can see the account details$")
    public void user_can_see_the_account_details() throws Throwable {

    }
}

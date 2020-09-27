package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Resultpage;

public class Resultpage1_nikeresults
{

    Resultpage resultpage = new Resultpage();

    @Given("^User is on the nike result page$")
    public void user_is_on_the_nike_result_page() throws Throwable {

    }

    @When("^User clicks on the travel category$")
    public void user_clicks_on_the_travel_category() throws Throwable {
        resultpage.TravelClick();
    }

    @Then("^User can see the travel category products$")
    public void user_can_see_the_travel_category_products() throws Throwable {

    }
}

package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.BaseClassPackage.DriverFactory;
import org.example.PageObject.Resultpage;

public class ArgosPriceList
{
    Resultpage resultpage = new Resultpage();

    @Given("^User is already on the nike result page$")
    public void user_is_already_on_the_nike_result_page() throws Throwable {

    }

    @When("^User clicks on the (\\d+)-(\\d+) pounds$")
    public void user_clicks_on_the_pounds(int arg1, int arg2) throws Throwable {
        resultpage.PriceClick();

    }

    @Then("^User can see all the products in that range$")
    public void user_can_see_all_the_products_in_that_range() throws Throwable {

    }
}

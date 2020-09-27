package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Resultpage;

public class Resultpage_pricerange
{
    Resultpage resultpage = new Resultpage();

    @When("^user clicks on the (\\d+)-(\\d+) pounds$")
    public void user_clicks_on_the_pounds(int arg1, int arg2) throws Throwable {
        resultpage.Price1Click();
    }

    @Then("^user can se all the products in the given range$")
    public void user_can_se_all_the_products_in_the_given_range() throws Throwable {
        resultpage.Price1URL();
    }
}

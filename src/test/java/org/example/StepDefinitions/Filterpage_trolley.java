package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Filterpage;

public class Filterpage_trolley
{
    Filterpage filterpage = new Filterpage();

    @When("^user clicks on the add to trolley button of Nike Lean Armbands$")
    public void user_clicks_on_the_add_to_trolley_button_of_Nike_Lean_Armbands() throws Throwable {
filterpage.TrolleyClick();
    }

    @When("^user clicks on go to trolley button$")
    public void user_clicks_on_go_to_trolley_button() throws Throwable {
filterpage.TrolleyClick1();
    }

    @Then("^user should be able to see the product in the basket$")
    public void user_should_be_able_to_see_the_product_in_the_basket() throws Throwable {
filterpage.BasketpageURL();
    }
}

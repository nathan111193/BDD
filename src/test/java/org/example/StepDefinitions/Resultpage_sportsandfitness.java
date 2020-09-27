package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Resultpage;

public class Resultpage_sportsandfitness
{
    Resultpage resultpage = new Resultpage();

    @When("^User clicks on the sports and fitness button$")
    public void user_clicks_on_the_sports_and_fitness_button() throws Throwable {
        resultpage.SportsandFitnessClick();

    }

    @Then("^User can see all the products related to it$")
    public void user_can_see_all_the_products_related_to_it() throws Throwable {
        resultpage.SportsandFitnessURL();

    }
}

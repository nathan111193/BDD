package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Icelandhomepage;

public class Icelandsearchbox
{
    Icelandhomepage icelandhomepage = new Icelandhomepage();

    @Given("^user is on the homepage of the Iceland website$")
    public void user_is_on_the_homepage_of_the_Iceland_website() throws Throwable {
        icelandhomepage.icelandhomepage();
    }

    @When("^user types crisps in the searchbox$")
    public void user_types_crisps_in_the_searchbox() throws Throwable {
icelandhomepage.icelandsearch();
    }

    @Then("^user will see the results$")
    public void user_will_see_the_results() throws Throwable {
icelandhomepage.icelandurl();
icelandhomepage.selection();
    }
}

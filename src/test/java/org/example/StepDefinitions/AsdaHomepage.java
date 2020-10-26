package org.example.StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Asdahomepage;

public class AsdaHomepage
{
    Asdahomepage asdahomepage = new Asdahomepage();
    @Given("^user is on the homepage$")
    public void user_is_on_the_homepage() throws Throwable {

    }

    @When("^user enters cake$")
    public void user_enters_cake() throws Throwable {
        asdahomepage.searchtask();
        asdahomepage.list();
    }

    @Then("^user will be able to see the results$")
    public void user_will_be_able_to_see_the_results() throws Throwable {

    }
}

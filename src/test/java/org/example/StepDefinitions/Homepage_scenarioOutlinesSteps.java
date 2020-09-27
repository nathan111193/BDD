package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_scenarioOutlinesSteps
{
    Homepage homepage = new Homepage();

    @When("^user search for\"([^\"]*)\"$")
    public void user_search_for(String item) throws Throwable {
        homepage.multipleSearch(item);//item needs to be added with String
    }

    @Then("^user can see multiple products$")
    public void user_can_see_multiple_products() throws Throwable {

    }
}

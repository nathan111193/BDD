package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Resultpage_DoubleOutput
{
    Homepage homepage = new Homepage();

    @When("^user search for \"([^\"]*)\"$")
    public void user_search_for(String product) throws Throwable {
       homepage.doublesearch(product);
    }

    @Then("^user can see multiple items$")
    public void user_can_see_multiple_items() throws Throwable {

    }
}

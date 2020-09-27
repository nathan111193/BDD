package org.example.StepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObject.Homepage;

public class Homepage_wishlistbutton
{

    Homepage homepage = new Homepage();

    @When("^user clicks on the wishlist button$")
    public void user_clicks_on_the_wishlist_button() throws Throwable {
        homepage.WishlistClick();
    }

    @Then("^user should be able to see wishlist items$")
    public void user_should_be_able_to_see_wishlist_items() throws Throwable {
        homepage.WishlistResultURL();
    }
}

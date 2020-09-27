Feature: Filterpage functionality

  Background:
    Given User is on the homepage of the Argos website
    When User types any product to search in the search box and clicks on the search button
    Then User should be able to see all the products related to search
    Given User is on the nike result page
    When User clicks on the sports and fitness button
    Then User can see all the products related to it

    @sanity
    Scenario: Add to Basket functionality
      When user clicks on the add to trolley button of Nike Lean Armbands
      And user clicks on go to trolley button
      Then user should be able to see the product in the basket
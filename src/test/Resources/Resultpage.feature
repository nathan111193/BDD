Feature: Resultpage functionality

  Background:
    Given User is on the homepage of the Argos website
    When User types any product to search in the search box and clicks on the search button
    Then User should be able to see all the products related to search

    @smoke
    Scenario: travel category
    Given User is on the nike result page
    When User clicks on the travel category
    Then User can see the travel category products


      @smoke
      Scenario: price category
        Given User is already on the nike result page
        When User clicks on the 5-10 pounds
        Then User can see all the products in that range

        @regression
        Scenario: Sports and Fitness functionality
          Given User is on the nike result page
          When User clicks on the sports and fitness button
          Then User can see all the products related to it

          @sanity
          Scenario: 15-20  pound functionality
            Given User is on the nike result page
            When user clicks on the 15-20 pounds
            Then user can se all the products in the given range



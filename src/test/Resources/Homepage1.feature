Feature: Homepage Functionality

  @smoke
  Scenario: SearchBox Functionality
    Given User is on the homepage of the Argos website
    When User types any product to search in the search box and clicks on the search button
    Then User should be able to see all the products related to search


    @regression
    Scenario: Account button functionality
      Given user is on the argos homepage
      When user clicks on account button
      Then user can see the account details

      @sanity
      Scenario: Wishlist button functionality
        Given User is on the homepage of the Argos website
        When user clicks on the wishlist button
        Then user should be able to see wishlist items

        @Multipleinput
        Scenario Outline: Search for multiple products
          Given User is on the homepage of the Argos website
          When user search for"<products>"
          Then user can see multiple products
          Examples:
          |products|
          |nike    |
          |puma    |


          @DoubleOutput
          Scenario Outline: Enter multiple products
            Given User is on the homepage of the Argos website
            When user search for "<items>"
            Then user can see multiple items
            Examples:
            |items|
            |rado |
            |armani|



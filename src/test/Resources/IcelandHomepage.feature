Feature: Iceland homepage

  @sanity
  Scenario: Check search functionality
    Given user is on the homepage of the Iceland website
    When user types crisps in the searchbox
    Then user will see the results
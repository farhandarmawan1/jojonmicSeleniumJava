@Test
Feature: user search service
  As user want to search service


  Background:
    Given user already on home page

  Scenario: user search service nsw gov
    When user search service "Apply for a number plate"
    And user click button search
    Then user succesfully search Apply for number plate and go to page search

    Scenario Outline: User search location service nsw gov
      When user click menu Find location
      Then user fill field location "<location>">
      And click button location
      Examples:
        | location                     |
        | Sydney 2000                  |
        | Sydney Domestic Airport 2020 |


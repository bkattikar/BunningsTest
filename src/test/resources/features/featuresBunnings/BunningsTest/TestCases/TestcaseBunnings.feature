Feature: Search gardening tools

  Scenario Outline:  Search and Verify gardening tools
    Given I login to Bunnings Home Page
    When I search "<gardenTools>" in the search box
    Then I click on "search" button

    Examples:
      | gardenTools    |
      | garden tools   |



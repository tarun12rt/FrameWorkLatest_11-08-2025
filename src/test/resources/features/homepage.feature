@HomePage
Feature: homepage

  @header
  Scenario: Verify Header
    Given I launch the URL
    Then I verify "logo" on page header
    Then I verify "search icon" on page header
    Then I verify "Shop Button" on page header
    Then I verify "My Account Button" on page header
    Then I verify "Test Cases Button" on page header
    Then I verify "AT Site Button" on page header
    Then I verify "Demo Site Button" on page header
    Then I verify "Add to cart Button" on page header

  @hp
  Scenario: Verify Banner
    Given I launch the URL on "Chrome" Browser
    Then I verify banner on homepage



Feature: Registration
  Background:
    Given I enter url as "https://www.uk.rs-online.com"

  Scenario: Positive Scenario. Verify registration with valid details
   # Given I enter url as "https://www.uk.rs-online.com"
    When I click on register button
    Given I enter Username as "hdarji2000"
    Given I enter Password as "Harshad18"
    Given I enter RetypePassword as "Harshad18"
    When I select "Mr" from Title drop down box
    Given I enter Firstname as "Harshad"
    Given I enter Surname as "Darji"
    Given I enter ContactNumber as "07737596062"
    Given I enter Emailadd as "harsh_124@hotmail.com"
    When I select "others" from what role do you play drop down box
    And I select "others" from where did you hear about us  drop down box
    And I click on By email box
    And I click Register button on Registration page
    Then I should see Welcome Harshad Text
    And I should see url as "https://uk.rs-online.com/web/register/registration"

    Scenario: Valid Signin with proper login credentials
      When I click Login button
      Given I enter Username as "hdarji2000" on Login page
      And I enter Password as "Harshad18" on Login page
      When I click Login button on Login page
      Given I enter in search box as"LR44"
      When I click searh button
      And I click on Add to Basket
      And I click on Basket button
      Then I should see My Basket Text


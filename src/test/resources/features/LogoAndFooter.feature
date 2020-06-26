#Author:abdellahallouche112@gmail.com
@sprint1
Feature: Logo

  @smoke
  Scenario: Validate Logo Picture
    When user navigate to action ben jerry page
    Then user should see the image displayed

  @smoke
  Scenario: Footer menu view for user
    When user navigate to action ben jerry page
    Then user see footer menu is displayed
      | Contact Us | Franchise | Press | Jobs | Terms & Conditions | Privacy Policy | Sitemap | AdChoices |

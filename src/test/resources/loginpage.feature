@tag
Feature: testing the facebook application
  I want to use this template for my feature file

  Background: To check the facebook functionality
    Given user launches the browser and launches facebook application
    When user enter username and password and User clicks login button
    Then user navigates to homepage

  @tag2
  Scenario: To validate the notification
    Given User click the notification
    When user navigate to notification page
    Then user check recent notification

  @tag3
  Scenario: To validate the setting
    Given User click the setting
    When user navigate to setting page
    Then user change the setting

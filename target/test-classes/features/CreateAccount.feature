Feature: Create a account on http://automationpractice.com/index.php

  Background:
    Given User Access the My Store web page

    Scenario: User wants the Sign In the Application
      Given Users is in the Home of the Application
      When User clicks on Sig In option
      Then User should see the "AUTHENTICATION" page

    Scenario: User wants to create account
      Given User is at the AUTHENTICATION page
      When User informs an email Address at the Create an account Option
        And User clicks on the Create Account button
      Then User should see the "CREATE AN ACCOUNT" page
      When User fill all the fields with random data
        And User clicks on the Register button
      Then User should see the "MY ACCOUNT" page

    Scenario: User wants to Log In the Application
      Given User is at the AUTHENTICATION page
      When User informs an email address at the Already Registered Option
        And User informs a Password
        And User Clicks on Sign in Button
      Then User should see the "MY ACCOUNT" page

    Scenario: User wants to Sign Out
      Given User is at the MY ACCOUNT page
      When User clicks on Sign Out Button
      Then User should see the "AUTHENTICATION" page
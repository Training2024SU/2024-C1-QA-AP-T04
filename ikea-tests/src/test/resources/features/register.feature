@web
Feature: Register
  I as a user of the costo website
  WANT TO sign up on to the
  SO THAT I can buy and sell in the store

  Background: Browsing the web
#    Given The user is browsing the web using the FIREFOX browser
    Given The user is browsing the web using the CHROME browser

  Scenario: Successful sign up
    Given Maria is looking at the register page
    When she completes the process with his valid information
    Then she should get redirected to her profile page
    And she should see that he is logged in
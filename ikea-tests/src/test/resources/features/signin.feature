@web
Feature: Sign in

  Background: Browsing the web
#    Given The user is browsing the web using the FIREFOX browser
    Given The user is browsing the web using the CHROME browser

  Scenario: Successful sign in
    Given Maria is looking at the sign in page
    When she enters with his valid data
    Then she should see that he is logged in
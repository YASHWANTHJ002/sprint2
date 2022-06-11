Feature: login to account

  Scenario Outline: sucessfull login with positive response
    Given initilize browser with chrome
    And navigate to "http://uniformm1.upskills.in" site
    And Click on profile
    And click on My Account
    And enter <E-mail address>,  <password>
    And Click on login
    And close the browser

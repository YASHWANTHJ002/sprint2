Feature: Checkout functionality

  Scenario Outline: sucessfully Checkout with positive response
    Given initilize browser with chrome
    And navigate to "http://uniformm1.upskills.in" site
    And Click on profile
    And click on My Account
    And enter <E-mail address>,  <password>
    And Click on login
    And Click on Uniform store
    And Click on product
    And click on Add to cart button
    And click on Add to cart icon
    And click on viewcart button
    And click on checkout button
    And click on Billing details continue button
    And click on Delivery details continue button
    And click on Deliviry method continue button
    And click on Payment method checkbox button
    And click on Payment method continue button
    And click on Confirm order button
    And click on continue button
    Then close the browser

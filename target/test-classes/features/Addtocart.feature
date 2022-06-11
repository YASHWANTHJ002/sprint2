Feature: Add to cart functionality

  Scenario Outline: sucessfully add product to cart with positive response
    Given initilize browser with chrome
    And navigate to "http://uniformm1.upskills.in" site
    And Click on product
    And click on Add to cart button
    And click on Add to cart icon
    And click on Add to cart icon
    And click on viewcart button
    And click on continue button
    Then close the browser

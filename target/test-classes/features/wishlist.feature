Feature: wishlist functionality

  Scenario Outline: sucessfully add product to wishlist with positive response
    Given initilize browser with chrome
    And navigate to "http://uniformm1.upskills.in" site
    And Click on product
    And click on wishlist
    And click on wishlist icon
    Then close the browser

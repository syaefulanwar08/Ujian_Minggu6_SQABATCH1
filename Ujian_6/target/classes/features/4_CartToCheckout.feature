Feature: Cart Page Proceed to Checkout

  Scenario: Go to cart page until checkout
    Given Go to cart page
    When Click button proceed to checkout
    And User input fisrtname and lastname
    And User input company
    And User choose country 
    And User input street address
    And User input town or city
    And User choose province
    And User input postcode phone and email
    And User input additional information
    And User checklist button
    And User click button place order
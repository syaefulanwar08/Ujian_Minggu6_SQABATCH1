Feature: Add to chart

  Scenario: Add to chart shoes and glass
    Given Back to home page
    When Search shoes 
    And Choose color and size shoes
    And Click button add to chart shoes
    When Search glass 
    And Click glass product
    And Choose color and size glass
    And Click button add to chart glass
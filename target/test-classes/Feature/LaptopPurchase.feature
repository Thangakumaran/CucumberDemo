#Author:thangakumaran@your.domain.com
@laptop
Feature: Laptop
   Background:
    Given user launches the flipkart application
    And user login by entering credentials
    
   @hardcode
   Scenario: Laptop Purchase
   
    When user search the laptop
    And user click on the laptop name
    Then user click on add to cart

  @combined @exe
   Scenario: Laptop Purchase by using one dim list
   
    When user search the laptop by one dim list
    |acer Predator Helios 300 |DELL Inspiron Ryzen 5 Quad Core 3450U|HP Ryzen 3 Dual Core 3250U) |
    And user click on the laptop name
    Then user click on add to cart
 
    
   #  Scenario: Laptop Purchase by using one dim map
   
   # When user search the laptop by one dim map
   # |1|acer Predator Helios 300 |
    #|2|DELL Inspiron Ryzen 5 Quad Core 3450U|
    # |3|DELL Inspiron Ryzen 5 Quad Core 3450U|
    #And user click on the laptop name
    #Then user click on add to cart

Feature: Amazon Test Case

  Scenario: Buyingb second most expensive samsung tv on Amazon

    Given Navigate to Amazon Website
    And Click On The Hamburger Menu
    And Click On TV, Appliances and Electronics
    And Click On Televisions
    And Filter The Results By Brand Samsung
    And Sort The Samsung Results With Price High To Low.
    And Click On The Second Highest Priced Item
    When Switch the Window
    Then Assert That About this item Section is Present And Log This Section Text to Console Report


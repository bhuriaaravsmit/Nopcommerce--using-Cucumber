Feature: ComputerPage Test
  As user I want to Click on computer page

  @Smoke
  Scenario: User should Navigate to Computer page successfully
    When I am on ComputerPage
    And I click on Computer Tab
    Then Verify the Computer text "<Computer>"

  @sanity
  Scenario: User Should Navigate to Desktops Page Successfully
    When I click on Computer Tab
    And I click on Desktops link
    Then Verify the Desktops text "<Desktops>"


  @regression
  Scenario Outline: UserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
    When I click on Computer Tab
    And I click on Desktops link
    And I click on Product
    And I select ProcessRam "<processor>" "<ram>"
    And I select hdd "<hdd>"
    And I select os"<os>"
    And I select software"<software>"
    And I click on addToCart Button
    Then Verify message "<The product has been added to your shopping cart>"
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |

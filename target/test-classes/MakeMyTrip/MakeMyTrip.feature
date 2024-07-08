#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Hotel Booking
  

  @tag1
  Scenario: Hoteli booking in munnar
    Given user is landed on MakeMyTrip home page
    When user clicks on hotels
    And user enters location "Munnar", dates "28 July" to "31 July", room "1", adults "2" and applies, price per night max 5000
    And clicks on search
    Then  validate that the result page
    And list the hotel's name
    And filter result by breakfast included, rating 3.5 and room view "mountain view"
    And select Hotel "Blanket Hotel & Spa Munnar"
     And add guest details and click on pay now
    Then validate payment page 
    And validate hotel name 
    And validate booking dates 

  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

   # Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
      #| name2 |     7 | Fail    |

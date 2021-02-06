
Feature: Checking Demo Page og Guru99
  I want to use this template for my feature file


  Scenario: Positive scenario
  
    Given I want to get "http://demo.guru99.com/v4/"
    When user lands on Guru 99 home page
 		And user enters "mngr307439" username
 		And user enter "YtErAmy" password
 		Then click Login
 		When user lands on Home page, validate Title
 		
 #	Scenario: Negative Scenario
 #		Given I want to ope "http://demo.guru99.com/v4/"
 #		When user navigates to the Guru 99 Home Page
 #		And user enters "vavna" as username
 #		And user enter "automation" as password
 #		Then use click on Login button
 #		
 
 
 		
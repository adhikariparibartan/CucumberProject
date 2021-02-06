Feature: Login into account

  Scenario: Login to account with credentials
    Given user navigatess to "http://www.facebook.com/"
    When user lands on Facebook login page
    And user enters the "anticbaby@gmail.com" username
    And user enter the "qaclass123" password
    When user clicks on the login button
    Then the user should land on home page with title  "Facebook - Log In or Sign Up|"
    And user searches for "Nepal" in searchbar
    And user lands in searched content
		Then the search is successful
	
	
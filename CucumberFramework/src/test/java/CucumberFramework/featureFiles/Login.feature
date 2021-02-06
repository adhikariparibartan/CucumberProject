Feature: Login into account

Scenario Outline: Login to account with credentials
	Given user navigatess to "http://www.facebook.com/" 
	When user lands on Facebook login page
	And user enters the "anticbaby@gmail.com" username
	And user enter the "qaclass123" password
#	When user clicks on the login button
#	Then the user should land on home page with title  "Facebook - Log In or Sign Up|"
#		
	
	Examples:
	| 	url 							| 		username 		|		 password		 |title			|
	|http://www.facebook.com/			|	anticbaby@gmail.com	|		qaclass123		 | Facebook - Log In or Sign Up|
	
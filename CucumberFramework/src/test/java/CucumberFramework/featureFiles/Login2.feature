Feature: Create an Google Account




  # The first example has two steps
  Scenario: Create Account
  # Given user navigates to "http://www.facebook.com/" 
 #When user lands on facebook login page
#And user enters the "anticbaby@gmail.com" username
#And user enter the "qaclass123" password
	#When user clicks on the login button
	#Then the user should land on home page with title  "Facebook - Log In or Sign Up"
	#Then should enter user account "sabin "
	
	Given User nevigate to  "https://accounts.google.com/signup"
	When user land to Create Account page 
	And user enter name "Sabin"
	And user enter lastname "neupane"
	And user Enter use rname "learn"
	Then enter user password "hello"
	
		
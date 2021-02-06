Feature: Login into Bank

Scenario: Login to account with credentials
	Given user navigates to "http://demo.guru99.com/v4/"
	When user lands on Guru Bank login page
	And user enters the "mngr307337" BankUsername
	And user enter the "YnabUtY" BankPassword
	When click login bank button


#-----For Customer Entry

Scenario:
Given user navigates to "http://demo.guru99.com/v4/manager/addcustomerpage.php"
And enter the Name "Niraj Shrestha"
And enter the Gender





	
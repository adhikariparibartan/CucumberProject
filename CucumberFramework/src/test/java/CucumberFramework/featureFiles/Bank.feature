Feature: Software forntpage
Scenario: Open Bank login page 
Given  Open login page "http://demo.guru99.com/v4/" login 
And user put in user name "mngr307522" user_name
And user put in password "Yhahydy" password 
And user cick login log_in 

Scenario: Customer entry 
Given  cuctomer form  "http://demo.guru99.com/v4/manager/addcustomerpage.php" url 
And data entry "Nikita subba" 
And date of birthdate "12/25/1945" 
And address is added "Newyork city"
And address is added "983257ave"
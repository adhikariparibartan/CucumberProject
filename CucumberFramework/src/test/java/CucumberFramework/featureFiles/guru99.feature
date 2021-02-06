Feature:Login to Guru99
Scenario:Login to account
Given user trying url "http://demo.guru99.com/v4/" url
And put username "mngr307523" username
And put password "yvesuva" password
When click login button 

Scenario: Customer entry
Given New customer url "http://demo.guru99.com/v4/manager/addcustomerpage.php" entry_url
And new customer name "Nikita Subba" customer_name
And customer Address "1812 rio costilla rd"


Feature: Login to facebook
Scenario: Login to account
Given user url "https://www.facebook.com/" facebook_login
And let us enter username "nikita.subba2021@gmail.com" username_login
And let us enter password "Java2021." password
When let us click the login button
And search niraj dai in the search button
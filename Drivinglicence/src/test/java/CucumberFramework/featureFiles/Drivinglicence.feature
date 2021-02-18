Feature: Nepali licence project
 Background: Online regestration
 Given get url "https://onlineedlreg.dotm.gov.np/newDlApplicationEntry_.action" url
 And user click online registration button
 And user select citizen
 And user select licence type
 Then user click on proceed
 #And user go back previous page
 
 Scenario: Online user entry form
 Given user enter first_name "rajesh"
 And User enter midd_name "raj"
 And use enter last_name"hamal"
 And use enter DOB"19-Feb-2001"
 And user select gender
 And User enter occupation "Actor"
 And User select blood group
 And enter education "SLC"
 And Enter citizen no."379982/285"
 And user enter citizenship district
 
 
 

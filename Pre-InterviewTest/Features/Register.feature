Feature: Join Now

Scenario: Successful registation with valid Credentials

Given User Launch Chrome Brower
When User Opens URL "https://moneygaming.qa.gameaccount.com/"
Then User Click on Join Now Link
And User Select Title Value from the dropdown
And User Enter First Name as "Tasnuva" and Surname as "Rahman"
And User Click the Tickbox with Text "I accept the Terms and Conditions and certify that I am over the age of 18."
When User Click Join Now Link
Then Page message Should be "This Field is required" under Date of Birth Box
And Close Brower



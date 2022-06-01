@smoketest @Batch24 
Feature: User able to login to Orange HRM site 
Scenario: User successfully login to Orange HRM 
	Given user go to Orange HRM home page from batch 24 
	When user type the username 
	And user also type password 
	Then user click on the Login button 
	And user verify the welcome screen 
	

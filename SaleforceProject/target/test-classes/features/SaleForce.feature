@BuyOrder
Feature: Edit/Update the 3rd Row

Background: 
	Given the user is on the website page update ad edit details
	
Scenario Outline: 
	When click on Component reference
	Then enter datatable in Quick find
	Then Under Lightning Web Components click on Datatable
	Then Select Datatable from Inline Edit 
	Then Click on Run
	Then Edit third row
	

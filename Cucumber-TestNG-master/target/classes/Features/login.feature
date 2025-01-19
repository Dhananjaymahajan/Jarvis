Feature: Validate ebay search Functionality

@DryRun1
Scenario Outline: Validate ebay search and add to card count functionality

	Given user has launched the application 
	#	When title of login page is "<Title>"
	When user enters "<SearchItem>" in search box 
	Then user clicks on first search option 
	Then user clicks on Item link 
	Then user clicks on Add to Card button
	#And Close the browser
	
	
	
	Examples: 
		| SearchItem | 
		| Books  | 
		
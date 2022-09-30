Feature: RegistrationPage

Background:
	 Given User is on the browser
	Then user should direct to Sign Up page
	
	Scenario: Validating the Login button 
	When User clicks on LOGIN IN Button
	Then User direct to Login in page
	
Scenario: Validating the title of Register Page 

	Then User should see the title of the page as "Registration Form" 
	
Scenario Outline: Validating the Sign up process with all valid input fields in Sign Up form

	When User enters First Name as "<First Name>" and Last Name as "<Last Name>" and Mobile Number as "<Mobile Number>" and Address as"<Address>" and Street Name as"<Street Name>" and City as "<City>" and State as "<State>" and Zip as "<Zip>" and Birth date as "<Birth date>" and UserName as "<UserName>"and Email as "<Email>" and Password as "<Password>"
	And User clicks on SIGN UP Button
	Then User should see a message "Sign Up is successful"
	
	Examples: 
		|First Name	|Last Name	|Mobile Number	|Address	|Street Name |City    |Zip   |State     |  Birth Date| UserName  | Email				| Password		|
		|	John	|	Smith	|	9064677234	|68			|Abbey Road  |Windsor |07843 |New Jersy |  08/04/1990| JohnSmith |john.smith@gmail.com	| hello@123		|
		
Scenario Outline: Validating the Sign up process with all invalid input fields in Sign Up form
When User enters First Name as "<First Name>" and Last Name as "<Last Name>" and Mobile Number as "<Mobile Number>" and Address as"<Address>" and Street Name as"<Street Name>" and City as "<City>" and State as "<State>" and Zip as "<Zip>" and Birth date as "<Birth date>" and UserName as "<UserName>"and Email as "<Email>" and Password as "<Password>"
And User clicks on SIGN UP Button
Then User should see error "<Message>"	

Examples: 
|First Name	|Last Name	|Mobile Number	|Address	|Street Name |City    |Zip   |State     |  Birth Date| UserName  | Email				| Password		|
|	John	|	Smith	|	906467   	|68			|Abbey Road  |Windsor |07843 |New Jersy |  08/04/1990| JohnSmith |john.smith@gmail.com	| hello@123		|
|	@$%%^	|	Smith	|	9064677234	|68			|Abbey Road  |Windsor |07843 |New Jersy |  08/04/1990| JohnSmith |john.smith@gmail.com	| hello@123		|
|	John	|	Smith	|	9064677234	|68			|Abbey Road  |Windsor |07843 |New Jersy |  08/04/1990| JohnSmith |john.smith       	    | hello@123		|


		
Scenario Outline: Validating the Sign up process with all empty fields in Sign Up form
When User enters First Name as "<First Name>" and Last Name as "<Last Name>" and Mobile Number as "<Mobile Number>" and Address as"<Address>" and Street Name as"<Street Name>" and City as "<City>" and State as "<State>" and Zip as "<Zip>" and Birth date as "<Birth date>" and UserName as "<UserName>"and Email as "<Email>" and Password as "<Password>"
And User clicks on SIGN UP Button
Then User should see error "Mandatory fields cannot be empty"	

Examples: 
|First Name	|Last Name	|Mobile Number	|Address	|Street Name |City    |Zip   |State     |  Birth Date| UserName  | Email				| Password		|
|	John	|	Smith	|	        	|68			|Abbey Road  |Windsor |07843 |New Jersy |  08/04/1990| JohnSmith |john.smith@gmail.com	| hello@123		|
|	John	|	Smith	|	9064679876  |68			|Abbey Road  |Windsor |07843 |New Jersy |  08/04/1990|           |john.smith@gmail.com	| hello@123		|
|	John	|	Smith	|	9064678572  |68			|Abbey Road  |Windsor |07843 |New Jersy |  08/04/1990| JohnSmith |john.smith@gmail.com	|		        |


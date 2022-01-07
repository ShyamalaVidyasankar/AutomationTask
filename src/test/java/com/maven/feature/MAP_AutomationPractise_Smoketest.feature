@smoke
Feature: User to signin, place orders and navigate to different pages in Automation Practise website
Contains 19 scenarios like clicking signIn button, entering email, duplicate email and click submit

Scenario: Launch the browser
Given user prefers to launch chrome browser
And URL is launched in the chrome browser

@TC_1
Scenario: User clicks SignIn button to enter valid email address
And User clicks SignIn button on the home page
And User enters valid email 'sample3'
And User clicks submit 


@TC4
Scenario: User enters his details to register as Automation Practise customer
And User clicks SignIn button on the home page
And User enters valid email 'samp1'
And User clicks submit 
And User selects Mr and Mrs
And User enters first name 'Anvesh'
And User enters last name
And User clicks on email field to confirm the entered email address
And User enters password
And User enters DOB
And User clicks checkbox to subscribe for newsletter
And User clicks checkbox to receive special offers from partners
And User enters address line1
And User enters the name of the city
And User selects a state from the dropdown
And User enters the poscode
And User enters mobile number
And User enters alias information
And User clicks submit in registration page
Then User checks his name in the header on accounts page 'Anvesh'
And User logs off


@TC7
Scenario: User logs in with valid user credentials
And User clicks SignIn button on the home page
And User enters registered user ID
And User enters password in the password field 'abc123'
And User clicks SignIn button
Then User checks his name in the header on accounts page 'Anu'

@TC8
Scenario Outline: User search for different keyword and verify the search result
When User enter search keyword '<SearchKeyword>' and enter search button
Then User verify the same search result '<SearchKeyword>' is displayed

Examples:
|SearchKeyword|
|dresses|
|t-shirt|
|printed|


@TC19
Scenario: User selects articles and makes payment by Bank Wire
And User navigates to Women menu
And User chooses Causal Dresses
And User clicks Add to Cart
And User clicks continue shopping
And User navigates to Dresses
And User selects Evening dresses
And User clicks Add to Cart
And User clicks continue shopping
And User clicks Proceed to Checkout 
Then User checks the total purchase price
And User add a quantity '1' in cart page by clicking on icons and verify the same
And User remove a quantity '1' in cart page by clicking on icons and verify the same
And User clicks Proceed to checkout on Cart page
And User clicks Proceed to checkout on Address page
And User checks the Terms and conditions checkbox
And User Clicks Proceed to checkout on Shipping(career) page
And User choses pay by bank wire option
And User clicks I confirm my order button
Then user verifies price of his order
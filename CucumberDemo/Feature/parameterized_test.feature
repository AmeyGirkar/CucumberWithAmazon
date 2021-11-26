Feature: Multiple Invalid username

@pizza
Scenario Outline: To check login functionality of Amazon with multiple invalid user
Given a user is on the home page of Amazon
When he hovers over Hello Sign in menu
And he clicks on Sign in button in the sub-menu
And he enters an invalid username as "<username>"
And he click on continue button
Then he must see the error message "We cannot find an account with that email address"

Examples: 
|username|
|batman554466@gmail.com|
|superman554466@gmail.com|
|ironman554466@gmail.com|
|captainplanet554466@gmail.com|
|spiderman554466@gmail.com|

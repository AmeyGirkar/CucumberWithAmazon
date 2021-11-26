Feature: Login functionality
@pizza
Scenario: A user with invalid username should be able to login
Given a user is on the home page of Amazon
When he hovers over Hello Sign in menu
And he clicks on Sign in button in the sub-menu
And he enters an invalid username as "batman554466@gmail.com"
And he click on continue button
Then he must see the error message "We cannot find an account with that email address"
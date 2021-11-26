Feature: a user should be able to buy mobile phone on Amazon
@pizza
Scenario: Buy Mobile Phone
Given a user is on the Landing page of Amazon
When he clicks on Mobiles menu
And he hovers the pointer over Mobile & Accessories section
And he clicks on Apple in the sub-menu
And he clicks on the first avaiable phone
And he clicks on Buy Now button
Then he should be able to purchase a mobile phone successfully
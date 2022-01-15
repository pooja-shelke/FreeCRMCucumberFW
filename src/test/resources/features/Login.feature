Feature: As User I should be able to Login 


Scenario: User is able to login login page
Given I am already on login page
When Title of the page is Cogmento CRM
Then User Enter email-id as "pujashelke10@gmail.com" and password as "SwamiMauli"
Then Click on Login Button
Then Next Page title is 
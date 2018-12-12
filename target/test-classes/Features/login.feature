Feature: LoginFeature

Scenario: Valid Login
Given I open browser
And I navigate to the FreeCrm
When I enter valid username and password
And I click Login button
Then I successfully logged in

Scenario:	Invalid Login
Given I open browser
And I navigate to the FreeCrm
When I enter invalid username and password
And I click Login button
Then I still see sign up link

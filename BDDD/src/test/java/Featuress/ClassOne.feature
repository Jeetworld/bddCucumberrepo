@Important
Feature: Facebook Login
As a fb user, I want to enter the username 
So that it system helps me to login


Background: common code
Given I am here to login to FB and on Login page

@Smoke
Scenario: First scenarios
When I am on Dec page "David Wild"
And login with AUS user
Then system allow me to complete the PFBR application

@Regression
Scenario: second scenario
When when i enter the data in datable
|username | password | id |
|kamal    | komalpassword | 001 |
|nishu    | nishpassword  | 002  |

Scenario Outline: this is scenaros outline sce
Given this is given of outline sc
When enter "<username>" 
And password "<password>"

Examples: 

|username|password|
|Tom|Hardy|
|Tom|Hanks|

@tag
Feature: Verify the API for practise

Scenario: verify first name and last name
Given visiting the API
When get response from API
Then validate the response code
Then verify series

Scenario: verify circuitID and circuitName and locality
Given visiting the API
When get response from API
Then validate the response code
Then verify circuitID
And verify the circuitName
Then verify the locality
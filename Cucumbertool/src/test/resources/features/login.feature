Feature: Verify OMR Branch Login function

  Scenario Outline: Verify Greens login with valid credentials
    Given User is on Greens login page
    When User enters "<userName>" and "<password>"
    And User click login button
    Then User should verify after successful login
    
    Examples:
	|userName|password|
	|t.tamil1992@gmail.com|1Tamil92!|
 
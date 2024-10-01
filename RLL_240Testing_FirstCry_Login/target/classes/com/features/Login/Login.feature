Feature: User Login

  @Login
  Scenario Outline: Successful login with valid credentials
    Given The user navigates to FirstCry Home Page
    When The user clicks on login
    And The user enters the <EmailID> or mobile no.
    And The user clicks on Continue
    And Click on Submit
    Then The user gets a message that user is on home page

    Examples: 
      | EmailID                          |
      | vaibhavagrahari3101998@gmail.com |
      | a435@gmail.com                   |
      |                                  |
      | vaibhavagrahari3101998@gmail.com |

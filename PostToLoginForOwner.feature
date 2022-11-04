Feature: Post to Login for owner

Scenario: User want to Login using email and password
    Given User want enter valid email and password of owner
    When User want to pass the data of owner by using the URI "http://localhost:8080/owner/login"
    Then User want to validate the status line "HTTP/1.1 200"
	And User want to validate the status code is 200
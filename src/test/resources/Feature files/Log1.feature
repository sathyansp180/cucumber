Feature: Login feature for volaris
Scenario Outline:: Login volaris page

Given user have login the page
When user enter the"<username>" and "<password>"
And user click the robot button
Then user click the access 

Examples:
|username|pawword|
|maven|maven@1234|

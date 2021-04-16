Feature: login the adactinhotelapp
Scenario Outline: adactin log page
Given user have login the page
When user enter the "<username>" and "<password>"
And user have click the login

Examples:
|username|password|
|sathyanarayanan|H7IM91|

Scenario: fill the page
Given user select location,hotels,room types
When user is select the number of rooms
Then user select the Date
Then user select adults per room
And user is click search button

Scenario: login fill the page and Continue rooms
Given select and confime 

Scenario: login fill the page and Continue rooms,now book a hotel
When user enter the name name and last name,address
Then user enter the credit card no and type
Then user enter expriy date and CVV number
And user click the book now




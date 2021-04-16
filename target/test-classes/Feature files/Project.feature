

@login
Feature: login the adactinhotelapp

Scenario Outline: adactin log page

Given user have login the page


When user enter the username and password
                |sathyanarayanan |H7IM91|  
              
And user have click the login

And user select Location,hotels,Room types,number of rooms,Check in Date,Check out date,adults per room.
               |London  |Hotel Sunshine|Deluxe    |2      |08/05/2022   |10/05/2022    |3 - Three   |
             
And user is click search button

And user is click search and continue

And user enter the "<First name>","<last name>","<Billing Address>","<Credit card>","<credit card type>","<Expiry date>","<Expiry date year>","<CVC Number>".

Then user is click the book now

Examples:
|First name|last name|Billing Address          |Credit card     |credit card type|Expiry date|Expiry date year|CVC Number| 
|green     |tech     |21/23 saidapet,chennai-33|1234567891012345|American Express|  April    |2022            | 1234     |
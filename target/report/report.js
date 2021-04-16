$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature%20files/Project.feature");
formatter.feature({
  "name": "login the adactinhotelapp",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "adactin log page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user have login the page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter the username and password",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "sathyanarayanan",
        "H7IM91"
      ]
    }
  ]
});
formatter.step({
  "name": "user have click the login",
  "keyword": "And "
});
formatter.step({
  "name": "user select Location,hotels,Room types,number of rooms,Check in Date,Check out date,adults per room.",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "London",
        "Hotel Sunshine",
        "Deluxe",
        "2",
        "08/05/2022",
        "10/05/2022",
        "3 - Three"
      ]
    }
  ]
});
formatter.step({
  "name": "user is click search button",
  "keyword": "And "
});
formatter.step({
  "name": "user is click search and continue",
  "keyword": "And "
});
formatter.step({
  "name": "user enter the \"\u003cFirst name\u003e\",\"\u003clast name\u003e\",\"\u003cBilling Address\u003e\",\"\u003cCredit card\u003e\",\"\u003ccredit card type\u003e\",\"\u003cExpiry date\u003e\",\"\u003cExpiry date year\u003e\",\"\u003cCVC Number\u003e\".",
  "keyword": "And "
});
formatter.step({
  "name": "user is click the book now",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "First name",
        "last name",
        "Billing Address",
        "Credit card",
        "credit card type",
        "Expiry date",
        "Expiry date year",
        "CVC Number"
      ]
    },
    {
      "cells": [
        "green",
        "tech",
        "21/23 saidapet,chennai-33",
        "1234567891012345",
        "American Express",
        "April",
        "2022",
        "1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "adactin log page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "user have login the page",
  "keyword": "Given "
});
formatter.match({
  "location": "Models1.user_have_login_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username and password",
  "rows": [
    {
      "cells": [
        "sathyanarayanan",
        "H7IM91"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Models1.user_enter_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have click the login",
  "keyword": "And "
});
formatter.match({
  "location": "Models1.user_have_click_the_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select Location,hotels,Room types,number of rooms,Check in Date,Check out date,adults per room.",
  "rows": [
    {
      "cells": [
        "London",
        "Hotel Sunshine",
        "Deluxe",
        "2",
        "08/05/2022",
        "10/05/2022",
        "3 - Three"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Models1.user_select_Location_hotels_Room_types_number_of_rooms_Check_in_Date_Check_out_date_adults_per_room(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is click search button",
  "keyword": "And "
});
formatter.match({
  "location": "Models1.user_is_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is click search and continue",
  "keyword": "And "
});
formatter.match({
  "location": "Models1.user_is_click_search_and_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"green\",\"tech\",\"21/23 saidapet,chennai-33\",\"1234567891012345\",\"American Express\",\"April\",\"2022\",\"1234\".",
  "keyword": "And "
});
formatter.match({
  "location": "Models1.user_enter_the(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is click the book now",
  "keyword": "Then "
});
formatter.match({
  "location": "Models1.user_is_click_the_book_now()"
});
formatter.result({
  "status": "passed"
});
});
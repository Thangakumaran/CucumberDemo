$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/TvPurchase.feature");
formatter.feature({
  "name": "Tv Purchase",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tv"
    }
  ]
});
formatter.scenario({
  "name": "Tv purchase by using one dim list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tv"
    },
    {
      "name": "@combined123"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launces the flipkart appctn",
  "keyword": "Given "
});
formatter.match({
  "location": "TvPurchase.user_launces_the_flipkart_appctn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login by enter valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "TvPurchase.user_login_by_enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searching the Tv by one dim list",
  "rows": [
    {
      "cells": [
        "SAMSUNG 80 cm (32 inch) HD Ready LED Smart TV",
        "Mi 4A PRO 80 cm (32 inch) HD Ready LED Smart Android TV",
        "SONY BRAVIA 80 cm (32 inch) HD Ready LED Smart TV"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TvPurchase.user_searching_the_Tv_by_one_dim_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Tv name",
  "keyword": "And "
});
formatter.match({
  "location": "TvPurchase.user_click_on_the_Tv_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add tocart",
  "keyword": "Then "
});
formatter.match({
  "location": "TvPurchase.user_click_on_add_tocart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/LaptopPurchase.feature");
formatter.feature({
  "name": "Laptop",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@laptop"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launches the flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "LaptopPurchase.user_launches_the_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login by entering credentials",
  "keyword": "And "
});
formatter.match({
  "location": "LaptopPurchase.user_login_by_entering_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Laptop Purchase by using one dim list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@laptop"
    },
    {
      "name": "@combined"
    },
    {
      "name": "@exe"
    }
  ]
});
formatter.step({
  "name": "user search the laptop by one dim list",
  "rows": [
    {
      "cells": [
        "acer Predator Helios 300",
        "DELL Inspiron Ryzen 5 Quad Core 3450U",
        "HP Ryzen 3 Dual Core 3250U)"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LaptopPurchase.user_search_the_laptop_by_one_dim_list(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the laptop name",
  "keyword": "And "
});
formatter.match({
  "location": "LaptopPurchase.user_click_on_the_laptop_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "LaptopPurchase.user_click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Feature/TvPurchase.feature");
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
  "name": "Tv purchase by using one dim map",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tv"
    },
    {
      "name": "@combined"
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
  "name": "user searching the Tv by one dim map",
  "rows": [
    {
      "cells": [
        "1",
        "SAMSUNG 80 cm (32 inch) HD Ready LED Smart TV"
      ]
    },
    {
      "cells": [
        "2",
        "Mi 4A PRO 80 cm (32 inch) HD Ready LED Smart Android TV"
      ]
    },
    {
      "cells": [
        "3",
        "SONY BRAVIA 80 cm (32 inch) HD Ready LED Smart TV"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "TvPurchase.user_searching_the_Tv_by_one_dim_map(DataTable)"
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
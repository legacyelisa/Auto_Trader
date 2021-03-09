$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AutoTrader.feature");
formatter.feature({
  "name": "",
  "description": "  // Background: chrome testing\n //    Given user test with \"chrome\" browser",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.scenario({
  "name": "User goes to Autotrader Website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke_test"
    },
    {
      "name": "@unit_test"
    },
    {
      "name": "@regression_test"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User is in landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoTraderSteps.user_is_in_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that \"Browse by Make\" are present",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.verify_that_are_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that \"Browse by Style\" are present",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.verify_that_are_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify that \"Advanced Search\" are present",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.verify_that_are_present(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify that search button is present.",
  "keyword": "And "
});
formatter.match({
  "location": "AutoTraderSteps.verify_that_search_button_is_present()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify that \"Any Make\" and \"Any Model\" is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.verify_that_and_is_visible(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "User checks the Advance search link",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke_test"
    },
    {
      "name": "@integration_test"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User click Advance Search link on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoTraderSteps.user_click_Advance_Search_link_on_the_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter \"30004\" in the zip code text box",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.user_enter_in_the_zip_code_text_box(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select \"Certified\" check box under \"Condition\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.user_select_check_box_under(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select \"Convertible\" check box under \"Style\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.user_select_check_box_under(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user update Year \"2017\" to \"2020\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.user_update_Year_to(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select \"BMW\" car from Make,Model and Trim section",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.user_select_car_from_Make_Model_and_Trim_section(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks Search button",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.user_clicks_Search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies that he is in result page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.user_verifies_that_he_is_in_result_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User verifies that he sees only \"BMW\" cars in listing",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.user_verifies_that_he_sees_only_cars_in_listing(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Display in console, the number of cars listed in result page",
  "keyword": "Then "
});
formatter.match({
  "location": "AutoTraderSteps.display_in_console_the_number_of_cars_listed_in_result_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "choose make as \"\u003cmodel\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "model"
      ]
    },
    {
      "cells": [
        "BMW"
      ]
    },
    {
      "cells": [
        "Auidi"
      ]
    },
    {
      "cells": [
        "Mercedes"
      ]
    },
    {
      "cells": [
        "Toyota"
      ]
    },
    {
      "cells": [
        "Acura"
      ]
    }
  ]
});
formatter.scenario({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "choose make as \"BMW\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoTraderSteps.choose_make_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "choose make as \"Auidi\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoTraderSteps.choose_make_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "choose make as \"Mercedes\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoTraderSteps.choose_make_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "choose make as \"Toyota\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoTraderSteps.choose_make_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "testing the multiple entry",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke_test"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "choose make as \"Acura\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AutoTraderSteps.choose_make_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});
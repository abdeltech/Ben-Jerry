$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LogoAndFooter.feature");
formatter.feature({
  "name": "Logo",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint1"
    }
  ]
});
formatter.scenario({
  "name": "Validate Logo Picture",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user navigate to action ben jerry page",
  "keyword": "When "
});
formatter.match({
  "location": "LogoAndFooterMenuSteps.user_navigate_to_action_ben_jerry_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the image displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LogoAndFooterMenuSteps.user_should_see_the_image_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Footer menu view for user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint1"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user navigate to action ben jerry page",
  "keyword": "When "
});
formatter.match({
  "location": "LogoAndFooterMenuSteps.user_navigate_to_action_ben_jerry_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see footer menu is displayed",
  "rows": [
    {
      "cells": [
        "Contact Us",
        "Franchise",
        "Press",
        "Jobs",
        "Terms \u0026 Conditions",
        "Privacy Policy",
        "Sitemap"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LogoAndFooterMenuSteps.user_see_footer_menu_is_displayed(DataTable)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.BenJerry.Steps.LogoAndFooterMenuSteps.user_see_footer_menu_is_displayed(LogoAndFooterMenuSteps.java:63)\r\n\tat ✽.user see footer menu is displayed(file:src/test/resources/features/LogoAndFooter.feature:13)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});
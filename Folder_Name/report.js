$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nasaLandingPage.feature");
formatter.feature({
  "line": 2,
  "name": "Certify Nasa Home page",
  "description": "",
  "id": "certify-nasa-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Page Title Validation",
  "description": "",
  "id": "certify-nasa-home-page;page-title-validation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I provide the nasa homepage \u003curl\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Land on Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I validate the page title",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "certify-nasa-home-page;page-title-validation;",
  "rows": [
    {
      "cells": [
        "url"
      ],
      "line": 11,
      "id": "certify-nasa-home-page;page-title-validation;;1"
    },
    {
      "cells": [
        "gov.nasa.com"
      ],
      "line": 12,
      "id": "certify-nasa-home-page;page-title-validation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Page Title Validation",
  "description": "",
  "id": "certify-nasa-home-page;page-title-validation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I provide the nasa homepage gov.nasa.com",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Land on Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I validate the page title",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
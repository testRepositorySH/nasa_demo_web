$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nasaLandingPage.feature");
formatter.feature({
  "line": 2,
  "name": "Certify Nasa Home page",
  "description": "\r\n\r\nBackGround :",
  "id": "certify-nasa-home-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 2576698807,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Page Title Validation",
  "description": "",
  "id": "certify-nasa-home-page;page-title-validation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@PageTitle"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "nasa url",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I Land on Homepage",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I validate the page title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdef.nasa_url()"
});
formatter.result({
  "duration": 79824843,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.i_Land_on_Homepage()"
});
formatter.result({
  "duration": 57316,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdef.i_validate_the_page_title()"
});
formatter.result({
  "duration": 10025291579,
  "error_message": "java.lang.AssertionError: expected [NASA Image and Video Library  ] but found [NASA Image and Video Library]\n\tat org.testng.Assert.fail(Assert.java:94)\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:135)\n\tat org.testng.Assert.assertEquals(Assert.java:116)\n\tat org.testng.Assert.assertEquals(Assert.java:190)\n\tat org.testng.Assert.assertEquals(Assert.java:200)\n\tat com.stepDef.HomePageStepdef.i_validate_the_page_title(HomePageStepdef.java:36)\n\tat ✽.Then I validate the page title(nasaLandingPage.feature:13)\n",
  "status": "failed"
});
formatter.write("Finished scenario");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2828309748,
  "status": "passed"
});
});
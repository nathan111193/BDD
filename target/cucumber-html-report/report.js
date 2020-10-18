$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/nathanpereira/IdeaProjects/BDD/src/test/Resources/IcelandHomepage.feature");
formatter.feature({
  "line": 1,
  "name": "Iceland homepage",
  "description": "",
  "id": "iceland-homepage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14793951415,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Check search functionality",
  "description": "",
  "id": "iceland-homepage;check-search-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the homepage of the Iceland website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user types crisps in the searchbox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user will see the results",
  "keyword": "Then "
});
formatter.match({
  "location": "Icelandsearchbox.user_is_on_the_homepage_of_the_Iceland_website()"
});
formatter.result({
  "duration": 813616268,
  "status": "passed"
});
formatter.match({
  "location": "Icelandsearchbox.user_types_crisps_in_the_searchbox()"
});
formatter.result({
  "duration": 4543712459,
  "status": "passed"
});
formatter.match({
  "location": "Icelandsearchbox.user_will_see_the_results()"
});
formatter.result({
  "duration": 4958108348,
  "error_message": "org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document\n  (Session info: chrome\u003d86.0.4240.80)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/stale_element_reference.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Nathan-2.local\u0027, ip: \u00272a00:23c7:d004:5d01:c1f3:805c:c440:662%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.7\u0027, java.version: \u002714.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.80, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: /var/folders/4j/zfcswtg91yz...}, goog:chromeOptions: {debuggerAddress: localhost:62977}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 05361bc10548ce32e8ab0b3cb8f71629\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.getText(RemoteWebElement.java:166)\n\tat org.example.PageObject.Icelandhomepage.selection(Icelandhomepage.java:45)\n\tat org.example.StepDefinitions.Icelandsearchbox.user_will_see_the_results(Icelandsearchbox.java:25)\n\tat ✽.Then user will see the results(/Users/nathanpereira/IdeaProjects/BDD/src/test/Resources/IcelandHomepage.feature:7)\n",
  "status": "failed"
});
formatter.after({
  "duration": 10003918883,
  "status": "passed"
});
});
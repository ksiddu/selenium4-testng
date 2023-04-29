# Ebay Search Test

This project is a hybrid framework created using Selenium, Cucumber TestNG and Java

## Project Details


### Framework Design Details

* Page Object Model design pattern to represent each web page as separate Java Class
* Singleton Deisgn Pattern to create driver instance and unique  across each thread(cucumber scenario). It also supports parallel run thread safe concept
* Cucumber Java to support BDD style of test case design
* Different formats of reports(html, json, xml, pretty) are created from cucumber inbuilt feature
* Generates html and pdf reports using Extent Report plugin 
* DataContainer class to store and persist the test data across the steps throughh out the  scenario
* DriverFactory and BroswerFactory classes to create driver instance and attach it to each scenario as a thread safe data
* CucumberRunnerTests runner class to override the cucumber command line execution
* Apache log4j2 used for logging
* src/test/resources/features/ebay_search.feature contains the test scenarios
* SearchStepDefinitions class contains the step definitions of the feature file
* config.properties to store the properties, used for browser selection

### How to run

* Run through IDE
* Run through command line

### Run through command line

* To run all the scenarios
```
mvn clean test
```

* To run the scenarios by using tag
```
mvn clean test -Dcucumber.filter.tags="@first"
```

```
mvn clean test -Dcucumber.filter.tags="@second"
```

### Reports

* Extent Reports under Reports folder
* Html Report - Reports/ExtentHtml.html
* Pdf Report - Reports/ExtentPdf.pdf
* Spark Report - Reports/Spark.html


### Sample Reports

see sample pdf report [here](Reports/ExtentPdf.pdf)
see all reports [here](Reports)


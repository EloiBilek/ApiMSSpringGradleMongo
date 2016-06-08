---
Title: ApiMSSpringGradleMongo
Description: API Microservice example using Spring Boot, Gradle and MongDB
Author: Eloi Bilek
Tags: gradle, restful, api, java, spring, springboot, mongodb
Created: 2016 Jun 7

---

# ApiMSSpringGradleMongo
==============================
API Microservice example using Spring Boot, Gradle and MongDB

It 's a very simple example of an RestFul API Microservice, CRUD of User.
Using:
* Java 8
* Spring 4
* Srping Boot 1.3.5
* MongoDB 3.2.4
* Eclipse Java EE IDE - Version: Mars.1 Release (4.5.1)

## Note 1!
This project was started with: New > Gradle > Project Gradle.

![init project](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGP/init_project.png)

Using the plugin (Add in Eclipse Marketplace). 

![gradle plugin](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGP/gradle_plugin.png)

To run the project, set the Project Facets in: ApiMSSpringGradleMongo > Properties > Project Facets.

![facets](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGP/facets.png)

... And add external dependencies on: ApiMSSpringGradleMongo > Properties > Deployment Assembly.

![facets](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGP/properties_deployment.png)

After importing the project to the Eclipse workspace, run build in: ApiMSSpringGradleMongo > Gradle > Refresh Gradle Project.
Or select task (assemble, build...) in Gradle Tasks perspective.

![gradle tasks](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGP/gradle_tasks.png)

Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run", and use Tomcat ebedeb server.

Start the project with run in main class: ApiMSSpringGradleMongo/src/main/java/com/apimsspringgradlemongo/init/Execute.java

Use for request/response test, Postman of Chrome plugin...

![msspringtest](https://github.com/EloiBilek/eloibilek.github.io/raw/master/SGM_MS/msspringtest.png)


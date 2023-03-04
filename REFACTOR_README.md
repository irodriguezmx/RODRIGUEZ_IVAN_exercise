# Refactor Summary

The source code revision starts with the folder and files exploration, reviewing the readme and config files as well as the pom file to know the dependencies included.

After trying to run the project I realized that many test fails, so I decided to skip tests and after that the project could run. When I opened the SwaggerUi page I realized at firs view the incorrect configuration for some API endpoints, specifically with the Http Verbs used.

At next stage the revision in deep starts. The first goal was to detect common coding issues like the use of non clearly variable names, naming convention (camelcase), for methods and variables and trying to reduce the lombok annotations with the use of @Data annotation that includes at least three of many used annotation in the project.

The two classes inside the model folder were updated in some of its annotations that I realized they missed and changed one relation annotation that I think is incorrect based on the definition on V1__init.sql file, specifically the annotation pass from @OneToOne to @ManyToOne.

For service classes the MembershipsServiceImpl and RolesServiceImpl were mainly updated, editing some fails in java code conventions and adding or updating logic.

For files inside web folder I updated the use of integer codes and includes the use of HttpCode to clarify which error code represents and want to throw or include in the responses.
With the short time of this challenge was not possible for me to update all I want but I recommend to update the response object to standardize the way in which the information is returned, improve the exception handling, and to have the capacity to return a collection of errors if needed, e.g.

```shell
"errors": [
      { 
      "type": "", 
      "messageId": "", 
      "message": "", 
      "explanation": "", 
      "action": "" 
      }
      ]
```

Finally, the analysis includes the test folder in which were updated based on the changes in the services implementation and the controllers.


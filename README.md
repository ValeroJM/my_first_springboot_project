# Spring Boot
I am learning Spring Boot for that I am using "Learn Spring Boot 3 in 100 Steps - Beginner to Expert" by Packt Publishing in O'REALLY courses.

## 1. I learned how to set up Spring Boot
I am using:
* Java 17
* IntelliJ

I learned how to use Spring Initializr by navigating to this link:

[Spring Initializr link](https://start.spring.io/)

Here is the configuration I used, base on the course and, before I clicked on GENERATE CTRL + <-| button
![Spring Boot Initializr](img/springInitializr.png)

Do NOT FORGET to add Spring Web in the Dependencies!

After we clicked on the GENERATE CTRL + <-| button and Zip file will be downloaded in our browser.
Then we will need to unZip the file an import into our IDE as new project.

## 2. I learned how to set up a response from a server
I used **@RestController** and **@RequestMapping("/yourPath")** annotations

See classes:
* CourseController
* Course
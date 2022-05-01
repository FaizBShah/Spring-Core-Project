# Spring-Core-Project
A simple project to learn the basics of Spring Core

## Notes for my personal usage:
* Spring is a Dependency Injection Framework which injects all 
  the dependencies during run-time. It also has grown to be a 
  larger project and now even contains wrapper for other things 
  like Spring JDBC, Spring Security, etc.
  
* ApplicationContext could be thought of as large container 
  which stores all the beans/objects of the classes, and injects 
  them to the classes whenever someone requests them.
  
* ApplicationContext takes in two inputs:
    * The beans.
    * The Configuration file.
    
* The Configuration tells the Application Context which beans 
  to store in itself, how to initialize them, and etc.
  
* Create the XML Config file inside the resources directory 
  inside the main directory, i.e. `/main/resources/`.
  
* Three ways to add properties in Bean inside XML Config  
  file:
    * Using `<value/>` inside `<property/>` element.
    * Using `value` as an attribue in the `<property/>` element.
    * Using p-schema method in the `<bean/>` element.
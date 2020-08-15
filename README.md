# graphql-java-demo

## Background

In the project of my full-time job, there is an existing GraphQL server implemented using [Elide](https://github.com/yahoo/elide). 
I want to replace it with the following reasons:

* There are several limitations with this library, and there is not much room for customization.
* We also want to replace Spring-Data-JPA by Spring-Data-JDBC, for the simplicity of the later one. However, it does not supported by Elide.

In this repo, I try to do a POC with existing ways to implement GraphQL server in Java to see if it is worthy to replace Elide.

## Tech stack

* Java 8
* Spring Web
* Spring Data JDBC
* MySQL
* GraphQL Java

# Remarks

* To start the app with Intellij
    * `Edit Configurations`
    * In `Program arguments`, input `--mysql.host=(DB host) --mysql.port=(DB port) --mysql.username=(DB username) --mysql.password=(DB password)`
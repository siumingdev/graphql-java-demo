# graphql-java-demo

## Background

There is an existing GraphQL server implemented using [Elide](https://github.com/yahoo/elide).
However, there are several limitations with this library, and there is not much room for customization.
So I do a POC with graphql-java.

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
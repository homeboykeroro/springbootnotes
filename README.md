# springbootnotes

### This project is to demonstrate Java Spring Boot project setup, project structure and general backend functions. The codebase's endpoint API adheres to the repository [angular-notes](https://github.com/gothinkster/realworld-example-apps) <br/><br/>

## Framework/ Thrid Party Library Adapted
- **Spring Boot** is used to simplfy and facilitate whole Spring project development. We don't need to manually configure core Spring components manualy such as Spring MVC DispatcherServlet, Spring Data JPA Transactional Management and Spring Beans scanning
- **Spring Validation** API is used to reduces validation boilerplate code, provides a convenient way (Spring annotation) to do so.
- **Querydsl** is used to simplfy communication with database, especially for complex SQL query. We don't need to write JPQL/ HQL/ SQL statement anymore. It provides Java API to perform SQL operation in elegant and typesafe way.

## Java Backend Development Prerequisite Steps
1. Install **Apache Maven**, **Java OpenJDK**
2. Install **Server Connector**, **Community Server Connectors** vscode extension
3. Install any web server you want e.g **Apache Tomcat** (_IT WOULD NOT WORK IF YOU RUN THIS PROGRAM ON TOMCAT UNDER 9.x VERSION_)
3. Specify `java.jdt.ls.java.home`, which is used to launch the vscode Java Language Server, in vscode settings.json
4. Add environment variable for **Apache Maven** and **JAVA_HOME**

## Project Build Steps
1. Run `mvn clean install` to build a war file
2. Deploy the war to server

## Useful vscode Extensions for Java Project Development
- **Extension Pack for Java**
- **Spring Boot Extension Pack**
FROM maven:3.9.8-eclipse-temurin-21 AS build

EXPOSE 8080

COPY target/springBootRest-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]
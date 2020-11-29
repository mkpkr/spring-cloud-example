FROM openjdk:15-jdk-alpine
COPY target/*.jar api-gateway.jar
ENTRYPOINT ["java","-jar","/api-gateway.jar"]
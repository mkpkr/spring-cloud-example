FROM openjdk:15-jdk-alpine
COPY target/*.jar config-server.jar
ENTRYPOINT ["java","-jar","/config-server.jar"]
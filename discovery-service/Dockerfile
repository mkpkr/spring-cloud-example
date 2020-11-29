FROM openjdk:15-jdk-alpine
COPY target/*.jar discovery-service.jar
ENTRYPOINT ["java","-jar","/discovery-service.jar"]
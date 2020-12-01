FROM openjdk:15-jdk-alpine

ENV WAIT_FOR=

RUN apk update; \
    apk upgrade; \
    apk add bash; \
    wget https://raw.githubusercontent.com/vishnubob/wait-for-it/master/wait-for-it.sh; \
    chmod +x wait-for-it.sh

COPY target/*.jar discovery-service.jar

ENTRYPOINT ./wait-for-it.sh $WAIT_FOR --timeout=300 --strict -- java -jar discovery-service.jar
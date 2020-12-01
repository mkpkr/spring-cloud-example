# spring-cloud-example

A simple microservice based application to show the simplicity of Spring Cloud, and for my personal reference for setting up a skeleton Spring Cloud project.

# Components

See ```docker-compose.yml``` for collection of containers that will be run.

* microservice-one
    * dummy microservice
	* uses Feign client to make requests to microservice-two
* microservice-two
    * dummy microservice
* discovery-service
    * allows automatic service discovery
	* uses Eureka discovery service
* api-gateway
	* the entry point to the application
    * uses Zuul API gateway & Ribbon load balancer
* config-server
    * application configuration
    * uses Spring Cloud ConfigServer

# What is Missing

* no exception handling for communication between servicves as this is just a dummy app - in production we should assume everything that can fail will fail
* no cirtuit breaking functionality - we could use **Hystrix** for this
* no distributed tracing - we could use **Sleuth & Zipkin**
* no log aggregation - we could use ELK (**ElasicSearch, Logstash & Kibana**) to collect logs, search and visualize
* microservices can still be accessed directly - we could allow access only from the API Gateway

# Build & Run

```bash
cd spring-cloud-example

# build
cd config-server && ./mvnw clean install \
&& cd ../discovery-service && ./mvnw clean install \
&& cd ../api-gateway && ./mvnw clean install \
&& cd ../microservice-one  && ./mvnw clean install \
&& cd ../microservice-two && ./mvnw clean install \
&& cd ..

# run
docker-compose up --build
```

This will start the components listed above (with multiple instances of the dummy microservices).

You can access the microservices via Zuul API Gateway: http://localhost:8011/microservice-one or http://localhost:8011/microservice-two (refresh to view Ribbon load balancer distributing load between instances).

Or view the Eureka Discovery Service dashboard: http://localhost:8010 (user: testuser / password: testpass)


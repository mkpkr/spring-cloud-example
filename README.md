# spring-cloud-example

A simple microservice based application to show the simplicity of Spring Cloud, and for my personal reference for setting up a skeleton Spring Cloud project.

# Components

* microservice-one
    * dummy microservice
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


![diagram.png](diagram.png)

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

You can access the microservices via Zuul gateway: http://localhost:8011/microservice-one or http://localhost:8011/microservice-two (refresh to view Ribbon load balancer distributing load between instances).

Or view the Eureka dashboard: http://localhost:8010 (user: testuser / password: testpass)

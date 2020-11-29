# spring-cloud-example

A simple microservice based application to show the simplicity of Spring Cloud, and for my personal reference for setting up a skeleton Spring Cloud project.

# Build & Run

```bash
cd discovery-service && ./mvnw clean install \
&& cd ../api-gateway && ./mvnw clean install \
&& cd ../config-server && ./mvnw clean install \
&& cd ../microservice-one  && ./mvnw clean install \
&& cd ../microservice-two && ./mvnw clean install

# either
docker-compose up 

# or
docker stack deploy
```

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

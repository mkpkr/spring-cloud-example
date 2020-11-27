# spring-cloud-example

A simple microservice based application to show the simplicity of Spring Cloud, and for my personal reference for setting up a skeleton Spring Cloud project.

Components:

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

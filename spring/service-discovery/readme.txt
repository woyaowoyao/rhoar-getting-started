mvn -f eureka-service spring-boot:run

mvn -f eureka-client spring-boot:run

oc create -f ./service.json

oc expose service/discovery-service

oc describe service discovery-service
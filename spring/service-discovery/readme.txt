mvn -f eureka-service spring-boot:run

cd eureka-service
 mvn package fabric8:deploy -Popenshift -DskipTests

mvn -f eureka-client spring-boot:run

oc create -f ./service.json

oc expose service/discovery-service

oc describe service discovery-service

cd cd ./eureka-client
mvn package -Dfabric8.openshift.trimImageInContainerSpec fabric8:deploy -Popenshift -DskipTests
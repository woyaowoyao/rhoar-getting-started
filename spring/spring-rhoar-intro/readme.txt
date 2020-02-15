oc new-app -e POSTGRESQL_USER=luke \
             -e POSTGRESQL_PASSWORD=secret \
             -e POSTGRESQL_DATABASE=my_data \
             centos/postgresql-95-centos7 \
             --name=my-database
             
 oc new-project dev --display-name="Dev - Spring Boot App"            
vi  postgresql.env 
 POSTGRESQL_USER=luke 
 POSTGRESQL_DATABASE=my_data 
 POSTGRESQL_PASSWORD=secret 
 oc new-app centos/postgresql-95-centos7:latest  --name=my-database --env-file=postgresql.env
 
 
 vi postgresql4-rhoar-intro.env
 POSTGRESQL_USER=luke 
 POSTGRESQL_DATABASE=my_data 
 POSTGRESQL_PASSWORD=secret
 oc new-app centos/postgresql-95-centos7:latest --env-file=postgresql4-rhoar-intro.env
 
 mvn package fabric8:deploy -Popenshift -DskipTests
 
 oc rollout status dc/fruits
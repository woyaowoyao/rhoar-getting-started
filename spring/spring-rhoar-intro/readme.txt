oc new-app -e POSTGRESQL_USER=luke \
             -e POSTGRESQL_PASSWORD=secret \
             -e POSTGRESQL_DATABASE=my_data \
             centos/postgresql-95-centos7 \
             --name=my-database
             
             
vi  postgresql.env 
 POSTGRESQL_USER=luke 
 POSTGRESQL_DATABASE=my_data 
 POSTGRESQL_PASSWORD=secret 
 oc new-app centos/postgresql-95-centos7:latest  --name=my-database --env-file=postgresql.env
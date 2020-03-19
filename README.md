# spring-cloud-config



Testing URL:

GET :  http://localhost:9091/employee-service/default 

GET :  http://localhost:9092/department-service/default 

GET :  http://localhost:9091/service

GET :  http://localhost:9091/shared

GET :  http://localhost:9092/service

GET :  http://localhost:9092/shared

Change the properties in department and employee and application properties then hit the below URL

POST :  http://localhost:9091/actuator/refresh 

POST :  http://localhost:9092/actuator/refresh 

GET :  http://localhost:9091/service

GET :  http://localhost:9091/shared

GET :  http://localhost:9092/service

GET :  http://localhost:9092/shared



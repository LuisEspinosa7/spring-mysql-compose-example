FROM amazoncorretto:21.0.4-alpine
VOLUME /tmp 
COPY target/docker-compose-example-1.0.0.0-SNAPSHOT.jar users-service.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/users-service.jar"]
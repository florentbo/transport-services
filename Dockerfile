FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/transport-service-0.0.1-SNAPSHOT.jar transport-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/transport-service-0.0.1-SNAPSHOT.jar"]

FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/transport-service-0.0.1-SNAPSHOT.jar transport-service-0.0.1-SNAPSHOT.jar
ENV _JAVA_OPTIONS="-XX:MaxRAM=70m"
CMD java $_JAVA_OPTIONS transport-service-0.0.1-SNAPSHOT.jar

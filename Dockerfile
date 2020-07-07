FROM openjdk:8-jdk-alpine
EXPOSE 6091
WORKDIR /app 
COPY target/rabbitmq-publisher-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "rabbitmq-publisher-0.0.1-SNAPSHOT.jar" ]

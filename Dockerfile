FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/gs-spring-boot-0.1.0.jar .

EXPOSE 8080
CMD ["java", "-jar", "gs-spring-boot-0.1.0.jar"]
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/app.jar app.jar
CMD ["java", "-jar", "app.jar"]

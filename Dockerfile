# Use Java 17 Alpine
FROM openjdk:17-jdk-alpine

# Set working directory inside container
WORKDIR /app

# Copy JAR file built by Maven
COPY target/app.jar app.jar

# Expose port 9090
EXPOSE 9090

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]

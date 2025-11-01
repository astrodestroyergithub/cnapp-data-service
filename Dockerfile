# Use an official Maven image to build the application
FROM maven:3.9.6 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and install dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code and build the application
COPY src ./src
RUN mvn clean package -DskipTests

# Use an official OpenJDK image to run the application
FROM eclipse-temurin:21-jdk-jammy

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/cnappdataservice-0.0.1-SNAPSHOT.jar .

# Expose the application port
EXPOSE 8080

# Specify the command to run the application
ENTRYPOINT ["java", "-jar", "/app/cnappdataservice-0.0.1-SNAPSHOT.jar"]
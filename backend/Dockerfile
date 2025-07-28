# Use a multi-stage build
FROM amazoncorretto:17-alpine-jdk AS build

WORKDIR /app

# Install Maven inside the Docker container's build stage
RUN apk add --no-cache maven

COPY pom.xml .
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

FROM amazoncorretto:17-alpine

WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

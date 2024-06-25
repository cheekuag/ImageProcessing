# Stage 1: Build the application
FROM gradle:jdk17 AS builder
WORKDIR /app
COPY . .
RUN gradle build -x test

# Stage 2: Create the final image
FROM openjdk:17
WORKDIR /app
COPY --from=builder /app/build/libs/* java_server.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "java_server.jar"]

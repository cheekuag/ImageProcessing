FROM openjdk:17
COPY /build/libs/Image-0.0.1-SNAPSHOT.jar /java_server.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","java_server.jar"]
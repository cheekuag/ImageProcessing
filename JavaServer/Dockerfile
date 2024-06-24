FROM openjdk:17
COPY /build/libs/* java_server.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","java_server.jar"]
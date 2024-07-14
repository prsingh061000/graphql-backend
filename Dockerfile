FROM openjdk:17.0.2-jdk
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"];
EXPOSE 8009
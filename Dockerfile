FROM --platform=linux/amd64 eclipse-temurin:11.0.18_10-jre-alpine
EXPOSE 8080
ADD build/libs/docker-cache-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
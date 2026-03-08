FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/WebApp-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} web_app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "web_app.jar"]
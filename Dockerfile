ARG JAR_FILE=target/*.jar

FROM openjdk:21
COPY ${JAR_FILE} app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]
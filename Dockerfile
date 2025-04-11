ARG JDK=eclipse-temurin:21-jdk
ARG JRE=eclipse-temurin:21-jre

FROM $JDK AS builder
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

FROM $JRE
WORKDIR /app
EXPOSE 12900
COPY --from=builder /app/target/*.jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]

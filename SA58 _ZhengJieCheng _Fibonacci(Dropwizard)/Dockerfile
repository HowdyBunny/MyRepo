FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/challengeDropwizard-1.0-SNAPSHOT.jar /app/challengeDropwizard-1.0-SNAPSHOT.jar

COPY src/main/resources/config.yml /app/config.yml
EXPOSE 8082

ENTRYPOINT ["java", "-jar", "/app/challengeDropwizard-1.0-SNAPSHOT.jar", "server", "/app/config.yml"]
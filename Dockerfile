FROM eclipse-temurin:21-jdk-alpine
WORKDIR /question-service-new
COPY target/*.jar question-service-new.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","question-service-new.jar"]
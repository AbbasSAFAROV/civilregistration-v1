FROM adoptopenjdk/openjdk11
WORKDIR /app
COPY ./target/*.jar app.jar
EXPOSE 8088
CMD ["java", "-jar", "app.jar"]
FROM openjdk:11
ADD target/fibonacci.jar fibonacci.jar
ENTRYPOINT ["java", "-jar","fibonacci.jar"]
EXPOSE 9988
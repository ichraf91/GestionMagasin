FROM openjdk:8

ADD target/achat-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

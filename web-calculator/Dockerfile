FROM frolvlad/alpine-oraclejdk8:slim
COPY build/libs/web-calculator-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
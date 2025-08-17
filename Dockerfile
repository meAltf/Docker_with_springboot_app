FROM openjdk:26-trixie
ADD target/rest-demo-docker.jar rest-demo-docker.jar
ENTRYPOINT ["java", "-jar", "/rest-demo-docker.jar"]
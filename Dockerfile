FROM openjdk:26-trixie
ADD target/student-app.jar student-app.jar
ENTRYPOINT ["java", "-jar", "/student-app.jar"]
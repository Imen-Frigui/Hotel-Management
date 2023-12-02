FROM openjdk:17
EXPOSE 8085
ADD target/Reclamation-1.0.jar Reclamation-1.0.jar
ENTRYPOINT ["java", "-jar","Reclamation-1.0.jar"]
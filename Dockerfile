FROM openjdk:17
EXPOSE 8089
ADD target/Events-1.0.jar Events-1.0.jar
LABEL authors="hanin"

ENTRYPOINT ["java", "-jar" , "Events-1.0.jar"]
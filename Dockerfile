FROM openjdk:17
EXPOSE 8089
ADD target/Reservation-0.0.1-SNAPSHOT.jar Reservation-0.0.1-SNAPSHOT.jar
ADD src/main/resources/application.properties application.properties
ENTRYPOINT ["java" ,"-jar" ,"Reservation-0.0.1-SNAPSHOT.jar"]


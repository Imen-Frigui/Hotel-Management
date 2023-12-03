FROM openjdk:17
EXPOSE 8089
ADD target/hotel-employee-management-0.0.1-SNAPSHOT.jar hotel-employee-management-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "hotel-employee-management-0.0.1-SNAPSHOT.jar"]
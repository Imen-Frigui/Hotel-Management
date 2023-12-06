FROM openjdk:17
EXPOSE 8089
ADD target/hotel-employee-management-0.0.1-SNAPSHOT.jar hotel-employee-management-0.0.1-SNAPSHOT.jar
ADD src/main/resources/application.properties application.properties
ENTRYPOINT ["java","-jar", "hotel-employee-management-0.0.1-SNAPSHOT.jar"]
ENV EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://eurekaServer:8761/eureka/
FROM openjdk:17
EXPOSE 8083
ADD target/Reservation-1.3.jar Reservation-1.3.jar
ADD src/main/resources/application.properties application.properties
ENTRYPOINT ["java" ,"-jar" ,"Reservation-1.3.jar"]
ENV EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://eurekaServer:8761/eureka/

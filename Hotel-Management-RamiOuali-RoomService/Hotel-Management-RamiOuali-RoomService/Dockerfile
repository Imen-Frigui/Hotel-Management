FROM openjdk:17
EXPOSE 8084
ADD target/HotelManagment-Room-1.jar HotelManagment-Room-1.jar
ENTRYPOINT ["java","-jar","HotelManagment-Room-1.jar"]
ENV EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://eurekaServer:8761/eureka/

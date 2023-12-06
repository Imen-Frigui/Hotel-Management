FROM openjdk:17
EXPOSE 8086
ADD target/Events-1.0.jar Events-1.0.jar
ADD src/main/resources/application.properties application.properties
ENTRYPOINT ["java" ,"-jar" ,"Events-1.0.jar"]
ENV EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://eurekaServer:8761/eureka/

FROM openjdk:17
EXPOSE 8085
ADD target/Reclamation-1.0.jar Reclamation-1.0.jar
ENTRYPOINT ["java", "-jar", "Reclamation-1.0.jar"]

# Set environment variables
ENV SPRING_DATASOURCE_URL=jdbc:h2:./db/imen
ENV EUREKA_CLIENT_SERVICEURL_DEFAULTZONE=http://eurekaServer:8761/eureka/

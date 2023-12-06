FROM openjdk:17
EXPOSE 8761
ADD target/eurekaServer-1.jar eurekaServer-1.jar
LABEL authors="Imen Frigui"
ENTRYPOINT ["java","-jar", "eurekaServer-1.jar"]
package tn.esprit.microservice.RoomService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HotelEmployeeManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelEmployeeManagementApplication.class, args);
    }

}
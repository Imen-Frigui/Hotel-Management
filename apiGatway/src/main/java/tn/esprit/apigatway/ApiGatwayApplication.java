package tn.esprit.apigatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatwayApplication {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("reclamation-service", r -> r.path("/reclamation/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://RECLAMATIONSERVICE"))
                .route("employee-service", r -> r.path("/employee/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://EMPLOYEESERVICE"))
                .route("event-service", r -> r.path("/event/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://EVENTSERVICE"))
                .route("reservation-service", r -> r.path("/reservation/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://RESERVATIONSERVICE"))
                .route("room-service", r -> r.path("/room/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://ROOMSERVICE"))
                .build();
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiGatwayApplication.class, args);
    }

}

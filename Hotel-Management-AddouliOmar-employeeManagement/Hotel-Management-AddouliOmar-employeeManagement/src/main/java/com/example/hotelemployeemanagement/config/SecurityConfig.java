//package com.example.hotelemployeemanagement.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@EnableWebSecurity
//public class SecurityConfig {
//    @Bean
//    public SecurityWebFilterChain securityFilterChain(ServerHttpSecurity serverHttpSecurity) throws Exception {
//        return serverHttpSecurity.csrf(ServerHttpSecurity.CsrfSpec::disable)
//                .authorizeExchange(exchange -> exchange
//                        .anyExchange().authenticated()
//                ).oauth2ResourceServer((oauth) -> oauth
//                        .jwt(Customizer.withDefaults()))
//                .build();
//
//    }
//
//}

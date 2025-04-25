package com.liferay.bigquery_emulator.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
         http
                .authorizeHttpRequests(authorize -> authorize
                        .anyRequest().permitAll() // Permits all requests without authentication
                )
                .csrf(csrf -> csrf.disable()) // Disable CSRF if needed (only for testing or stateless APIs)
                .formLogin(form -> form.disable()) // Disable default form login
                .httpBasic(httpBasic -> httpBasic.disable()); // Disable HTTP Basic authentication
        return http.build();
    }
}
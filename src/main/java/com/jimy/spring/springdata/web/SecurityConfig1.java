package com.jimy.spring.springdata.web;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig1 {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
       return http
        .authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
        .formLogin(Customizer.withDefaults()) // Habilita el formulario de login por defecto, la forma moderna y reomendada.
        .httpBasic(Customizer.withDefaults()) // Habilita la autenticación HTTP Basic
        .build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(
            User.withUsername("admin")
                .password("{noop}123") // {noop} indica que no se aplica ningún encoding a la contraseña
                .roles("ADMIN", "USER")
                .build(),
            User.withUsername("user")
                .password("{noop}123")
                .roles("USER")
                .build()    
        );
    }
}

package br.estudos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class GeneralConfiguration {

    @Bean
    public String currentYearConfig() {
        return String.valueOf(LocalDateTime.now().getYear());
    }

}

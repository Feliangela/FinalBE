package com.example.movieservice.RabbitMQConfig;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {
    @Bean
    public Queue movieQueue() {
        return new Queue("movie-queue", false);
    }
}



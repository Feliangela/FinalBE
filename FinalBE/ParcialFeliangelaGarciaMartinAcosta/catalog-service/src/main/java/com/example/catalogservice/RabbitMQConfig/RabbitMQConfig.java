package com.example.catalogservice.RabbitMQConfig;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue catalogQueue() {
        return new Queue("catalog-queue", false);
    }
}

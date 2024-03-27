package com.example.serieservice.RabbitMQConfig;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    // Define la cola para recibir mensajes
    @Bean
    public Queue serieQueue() {

        return new Queue("serie-queue", false);
    }
}

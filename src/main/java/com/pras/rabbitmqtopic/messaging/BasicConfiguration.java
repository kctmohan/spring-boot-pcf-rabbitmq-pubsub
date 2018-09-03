package com.pras.rabbitmqtopic.messaging;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicConfiguration {


    @Bean
    public Queue firstQueue(){
        return new Queue("First_Queue");
    }

    @Bean
    public Queue secondQueue(){
        return new Queue("Second_Queue");
    }

    @Bean
    public Exchange sampleExchange(){
        return new DirectExchange("directExchange");
    }

    @Bean
    public Binding firstBinding(Queue firstQueue, DirectExchange directExchange){
        return BindingBuilder.bind(firstQueue).to(directExchange).with("first");
    }

    @Bean
    public Binding secondBinding(Queue secondQueue, DirectExchange directExchange){
        return BindingBuilder.bind(secondQueue).to(directExchange).with("second");
    }

}
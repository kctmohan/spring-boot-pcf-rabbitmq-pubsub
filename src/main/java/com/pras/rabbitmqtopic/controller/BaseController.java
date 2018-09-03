package com.pras.rabbitmqtopic.controller;

import com.pras.rabbitmqtopic.messaging.MessageProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    private final MessageProducer messageProducer;

    public BaseController(MessageProducer messageProducer){
        this.messageProducer = messageProducer;
    }


    @GetMapping("/testRabbitTopic")
    public void testRabbitTopic(){
        messageProducer.sendFirstMessage();
        messageProducer.sendSecondMessage();
    }

}

package com.springboot.kafka.springbootkafkademo.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
    @KafkaListener(topics = "myfirstTopic", groupId = "myGroup")
    public void consumeMessage(String message){

        logger.info("Message received with my gurts -> "+ message);

    }
}

package com.springboot.kafka.springbootkafkademo.kafka.consumer;

import com.springboot.kafka.springbootkafkademo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JSonKaflaConsumer{
    private static final Logger logger = LoggerFactory.getLogger(JSonKaflaConsumer.class);

    @KafkaListener(topics = "myfirstJsonTopic", groupId = "myGroup1")
    public void consume(User user){
        logger.info("JSonKaflaConsumer1 consume json object user ::: "+ user.toString());
    }
}
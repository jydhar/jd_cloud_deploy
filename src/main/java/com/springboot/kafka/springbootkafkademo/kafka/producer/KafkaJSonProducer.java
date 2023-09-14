package com.springboot.kafka.springbootkafkademo.kafka.producer;

import com.springboot.kafka.springbootkafkademo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class KafkaJSonProducer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaJSonProducer.class);

    private KafkaTemplate<String, User> kafkaTemplate;

    public KafkaJSonProducer(KafkaTemplate<String, User> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User data){
        logger.info("my JSOnnn message sending to topic : " + data.toString());

    Message<User> c = MessageBuilder.withPayload(data)
                .setHeader(KafkaHeaders.TOPIC,"myfirstJsonTopic")
                .build();

        kafkaTemplate.send(c);
    }


}

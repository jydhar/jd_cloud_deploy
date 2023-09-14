package com.springboot.kafka.springbootkafkademo.controller;

import com.springboot.kafka.springbootkafkademo.kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/vi/kafka")
public class MessageController {

    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer){
        this.kafkaProducer = kafkaProducer;
    }

    //localhost:8080/api/vi/kafka/publish?message=hellow world
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message){

     //   kafkaProducer.sendMessage(message);

        return ResponseEntity.ok("message sent successfully");
    }
}

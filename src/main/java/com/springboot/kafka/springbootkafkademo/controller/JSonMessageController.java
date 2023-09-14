package com.springboot.kafka.springbootkafkademo.controller;


import com.springboot.kafka.springbootkafkademo.kafka.producer.KafkaJSonProducer;
import com.springboot.kafka.springbootkafkademo.kafka.producer.KafkaProducer;
import com.springboot.kafka.springbootkafkademo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vi/kafka")
public class JSonMessageController {
    private KafkaJSonProducer kafkaJSonProducer;

    public JSonMessageController(KafkaJSonProducer kafkaJSonProducer){
        this.kafkaJSonProducer = kafkaJSonProducer;
    }

    //localhost:8080/api/vi/kafka/jsonpublish?message=hellow world
    @PostMapping("/jsonpublish")
    public ResponseEntity<String> publish(@RequestBody User data){

        kafkaJSonProducer.sendMessage(data);

        return ResponseEntity.ok("message JSON sent successfully");
    }

}

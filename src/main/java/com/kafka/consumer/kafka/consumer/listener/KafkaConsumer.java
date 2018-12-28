package com.kafka.consumer.kafka.consumer.listener;

import com.kafka.consumer.kafka.consumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    /*@KafkaListener(topics = "kafka_example_string", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }*/


    @KafkaListener(topics = "kafka_example", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consuming message");
        System.out.println("Consumed JSON Message: " + user.getName());
    }
}
package com.quest.consumer.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);
    private  static  final String TOPIC_NAME="TENTH-CLASS-TOPIC";
    @KafkaListener(topics = TOPIC_NAME, groupId = "group_id")
    public void receivedMessage(String message) {
        logger.info("Message received from kafka topic in consumer app is: " + message);
    }
}

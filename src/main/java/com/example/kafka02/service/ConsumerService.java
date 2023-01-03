package com.example.kafka02.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);
    @KafkaListener(topics = "test-topic")
    public void consume(String message) {
        logger.info("#### -> Consumed message -> {}", message);
    }

}

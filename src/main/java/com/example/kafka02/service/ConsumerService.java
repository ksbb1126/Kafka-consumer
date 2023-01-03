package com.example.kafka02.service;

import com.example.kafka02.domain.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    @Autowired
    ObjectMapper objectMapper;
    @Autowired
    OrderService orderService;

    @KafkaListener(topics = "test-topic")
    public void consume(String message) throws JsonProcessingException {
        Order order = objectMapper.readValue(message, Order.class);
        logger.info("#### -> Consumed message -> {}", order.toString());
        orderService.insertOrder(order);
    }

}

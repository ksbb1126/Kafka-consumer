package com.example.kafka02.service;

import com.example.kafka02.domain.Order;
import com.example.kafka02.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    void insertOrder(Order order) {
        orderMapper.insert(order.getName(), order.getStoreName());
    }
}

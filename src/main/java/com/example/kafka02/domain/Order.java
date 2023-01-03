package com.example.kafka02.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private Integer orderNum;
    private String name;
    private String storeName;
}


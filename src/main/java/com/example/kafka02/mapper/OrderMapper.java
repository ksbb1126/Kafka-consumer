package com.example.kafka02.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    @Insert("insert into order values(null, #{name}, #{storeName})")
    void insert(@Param("name") String name, @Param("storeName") String storeName);
}

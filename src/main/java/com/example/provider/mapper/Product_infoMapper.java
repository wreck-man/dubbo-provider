package com.example.provider.mapper;



import com.example.model.Product_info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


import java.util.List;

@Mapper
public interface Product_infoMapper {
    List<Product_info> selectAll();
}
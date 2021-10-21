package com.example.provider.service;

import com.example.model.Product_info;
import com.example.provider.mapper.Product_infoMapper;
import com.example.service.ProductService;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
@Service
@Component
public class ProductServiceimpl implements ProductService {

    @Autowired
    private Product_infoMapper product_infoMapper;
    @Override
    public List<Product_info> all() {
        return product_infoMapper.selectAll();
    }
}

package com.example.provider.mapper;



import com.example.model.product_type;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface product_typeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(product_type record);

    int insertSelective(product_type record);

    product_type selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(product_type record);

    int updateByPrimaryKey(product_type record);
}
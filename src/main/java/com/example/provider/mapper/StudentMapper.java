package com.example.provider.mapper;



import com.example.model.Student;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface StudentMapper {
    Student selectOne(String id);

}
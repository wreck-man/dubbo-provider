package com.example.provider.service;

import com.example.model.Student;
import com.example.provider.mapper.StudentMapper;

import com.example.service.StudentService;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;
@Component
@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student selectOne(String id) {

        return studentMapper.selectOne(id);
    }
}

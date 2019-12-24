package com.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

@Data
public class Person {
   @Resource
    private Dog dog;
    @Resource
    private Cat cat;
}

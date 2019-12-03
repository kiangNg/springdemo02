package com.jbit.entity;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component(value = "stu")
public class Student {

    @Value("wjy")
    private String name;
    @Autowired
    private Grade grade;
}

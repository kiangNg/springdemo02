package com.jbit.service;

import com.jbit.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TypesService {
    private String str;
    @Autowired
    private Student stu;
    private int[] nums;
    private List<String> strs;
    private Set<String> sets;
    private Map<String,Object> maps;
    private Properties props;
    private String nulls;
    private String emptys;

    public void show(){
        System.out.println("str = "+ str);
        System.out.println("str = "+ stu);
    }
}

package com.jbit.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Component(value = "aa")
public class TypeService {
    @Value("zhangga")
    private String name;
    @Value("hello")
    private String words;
    @Value("22")
    private int age;

    public void show(){
        System.out.println(name+":"+words+",age="+age);
    }
}

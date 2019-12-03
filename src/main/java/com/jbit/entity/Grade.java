package com.jbit.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class Grade {
    @Value("一年级")
    private String name;
}

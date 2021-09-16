package com.example.userservice.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Greeting {
    /**
     * @see org.springframework.beans.factory.annotation.Value 를 가지고와야함
     */
    @Value("${greeting.message}")
    private String message;
}

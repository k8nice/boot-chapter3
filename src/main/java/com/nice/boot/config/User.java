package com.nice.boot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ningh
 */
@Component("user")
@Data
public class User {


    @Value("1")
    private Long id;

    @Value("nice")
    private String userName;

    @Value("感觉不会再爱了")
    private String note;


}

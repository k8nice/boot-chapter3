package com.nice.boot;

import com.nice.boot.config.AppConfig;
import com.nice.boot.config.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ningh
 */
public class TestApplication {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean(User.class);
        System.out.println(user);
    }

}

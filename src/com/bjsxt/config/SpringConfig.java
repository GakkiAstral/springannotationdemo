package com.bjsxt.config;

import com.bjsxt.dao.UsersDao;
import com.bjsxt.dao.impl.UsersDaoImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    @Qualifier("suibianDao")
    public UsersDao usersDaoInit() {
        return new UsersDaoImpl();
    }

}
